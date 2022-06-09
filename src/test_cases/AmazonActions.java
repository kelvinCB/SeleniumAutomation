package test_cases;


import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class AmazonActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebUI.initializeBrowser("FIREFOX");
		WebUI.openBrowser(StringConstants.AMAZON);
		WebUI.maximizedWindow();
		WebUI.mouseOver(ObjectConstants.HELLO_SIGN_IN);
		WebUI.delay(3);
		WebUI.click(ObjectConstants.SEARCH_BAR);
		WebUI.setText(ObjectConstants.SEARCH_BAR, "AIRPODS");
		WebUI.doubleClickIntoText(ObjectConstants.SEARCH_BAR, "airdots");
		WebUI.rightClick(ObjectConstants.HELLO_SIGN_IN);
		WebUI.soundBeep();
		WebUI.closeBrowser();
		
	}

}
