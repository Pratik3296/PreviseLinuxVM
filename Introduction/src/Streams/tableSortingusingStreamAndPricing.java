package Streams;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableSortingusingStreamAndPricing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath("(//th//span)[1]")).click(); // Clicking on Veg/fruit name for sorting purpose
		Thread.sleep(3000);	
		List<String> price;

		do {
		List<WebElement> elementList = driver.findElements(By.xpath("//tbody//tr//td[1]"));
	 price = elementList.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}
	private static String getPrice(WebElement s) {
		
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
}
