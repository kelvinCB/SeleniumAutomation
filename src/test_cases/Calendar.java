package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

import constants.StringConstants;
import controller.WebUI;

public class Calendar {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		System.setProperty(StringConstants.FIREFOX_KEY_DRIVER, StringConstants.FIREFOX_BROWSER_DRIVER);
		WebDriver driver = new FirefoxDriver();
		System.out.println("FIREFOX was initialized!");
		driver.get(StringConstants.PATH2USA_TRAVEL);
//April 23
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("May")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		//List<WebElement> dates = driver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
		
		WebUI.soundBeep();
		driver.quit();
		
	}

}