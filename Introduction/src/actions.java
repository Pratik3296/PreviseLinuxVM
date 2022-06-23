import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"))).contextClick().build()
				.perform();

	}

}
