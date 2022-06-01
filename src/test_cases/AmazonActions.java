package test_cases;

import constants.ObjectConstants;
import controller.WebUI;

public class AmazonActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebUI.initializeBrowser("FIREFOX");
		WebUI.openBrowser("https://www.amazon.com");
		WebUI.maximizedWindow();
		WebUI.mouseOver(ObjectConstants.HELLO_SIGN_IN);
		
		WebUI.soundBeep();
		
	}

}