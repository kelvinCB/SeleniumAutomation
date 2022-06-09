package test_cases;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class AlertManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebUI.initializeBrowser("EDGE");
		WebUI.openBrowser(StringConstants.AUTOMATION_PRACTICE_RAHUL);
		WebUI.maximizedWindow();
		WebUI.setText(ObjectConstants.ENTER_NAME, "Alta Gama, Nuevo Rico");
		WebUI.click(ObjectConstants.ALERT);
		WebUI.getAlertText();
		WebUI.acceptAlert();
		WebUI.setText(ObjectConstants.ENTER_NAME, "Cooperas con los federicos");
		WebUI.click(ObjectConstants.CONFIRM);
		WebUI.getAlertText();
		WebUI.dismissAlert();
		WebUI.soundBeep();
		WebUI.closeBrowser();
		
	}

}
