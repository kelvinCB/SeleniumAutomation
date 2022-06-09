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
		WebUI.click(ObjectConstants.PASSENGER_DROPDOWN);
		WebUI.doubleClick(ObjectConstants.INCREMENT_ADULT);
		WebUI.doubleClick(ObjectConstants.INCREMENT_CHILD);
		WebUI.doubleClick(ObjectConstants.INCREMENT_INFANT);
		WebUI.click(ObjectConstants.DONE_PASSENGER_DROPDOWN);
		WebUI.getText(ObjectConstants.PASSENGER_DROPDOWN);
		WebUI.click(ObjectConstants.DEPARTURE_CITY_DROPDOWN);
		WebUI.click(ObjectConstants.BHOPAL_DESTINATION);
		WebUI.click(ObjectConstants.JAIPUR_DESTINATION);
		WebUI.setText(ObjectConstants.COUNTRY_SEARCH_DROPDOWN, "in");
		WebUI.selectOptionByList(ObjectConstants.COUNTRY_SEARCH_LIST, "Ukraine");
		WebUI.check(ObjectConstants.FAMILY_AND_FRIENDS_CHECKBOX);		
		WebUI.check(ObjectConstants.SENIOR_CITIZEN_CHECKBOX);
		WebUI.uncheck(ObjectConstants.SENIOR_CITIZEN_CHECKBOX);
		WebUI.uncheck(ObjectConstants.SENIOR_CITIZEN_CHECKBOX);
		WebUI.check(ObjectConstants.FAMILY_AND_FRIENDS_CHECKBOX);
		WebUI.check(ObjectConstants.STUDEN_CHECKBOX);
		WebUI.soundBeep();
		WebUI.closeBrowser();
		
	}

}
