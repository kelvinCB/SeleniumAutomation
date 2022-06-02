package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.ObjectConstants;
import controller.WebUI;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get amount of links in a web page
		
		WebUI.initializeBrowser("FIREFOX");
		WebUI.openBrowser("http://qaclickacademy.com/practice.php");
		WebUI.maximizedWindow();
		System.out.println("Amount of Links: "+WebUI.getElementsCount(ObjectConstants.LINKS_IN_A_PAGE));
		System.out.println("Amount of Buttons: "+WebUI.getElementsCount(ObjectConstants.BUTTONS_IN_A_PAGE));
		System.out.println("Amount of Inputs: "+WebUI.getElementsCount(ObjectConstants.TEXTBOX_IN_A_PAGE));
		
		//Get amount of links in footer of web page
		System.out.println("/nAmount of Links in footer: "+WebUI.getElementsCountInSection(ObjectConstants.AUTOMATION_FOOTER, ObjectConstants.LINKS_IN_A_PAGE));
		System.out.println("Amount of Buttons in footer: "+WebUI.getElementsCountInSection(ObjectConstants.AUTOMATION_FOOTER, ObjectConstants.BUTTONS_IN_A_PAGE));
		System.out.println("Amount of Inputs in footer: "+WebUI.getElementsCountInSection(ObjectConstants.AUTOMATION_FOOTER, ObjectConstants.TEXTBOX_IN_A_PAGE));
		WebUI.soundBeep();
		WebUI.closeBrowser();

	}

}
