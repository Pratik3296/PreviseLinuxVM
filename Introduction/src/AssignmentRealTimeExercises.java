import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentRealTimeExercises {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
			
		driver.findElement(By.name("enter-name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		
		System.out.println(alert);
		if(alert.contains(opt)) {
			System.out.println("Alert msg displayed");
		}
		else
		{
			System.out.println("Alert msg not displayed");

		}
		
	}
	

}
