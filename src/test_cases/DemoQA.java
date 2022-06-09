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
		WebUI.click(ObjectConstants.ELEMENTS);
		WebUI.click(ObjectConstants.TEXT_BOX);
		WebUI.click(ObjectConstants.CHECK_BOX);
		WebUI.click(ObjectConstants.RADIO_BUTTON);
		WebUI.click(ObjectConstants.WEB_TABLES);
		WebUI.click(ObjectConstants.BUTTONS);
		WebUI.click(ObjectConstants.LINKS);
		WebUI.click(ObjectConstants.BROKEN_LINKS_IMAGES);
		WebUI.scrollToObject(ObjectConstants.UPLOAD_AND_DOWNLOADS);
		WebUI.click(ObjectConstants.UPLOAD_AND_DOWNLOADS);
		WebUI.scrollToBottom();
		WebUI.click(ObjectConstants.DYNAMIC_PROPERTIES);
		Assert.assertEquals(WebUI.getText(ObjectConstants.WILL_ENABLE_5_SECONDS), "Will enable 5 seconds");
		WebUI.soundBeep();
		WebUI.closeBrowser();
		

	}

}
