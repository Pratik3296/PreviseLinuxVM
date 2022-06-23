import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tofindnumofrowsandclmsAssignment {

	public static <WebElement> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jav\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		int coloums = driver.findElements(By.cssSelector(".table-display th")).size();
		System.out.println("Number of coloums = "+coloums);
		
		int rows = driver.findElements(By.cssSelector(".table-display tr")).size();
		System.out.println("Number of rows = "+rows);
		
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
	
		
	}

}
