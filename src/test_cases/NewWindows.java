package test_cases;


import org.openqa.selenium.WebDriver;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class NewWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = WebUI.initializeBrowser("FIREFOX");
		WebUI.openBrowser(StringConstants.PROTO_COMMERCE);
		WebUI.maximizedWindow();
		WebUI.newTab();
		WebUI.moveToTab(StringConstants.CHILDID);
		WebUI.openBrowser(StringConstants.AUTOMATION_ACADEMY_RAHUL);
		String firstCourseName = driver.findElements(ObjectConstants.FIRST_COURSE_LISTED).get(1).getText();
		WebUI.moveToTab(StringConstants.PARENTID);
		WebUI.setText(ObjectConstants.NAME_TEXTBOX, firstCourseName);
		WebUI.takeScreenShot(ObjectConstants.NAME_TEXTBOX, "Files/screenshots/nameTextBox.png");
		WebUI.soundBeep();
		WebUI.closeBrowser();
		

	}

}
