package test_cases;

import constants.ObjectConstants;
import constants.StringConstants;
import controller.WebUI;

public class FlightBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebUI.initializeBrowser("CHROME");
		WebUI.openBrowser(StringConstants.FLIGHT_RAHUL);
		WebUI.maximizedWindow();
		WebUI.selectOptionByIndex(ObjectConstants.CURRENCY_DROPDOWN, 2);
		WebUI.selectOptionByLabel(ObjectConstants.CURRENCY_DROPDOWN, "USD");
		WebUI.selectOptionByValue(ObjectConstants.CURRENCY_DROPDOWN, "INR");
		WebUI.clic(ObjectConstants.PASSENGER_DROPDOWN);
		WebUI.doubleClic(ObjectConstants.INCREMENT_ADULT);
		WebUI.doubleClic(ObjectConstants.INCREMENT_CHILD);
		WebUI.doubleClic(ObjectConstants.INCREMENT_INFANT);
		WebUI.clic(ObjectConstants.DONE_PASSENGER_DROPDOWN);
		WebUI.getText(ObjectConstants.PASSENGER_DROPDOWN);
		WebUI.clic(ObjectConstants.DEPARTURE_CITY_DROPDOWN);
		WebUI.clic(ObjectConstants.BHOPAL_DESTINATION);
		WebUI.clic(ObjectConstants.JAIPUR_DESTINATION);
		WebUI.setText(ObjectConstants.COUNTRY_SEARCH_DROPDOWN, "in");
		WebUI.selectOptionByList(ObjectConstants.COUNTRY_SEARCH_LIST, "Ukraine");
		WebUI.check(ObjectConstants.FAMILY_AND_FRIENDS_CHECKBOX);		
		WebUI.check(ObjectConstants.SENIOR_CITIZEN_CHECKBOX);
		WebUI.uncheck(ObjectConstants.SENIOR_CITIZEN_CHECKBOX);
		WebUI.uncheck(ObjectConstants.SENIOR_CITIZEN_CHECKBOX);
		WebUI.check(ObjectConstants.FAMILY_AND_FRIENDS_CHECKBOX);
		WebUI.check(ObjectConstants.STUDEN_CHECKBOX);
		WebUI.closeBrowser();
		WebUI.soundBeep();
	}

}
