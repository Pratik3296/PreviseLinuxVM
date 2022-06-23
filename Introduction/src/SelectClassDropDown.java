import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption2")).click();
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select a = new Select(dropdown);
		a.selectByVisibleText(opt);
		
	}

}
