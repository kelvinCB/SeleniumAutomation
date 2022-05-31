package test_cases;

import constants.ObjectConstants;
import controller.WebUI;

public class AlertManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebUI.initializeBrowser("EDGE");
		WebUI.openBrowser("https://rahulshettyacademy.com/AutomationPractice/");
		WebUI.maximizedWindow();
		WebUI.setText(ObjectConstants.ENTER_NAME, "Alta Gama, Nuevo Rico");
		WebUI.clic(ObjectConstants.ALERT);
		WebUI.getAlertText();
		WebUI.acceptAlert();
		WebUI.setText(ObjectConstants.ENTER_NAME, "Cooperas con los federicos");
		WebUI.clic(ObjectConstants.CONFIRM);
		WebUI.getAlertText();
		WebUI.dismissAlert();
		WebUI.soundBeep();
		WebUI.closeBrowser();
		
	}

}
