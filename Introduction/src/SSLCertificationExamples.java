import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificationExamples {

	public static void main(String[] args) {

		
		DesiredCapabilities ch = new DesiredCapabilities();
		ch.acceptInsecureCerts();
		
		
		// This is for creating our customized browser.
		ChromeOptions a = new ChromeOptions();
		a.merge(ch); // Passing the ch[DesiredCapabilities] to our customized browser.
		
		WebDriver driver  = new ChromeDriver(a); // passing 'a' to the local chrome driver which includes our 
		                                         // DesiredCapabilities and customized browser
		
		driver.get("xyz");
	
	}

}
