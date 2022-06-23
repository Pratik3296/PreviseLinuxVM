import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();

		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;

			}

		}
	}

}
