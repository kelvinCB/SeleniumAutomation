package test_cases;
import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebUI.initializeBrowser("CHROME");
		WebUI.openBrowser(StringConstants.ORANGE_HRM);
		WebUI.maximizedWindow();
		WebUI.setText(ObjectConstants.USERNAME, "Admin");
		WebUI.setText(ObjectConstants.PASSWORD, "admin123");
		WebUI.click(ObjectConstants.LOGIN);
		WebUI.soundBeep();
		WebUI.closeBrowser();
		

	}

}
