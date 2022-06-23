package Streams;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verifyTabelUsingJavaStream {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click(); // CLick on Top Deals
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it =window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
	
		
		 List<WebElement> totalelement = driver.findElements(By.xpath("//tbody//tr//td[1]"));
		List<WebElement> Veggies =  totalelement.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		
		Assert.assertEquals(totalelement.size(), Veggies.size());
	}

}
