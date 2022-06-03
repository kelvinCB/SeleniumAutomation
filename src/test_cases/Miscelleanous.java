package test_cases;

import constants.StringConstants;
import controller.WebUI;

public class Miscelleanous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebUI.initializeBrowser("EDGE");
		WebUI.openBrowser(StringConstants.GOOGLE);
		WebUI.deleteAllCookies();
		for(int i = 0; i<10; i++) WebUI.takeScreenShot("Files/screenshot"+i+".png");
		WebUI.soundBeep();
		WebUI.closeBrowser();
		

	}

}
