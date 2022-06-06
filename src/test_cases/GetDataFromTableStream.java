package test_cases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class GetDataFromTableStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty(StringConstants.CHROME_KEY_DRIVER, StringConstants.CHROME_BROWSER_DRIVER);
		WebDriver driver = new ChromeDriver();
		System.out.println("CHROME was initialized!");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("Implicit Wait is: " + 5 + " seconds.");
		
		driver.get(StringConstants.GREEN_KART);
		System.out.println("Browser was opened in: " + StringConstants.GREEN_KART);
		driver.manage().window().maximize();
		
		driver.findElement(ObjectConstants.TOP_DEALS).click();
		System.out.println("Element: " + ObjectConstants.TOP_DEALS + " clicked");
		
		//Switch to new childWindow
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		
		//Click on column fruit name to sort it
		driver.findElement(ObjectConstants.FRUIT_NAME_HEADER).click();
		System.out.println("Element: " + ObjectConstants.FRUIT_NAME_HEADER + " clicked");
		
		//Get all Web table elements in a WebElement list -> Element list
		List<WebElement> elementList = driver.findElements(ObjectConstants.FRUIT_NAME_COLUMN);
		
		//Get all names from WebElement list
		//Add in a new list those names 
		List<String> fruitNamesList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort new list names
		List<String> fruitNamesListSorted = fruitNamesList.stream().sorted().collect(Collectors.toList());
		
		//Assert that web page list sorted and my sorted logic are equals
		Assert.assertTrue(fruitNamesList.equals(fruitNamesListSorted));
		
		//Goal: Get price of an specific fruit/veg
		//Scan column of fruits to get Text
		//Move to the right in the table to get the price of specific fruit/veg
		//Get price of specific fruit/veg.
		//Pagination to search the data
		
		List<String> price;
		
		do {
			List<WebElement> rows = driver.findElements(ObjectConstants.FRUIT_NAME_COLUMN);
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> s.findElement(By.xpath("following-sibling::td[1]")).getText()).collect(Collectors.toList());
			price.forEach(s -> System.out.println(s));
		
			if(price.size()<1) driver.findElement(ObjectConstants.NEXT_PAGE_TABLE).click();
		
			}while(price.size()<1); 
		 
		
		
		WebUI.soundBeep();
		//driver.quit();

//		
//		//Getting all data from table and using only numbers in the table
//		WebElement tableFixedDriver = driver.findElement(ObjectConstants.TABLE_FIXED_HEADER);
//		int dataTable = tableFixedDriver.findElements(ObjectConstants.CELLS_IN_A_PAGE).size();

	}


}
