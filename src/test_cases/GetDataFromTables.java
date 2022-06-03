package test_cases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class GetDataFromTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty(StringConstants.FIREFOX_KEY_DRIVER, StringConstants.FIREFOX_BROWSER_DRIVER);
		WebDriver driver = new FirefoxDriver();
		System.out.println("FIREFOX was initialized!");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Implicit Wait is: " + 10 + " seconds.");
		
		driver.get(StringConstants.AUTOMATION_PRACTICE_RAHUL);
		System.out.println("Browser was opened in: " + StringConstants.AUTOMATION_PRACTICE_RAHUL);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(ObjectConstants.TABLE_FIXED_HEADER);
		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("Object scrolled: " + ObjectConstants.TABLE_FIXED_HEADER);
		
		//Getting all data from table and using only numbers in the table
		WebElement tableFixedDriver = driver.findElement(ObjectConstants.TABLE_FIXED_HEADER);
		int dataTable = tableFixedDriver.findElements(ObjectConstants.CELLS_IN_A_PAGE).size();
		 List<Integer> onlyNumbers = new ArrayList<Integer>();
		for(int i = 0; i<dataTable;i++) {
			if(WebUI.isNumeric(tableFixedDriver.findElements(ObjectConstants.CELLS_IN_A_PAGE).get(i).getText())) {
			Integer d = Integer.parseInt(tableFixedDriver.findElements(ObjectConstants.CELLS_IN_A_PAGE).get(i).getText());
			onlyNumbers.add(d);
			}
		}
		
		//Adding all numbers
		System.out.println("Numbers");
		int totalAmount = 0;
		for(Integer numbers : onlyNumbers) {
			System.out.println(numbers);
			totalAmount+=numbers;
		}
		
		//Asserting results
		System.out.println("Total Amount: "+totalAmount);
		Assert.assertEquals(totalAmount+"", WebUI.extractOnlyNumbers(driver.findElement(ObjectConstants.TOTAL_AMOUNT_COLLECTED).getText()));
		
		WebUI.soundBeep();
		driver.quit();
		
	}

}
