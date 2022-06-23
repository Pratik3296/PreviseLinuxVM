import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesAndDragNDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\SeleniumProjects\\Introduction\\src\\learining\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("https://jqueryui.com/droppable//");
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.xpath("(//div[@id='draggable'])[1]"));
		
		WebElement target = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();

	}

}
