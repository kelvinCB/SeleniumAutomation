package test_cases;


import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class FriendlyLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebUI.initializeBrowser("EDGE");
		WebUI.openBrowser(StringConstants.PROTO_COMMERCE);
		WebUI.maximizedWindow();
		
		// Using Above locator
		System.out.println(WebUI.aboveLocator(ObjectConstants.LABELS_IN_A_PAGE, ObjectConstants.NAME_TEXTBOX).getText());
		System.out.println(WebUI.aboveLocator(ObjectConstants.LABELS_IN_A_PAGE, ObjectConstants.EMAIL_TEXTBOX).getText());
		System.out.println(WebUI.aboveLocator(ObjectConstants.LABELS_IN_A_PAGE, ObjectConstants.PASSWORD_TEXTBOX).getText());
		
		
		// Using Below locator
		WebUI.belowLocator(ObjectConstants.TEXTBOXS_IN_A_PAGE, ObjectConstants.NAME_LABEL).sendKeys("Kelvin La Para");
		WebUI.belowLocator(ObjectConstants.TEXTBOXS_IN_A_PAGE, ObjectConstants.EMAIL_LABEL).sendKeys("kelvinr02@hotmail.com");
		WebUI.belowLocator(ObjectConstants.TEXTBOXS_IN_A_PAGE, ObjectConstants.PASSWORD_LABEL).sendKeys("password");

		// Using LeftOf locator
		WebUI.leftOfLocator(ObjectConstants.TEXTBOXS_IN_A_PAGE, ObjectConstants.ICE_CREAM_LABEL).click();
		
		// Using RightOf locator
		System.out.println(WebUI.rightOfLocator(ObjectConstants.LABELS_IN_A_PAGE, ObjectConstants.STUDENT_RADIOBUTTON).getText());
		
		WebUI.soundBeep();
		WebUI.closeBrowser();
	}

}
