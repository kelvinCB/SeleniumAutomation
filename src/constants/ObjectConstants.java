package constants;

import org.openqa.selenium.By;

public class ObjectConstants {
	
	/**************************/
	/** ORANGE HRM  / Login  **/
	/**************************/
	
	public static final By USERNAME 						= By.id("txtUsername");
	public static final By PASSWORD 						= By.id("txtPassword");
	public static final By LOGIN 							= By.id("btnLogin");

	/**********************/
	/** DEMO QA  / MAIN  **/
	/**********************/
	
	public static final By ELEMENTS							= By.xpath("//div/h5[.='Elements']");
	
	
	/**************************/
	/** DEMO QA  / ELEMENTS  **/
	/**************************/
	
	public static final By TEXT_BOX							= By.xpath("//span[normalize-space()='Text Box']");
	public static final By CHECK_BOX						= By.xpath("//span[text()='Check Box']");
	public static final By RADIO_BUTTON						= By.xpath("//span[.='Radio Button']");
	public static final By WEB_TABLES						= By.xpath("//span[normalize-space()='Web Tables']");
	public static final By BUTTONS							= By.xpath("//span[normalize-space()='Buttons']");
	public static final By LINKS							= By.xpath("//span[normalize-space()='Links']");
	public static final By BROKEN_LINKS_IMAGES  			= By.xpath("//span[normalize-space()='Broken Links - Images']");
	public static final By UPLOAD_AND_DOWNLOADS				= By.xpath("//span[normalize-space()='Upload and Download']");
	public static final By DYNAMIC_PROPERTIES				= By.xpath("//span[normalize-space()='Dynamic Properties']");
	
	
	/**************************/
	/** DEMO QA  / ELEMENTS  **/
	/**************************/
	
	public static final By WILL_ENABLE_5_SECONDS		    = By.id("enableAfter"); 
	
	
	/**********************************/
	/** FLIGHT BOOKING  / SELECTION  **/
	/**********************************/
	
	public static final By CURRENCY_DROPDOWN			    = By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"); 
	public static final By PASSENGER_DROPDOWN				= By.id("divpaxinfo");
	public static final By INCREMENT_ADULT				 	= By.id("hrefIncAdt");
	public static final By DECREMENT_ADULT				 	= By.id("hrefDecChd");
	public static final By INCREMENT_CHILD				 	= By.id("hrefIncChd");
	public static final By DECREMENT_CHILD				 	= By.id("hrefDecChd");
	public static final By INCREMENT_INFANT				 	= By.id("hrefIncInf");
	public static final By DECREMENT_INFANT				 	= By.id("hrefDecInf");
	public static final By DONE_PASSENGER_DROPDOWN			= By.id("btnclosepaxoption");
	public static final By DEPARTURE_CITY_DROPDOWN 			= By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	public static final By BHOPAL_DESTINATION				= By.xpath("//a[@value='BHO']");
	public static final By JAIPUR_DESTINATION				= By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JAI']");
	
	
}
