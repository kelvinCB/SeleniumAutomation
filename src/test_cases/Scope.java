package test_cases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get amount of links in a web page
	  //  WebUI.initializeBrowser("CHROME");
		for(int j = 0; j<100;j++) {
		System.setProperty(StringConstants.FIREFOX_KEY_DRIVER, StringConstants.FIREFOX_BROWSER_DRIVER);
		WebDriver driver = new FirefoxDriver();
		System.out.println("FIREFOX was initialized!");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Implicit Wait is: " + 10 + " seconds.");
		
		driver.get(StringConstants.AUTOMATION_PRACTICE_RAHUL);
		System.out.println("Browser was opened in: " + StringConstants.AUTOMATION_PRACTICE_RAHUL);
		driver.manage().window().maximize();
		//WebUI.openBrowser("http://qaclickacademy.com/practice.php");
		//WebUI.maximizedWindow();

//		System.out.println("Amount of Links: "+WebUI.getElementsCount(ObjectConstants.LINKS_IN_A_PAGE));
//		System.out.println("Amount of Buttons: "+WebUI.getElementsCount(ObjectConstants.BUTTONS_IN_A_PAGE));
//		System.out.println("Amount of Inputs: "+WebUI.getElementsCount(ObjectConstants.TEXTBOX_IN_A_PAGE));
		
		//Get amount of links in footer of web page
//		System.out.println("Amount of Links in footer: "+WebUI.getElementsCountInSection(ObjectConstants.AUTOMATION_FOOTER, ObjectConstants.LINKS_IN_A_PAGE));
//		System.out.println("Amount of Buttons in footer: "+WebUI.getElementsCountInSection(ObjectConstants.AUTOMATION_FOOTER, ObjectConstants.BUTTONS_IN_A_PAGE));
//		System.out.println("Amount of Inputs in footer: "+WebUI.getElementsCountInSection(ObjectConstants.AUTOMATION_FOOTER, ObjectConstants.TEXTBOX_IN_A_PAGE));
		
		//Open in a new Tab all links in footer
		WebElement footerdriver = driver.findElement(ObjectConstants.AUTOMATION_FOOTER);
		int links =  footerdriver.findElements(ObjectConstants.LINKS_IN_A_PAGE).size();
		
		for(int i =1;i<links;i++) {
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerdriver.findElements(ObjectConstants.LINKS_IN_A_PAGE).get(i).sendKeys(clickOnLinks);	
			WebUI.delay(2);
		}
		
		//Get title of every Tab
		Set<String> windows = driver.getWindowHandles();//Total amount of tabs in the browser
		Iterator<String> it = windows.iterator(); 
		int i = 1;
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println("Title "+i+": "+driver.getTitle());
			i++;
			WebUI.delay(2);
		}
		
		WebUI.soundBeep();
		driver.quit();
		System.out.println("Browser was closed!");

	}
		
	}

}
