package test_cases;

import org.testng.Assert;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebUI.initializeBrowser("FIREFOX");
		WebUI.openBrowser(StringConstants.JQUERY_TOP_AUTOMATION);
		WebUI.maximizedWindow();
		WebUI.switchToFrame(ObjectConstants.DROPPABLE_FRAME);
		WebUI.verifyElementPresent(ObjectConstants.DROP_HERE_TEXT);
		WebUI.dragAndDrop(ObjectConstants.DRAG_OBJECT, ObjectConstants.DROP_HERE_TEXT);
		Assert.assertEquals(WebUI.getText(ObjectConstants.DROPPED_TEXT), "Dropped!");
		WebUI.soundBeep();
		WebUI.closeBrowser();

	}

}
