package test_cases;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebUI.initializeBrowser("FIREFOX");
		WebUI.openBrowser(StringConstants.GREEN_KART);
		WebUI.maximizedWindow();

		
		//Clic in generics products
		WebUI.identifyGenericElement(ObjectConstants.CART_PRODUCTS, ObjectConstants.ADD_TO_CART);
		
		WebUI.clic(ObjectConstants.SHOPPING_CART);
		WebUI.clic(ObjectConstants.PROCEED_TO_CHECKOUT);
		WebUI.setText(ObjectConstants.PROMO_CODE, "rahulshettyacademy");
		WebUI.clic(ObjectConstants.APPLY_CODE);
		WebUI.verifyElementPresent(ObjectConstants.CODE_APPLIED);
		WebUI.soundBeep();
		WebUI.closeBrowser();
		


	}

}
