import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitandExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItem(driver);
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
//		Thread.sleep(5000);

		// Explicit Wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));

		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

	}

	public static void addItem(WebDriver driver) {
		List<WebElement> options = driver.findElements(By.xpath("//h4[@class='product-name']"));

		String[] itemsNedded = { "Beetroot", "Brinjal", "Beans" };
		List listedItems = Arrays.asList(itemsNedded);
		int j = 0;
		for (int i = 0; i < options.size(); i++) {
			String[] name = options.get(i).getText().split("-");
			String formatedName = name[0].trim();

			if (listedItems.contains(formatedName)) {
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNedded.length) {
					break;
				}
			}

		}
	}

}
