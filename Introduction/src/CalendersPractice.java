import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendersPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(3000);
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
//		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//tr[1]//th[2]")).getText().contains("September"));
//		
//		{
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//div[@class='datepicker-days']//tr[1]//th[3]")).click();
//			
//		}
		
		//driver.findElement(By.xpath("//div[@class='datepicker-days']//tr[1]//th[2]"));
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
			 String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("31"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
