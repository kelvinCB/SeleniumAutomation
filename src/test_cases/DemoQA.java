package test_cases;

import org.testng.Assert;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class DemoQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebUI.initializeBrowser("EDGE");
		WebUI.openBrowser(StringConstants.DEMO_QA_URL);
		WebUI.maximizedWindow();
		WebUI.clic(ObjectConstants.ELEMENTS);
		WebUI.clic(ObjectConstants.TEXT_BOX);
		WebUI.clic(ObjectConstants.CHECK_BOX);
		WebUI.clic(ObjectConstants.RADIO_BUTTON);
		WebUI.clic(ObjectConstants.WEB_TABLES);
		WebUI.clic(ObjectConstants.BUTTONS);
		WebUI.clic(ObjectConstants.LINKS);
		WebUI.clic(ObjectConstants.BROKEN_LINKS_IMAGES);
		WebUI.scrollToObject(ObjectConstants.UPLOAD_AND_DOWNLOADS);
		WebUI.clic(ObjectConstants.UPLOAD_AND_DOWNLOADS);
		WebUI.scrollToBottom();
		WebUI.clic(ObjectConstants.DYNAMIC_PROPERTIES);
		Assert.assertEquals(WebUI.getText(ObjectConstants.WILL_ENABLE_5_SECONDS), "Will enable 5 seconds");
		WebUI.soundBeep();
		WebUI.closeBrowser();
		

	}

}
