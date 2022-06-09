package constants;

import org.openqa.selenium.By;

public class ObjectConstants {
	
	/**************************/
	/** COMMONS  / ELEMENTS  **/
	/**************************/
	
	public static final By LINKS_IN_A_PAGE					= By.tagName("a");
	public static final By BUTTONS_IN_A_PAGE				= By.tagName("button");
	public static final By TEXTBOX_IN_A_PAGE				= By.tagName("input");
	public static final By CELLS_IN_A_PAGE					= By.tagName("td");
	
	
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
	public static final By COUNTRY_SEARCH_DROPDOWN			= By.id("autosuggest");
	public static final By COUNTRY_SEARCH_LIST				= By.cssSelector("li[class='ui-menu-item'] a");
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
	public static final By FAMILY_AND_FRIENDS_CHECKBOX		= By.cssSelector("input[id*='friendsandfamily']");
	public static final By SENIOR_CITIZEN_CHECKBOX			= By.cssSelector("input[id*='SeniorCitizenDiscount']");
	public static final By STUDEN_CHECKBOX					= By.cssSelector("input[id*='StudentDiscount']");
	
	/************************************/
	/** AUTOMATION PRACTICE  / ALERTS  **/
	/************************************/
	
	public static final By ENTER_NAME				 		= By.id("name");
	public static final By ALERT				 			= By.id("alertbtn");
	public static final By CONFIRM				 			= By.id("confirmbtn");
	public static final By AUTOMATION_FOOTER				= By.id("gf-BIG");
	public static final By TABLE_FIXED_HEADER				= By.xpath("//div[@class='right-align'] //tbody");
	public static final By TOTAL_AMOUNT_COLLECTED			= By.cssSelector(".totalAmount");
	public static final By LINKS_IN_FOOTER					= By.cssSelector("li[class='gf-li'] a");
	
	/**********************************/
	/** SHOPPING CART  / GREEN KART  **/
	/**********************************/
	
	public static final By CART_PRODUCTS					= By.cssSelector("h4.product-name");
	public static final By ADD_TO_CART						= By.xpath("//div[@class='product-action']");
	public static final By SHOPPING_CART					= By.cssSelector("img[alt='Cart']");
	public static final By PROCEED_TO_CHECKOUT				= By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	public static final By PROMO_CODE						= By.xpath("//input[@class='promoCode']");
	public static final By APPLY_CODE 						= By.xpath("//button[@class='promoBtn']");
	public static final By CODE_APPLIED						= By.cssSelector("span[class='promoInfo']");
	public static final By PLACE_ORDER						= By.xpath("//button[.='Place Order']");
	public static final By TOP_DEALS						= By.xpath("//a[text()='Top Deals']");
	public static final By FRUIT_NAME_HEADER				= By.xpath("//span[contains(text(), 'fruit name')]");
	public static final By TOP_DEALS_TABLE					= By.xpath("//table[@class='table table-bordered'] //tbody");
	public static final By FRUIT_NAME_COLUMN				= By.xpath("//tr/td[1]");
	public static final By SEARCH_FRUIT						= By.id("search-field");
	public static final By NEXT_PAGE_TABLE					= By.cssSelector("[aria-label='Next']");
	
	/************************/
	/** AMAZON  / ACTIONS  **/
	/************************/
		
	public static final By HELLO_SIGN_IN					= By.id("nav-link-accountList-nav-line-1");
	public static final By SEARCH_BAR						= By.cssSelector("input[id*='searchtextbox']");
	
	/***********************************/
	/** SWITCH TAB  / LOGIN PRACTISE  **/
	/***********************************/
	
	public static final By NEW_TAB_LINK						= By.className("blinkingText");
	public static final By MENTOSHIP						= By.linkText("Mentorship");
	public static final By USERNAME2						= By.id("username");
	public static final By MULTIPLE_WINDOWS					= By.xpath("//a[normalize-space()='Multiple Windows']");
	public static final By CLIC_HERE						= By.xpath("//a[normalize-space()='Click Here']");
	public static final By NEW_WINDOW_TEXT					= By.xpath("//h3[normalize-space()='New Window']");
	public static final By OPENING_NEW_WINDOW_TEXT			= By.xpath("//h3[normalize-space()='Opening a new window']");
	
	/******************************/
	/** FRAMES  / DRAG AND DROP  **/
	/******************************/
	
	public static final By DROPPABLE_FRAME					= By.cssSelector("iframe[class='demo-frame']");
	public static final By DRAG_OBJECT						= By.xpath("//p[.='Drag me to my target']");
	public static final By DROP_HERE_TEXT					= By.xpath("//p[normalize-space()='Drop here']");
	public static final By DROPPED_TEXT						= By.cssSelector("div[id='droppable'] p");
	
	/******************************/
	/** FRAMES  / DRAG AND DROP  **/
	/******************************/
	
	public static final By NAME_LABEL						= By.cssSelector("[name='name']");
	public static final By EMAIL_LABEL						= By.cssSelector("[name='email']");
	public static final By PASSWORD_LABEL					= By.cssSelector("[type='password']");
	
	
	
}
