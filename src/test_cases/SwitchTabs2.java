package test_cases;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class SwitchTabs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebUI.initializeBrowser("FIREFOX");
		WebUI.openBrowser("https://the-internet.herokuapp.com");
		WebUI.maximizedWindow();
		WebUI.clic(ObjectConstants.MULTIPLE_WINDOWS);
		WebUI.clic(ObjectConstants.CLIC_HERE);
		WebUI.moveToTab(StringConstants.CHILDID);
		System.out.println(WebUI.getText(ObjectConstants.NEW_WINDOW_TEXT));
		WebUI.moveToTab(StringConstants.PARENTID);
		System.out.println(WebUI.getText(ObjectConstants.OPENING_NEW_WINDOW_TEXT));
		WebUI.soundBeep();
		WebUI.closeBrowser();
		
	}

}
