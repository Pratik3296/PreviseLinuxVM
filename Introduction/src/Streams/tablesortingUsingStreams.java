package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tablesortingUsingStreams {

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
		driver.findElement(By.xpath("(//th//span)[1]")).click();
		Thread.sleep(3000);	
		List<WebElement> elementList = driver.findElements(By.xpath("//tbody//tr//td[1]"));
		
		
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		Assert.assertTrue(originalList.equals(sortedList));
	}

}
