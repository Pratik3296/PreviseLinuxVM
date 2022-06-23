import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificationPractice {

	public static void main(String[] args) {

		
		DesiredCapabilities ch = new DesiredCapabilities();
		ch.acceptInsecureCerts();
		
		
		ChromeOptions a = new ChromeOptions();
		a.merge(ch);
		
		WebDriver driver = new ChromeDriver(a);
	}

}
