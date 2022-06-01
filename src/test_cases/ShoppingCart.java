package test_cases;

import constants.ObjectConstants;
import controller.WebUI;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebUI.initializeBrowser("EDGE");
		WebUI.openBrowser("https://rahulshettyacademy.com/seleniumPractise/");
		WebUI.maximizedWindow();
		WebUI.delay(10);
		
		//Clic in generics products
		WebUI.identifyGenericElement(ObjectConstants.CART_PRODUCTS, ObjectConstants.ADD_TO_CART);
		
		WebUI.clic(ObjectConstants.SHOPPING_CART);
		WebUI.clic(ObjectConstants.PROCEED_TO_CHECKOUT);


	}

}
