package test_cases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import constants.StringConstants;
import controller.WebUI;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		System.setProperty(StringConstants.FIREFOX_KEY_DRIVER, StringConstants.FIREFOX_BROWSER_DRIVER);
		WebDriver driver = new FirefoxDriver(options);
		System.out.println("FIREFOX was initialized!");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Implicit Wait is: " + 10 + " seconds.");
		
		driver.get(StringConstants.BAD_SSL);
		System.out.println("Browser was opened in: " + StringConstants.BAD_SSL);
		driver.manage().window().maximize();
		
		System.out.println("Page title: "+driver.getTitle());
		WebUI.soundBeep();
		driver.quit();

	}

}
