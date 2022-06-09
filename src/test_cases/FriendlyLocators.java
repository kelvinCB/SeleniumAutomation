package test_cases;


import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class FriendlyLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = WebUI.initializeBrowser("EDGE");
		WebUI.openBrowser(StringConstants.PROTO_COMMERCE);
		WebUI.maximizedWindow();
		
		// Using Above locator
		System.out.println(driver.findElement(with(By.tagName("label")).above(driver.findElement(ObjectConstants.NAME_LABEL))).getText());
		System.out.println(driver.findElement(with(By.tagName("label")).above(driver.findElement(ObjectConstants.EMAIL_LABEL))).getText());
		System.out.println(driver.findElement(with(By.tagName("label")).above(driver.findElement(ObjectConstants.PASSWORD_LABEL))).getText());
		
		// Using Below locator
		driver.findElement(with(By.tagName("input")).below(driver.findElement(By.xpath("//label[.='Email']")))).sendKeys("kelvinr02@hotmail.com");
		driver.findElement(with(By.tagName("input")).below(driver.findElement(By.xpath("//label[.='Password']")))).sendKeys("kelvinr02@hotmail.com");
		
		WebUI.soundBeep();
		WebUI.closeBrowser();
	}

}
