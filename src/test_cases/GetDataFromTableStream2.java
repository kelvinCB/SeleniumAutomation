package test_cases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class GetDataFromTableStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = WebUI.initializeBrowser("FIREFOX");
		WebUI.openBrowser(StringConstants.GREEN_KART);
		WebUI.maximizedWindow();
	
		WebUI.click(ObjectConstants.TOP_DEALS);
		
		//Switch to new childWindow
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String childID = it.next();
		childID = it.next();
		driver.switchTo().window(childID);
		
		WebUI.setText(ObjectConstants.SEARCH_FRUIT, "Rice");

		List<WebElement> veggies=driver.findElements(ObjectConstants.FRUIT_NAME_COLUMN);
		List<WebElement> filteredList = veggies.stream().filter(veggie -> veggie.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filteredList.size());

		WebUI.soundBeep();
		WebUI.closeBrowser();
	}


}
