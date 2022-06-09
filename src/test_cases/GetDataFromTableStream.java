package test_cases;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class GetDataFromTableStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = WebUI.initializeBrowser("CHROME");
		
		WebUI.openBrowser(StringConstants.GREEN_KART);
		WebUI.maximizedWindow();
		WebUI.click(ObjectConstants.TOP_DEALS);
				
		//Switch to new childWindow
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String childID = it.next();
		childID = it.next();
		driver.switchTo().window(childID);
		
		//Click on column fruit name to sort it
		WebUI.click(ObjectConstants.FRUIT_NAME_HEADER);
		
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
		WebUI.closeBrowser();

//		
//		//Getting all data from table and using only numbers in the table
//		WebElement tableFixedDriver = driver.findElement(ObjectConstants.TABLE_FIXED_HEADER);
//		int dataTable = tableFixedDriver.findElements(ObjectConstants.CELLS_IN_A_PAGE).size();

	}


}
