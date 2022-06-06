package test_cases;

import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;
public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions options2 = new ChromeOptions();
		options2.setAcceptInsecureCerts(true);
		options2.addArguments("start-maximized");
		System.setProperty(StringConstants.CHROME_KEY_DRIVER, StringConstants.CHROME_BROWSER_DRIVER);
		WebDriver driver = new ChromeDriver(options2);
		System.out.println("CHROME was initialized!");

		driver.get(StringConstants.AUTOMATION_PRACTICE_RAHUL);
		System.out.println("Browser was opened in: " + StringConstants.AUTOMATION_PRACTICE_RAHUL);

		// Goal -> Knows what links are broken in my footer section

		// Step 1 - Create a list of links to test
		List<WebElement> links = driver.findElements(ObjectConstants.LINKS_IN_FOOTER);
		SoftAssert a = new SoftAssert();

		for (WebElement link : links) {

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int respCode = conn.getResponseCode();
	        System.out.println(respCode);

	        a.assertTrue(respCode<400, "The link with Text "+link.getText()+" is broken with code " +respCode);

		}
		a.assertAll();
		WebUI.soundBeep();
		WebUI.closeBrowser();
	}

}
