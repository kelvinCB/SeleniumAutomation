package test_cases;

import java.time.Duration;


//import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		
		//Chrome
		ChromeOptions options2 = new ChromeOptions();
		options2.setAcceptInsecureCerts(true);
		options2.addArguments("start-maximized");
		//options2.addExtensions(null);
//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("IPAddress:4488");
//		options2.setCapability("proxy", proxy);
		System.setProperty(StringConstants.CHROME_KEY_DRIVER, StringConstants.CHROME_BROWSER_DRIVER);
		WebDriver driver2 = new ChromeDriver(options2);
		System.out.println("CHROME was initialized!");
		
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Implicit Wait is: " + 10 + " seconds.");
		
		driver2.get(StringConstants.BAD_SSL);
		System.out.println("Browser was opened in: " + StringConstants.BAD_SSL);
	//	driver2.manage().window().maximize();
		
		System.out.println("Page title: "+driver2.getTitle());
		WebUI.soundBeep();
		//driver2.quit();
		

		

	}

}
