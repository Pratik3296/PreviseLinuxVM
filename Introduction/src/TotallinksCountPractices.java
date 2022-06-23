import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotallinksCountPractices {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement clmdriver= footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		
		System.out.println(clmdriver.findElements(By.tagName("a")).size());
		
		
		
		for(int i=1;i<clmdriver.findElements(By.tagName("a")).size();i++)
		{
			String cmd = Keys.chord(Keys.CONTROL,Keys.ENTER);
			clmdriver.findElements(By.tagName("a")).get(i).sendKeys(cmd);
			Thread.sleep(5000);
			
		}
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while(it.hasNext())
			
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
