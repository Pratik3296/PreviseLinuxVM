package learining;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Jav\\SeleniumProjects\\LearningTest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@aria-label='Start my free trial with Salesforce CRM']")).click();
		Thread.sleep(5000);		
		
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Prateek");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Prateek");
		Thread.sleep(5000);	
		driver.close();
		Thread.sleep(5000);	
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath("//a[@aria-label='Start my free trial with Salesforce CRM']")).click();



		
	}

}
