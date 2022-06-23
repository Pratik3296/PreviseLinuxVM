import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AddingIntoCart {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setBrowserName("chrome");
//		dc.setPlatform(Platform.WINDOWS);
//		WebDriver driver  = new RemoteWebDriver(new URL("http://192.168.1.6:4444/wd/hub"),dc);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// First we took list of all items available in the webpage
		List<WebElement> options = driver.findElements(By.xpath("//h4[@class='product-name']"));

		// We have declared a String to pass the items which we want to add in cart
		String[] itemsneed = { "Cucumber", "Brocolli", "Carrot" };
		int j = 0;

		for (int i = 0; i < options.size(); i++) {
			String[] name = options.get(i).getText().split("-");
			String formatedName = name[0].trim();

			List itemsNeededList = Arrays.asList(itemsneed);
			if (itemsNeededList.contains(formatedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == 3) {
					break;
				}
			}
		}

	}
}
