import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdownPractice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("https://jqueryui.com/droppable//");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDrop(source, target).build().perform();
		
		
	}

}
