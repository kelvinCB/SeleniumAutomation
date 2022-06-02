package test_cases;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class SwitchTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebUI.initializeBrowser("FIREFOX");
		WebUI.openBrowser("https://rahulshettyacademy.com/loginpagePractise/#");
		WebUI.maximizedWindow();
		WebUI.clic(ObjectConstants.NEW_TAB_LINK);
		WebUI.moveToTab(StringConstants.CHILDID);
		System.out.println(WebUI.getText(ObjectConstants.FEATURED_COURSES));
		WebUI.moveToTab(StringConstants.PARENTID);
		WebUI.setText(ObjectConstants.USERNAME2, "KELVINWASHERE");
		WebUI.soundBeep();
		//WebUI.closeBrowser();

	}

}
