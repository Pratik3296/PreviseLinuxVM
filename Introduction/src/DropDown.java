import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement staticdropdowm = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdowm);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(1000);

//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(1000);
//		 int i = 1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
//		for(int i=1;i<5;i++)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
//		driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[1]")).click();
//		
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
