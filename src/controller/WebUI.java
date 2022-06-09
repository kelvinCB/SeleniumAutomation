package controller;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.Select;


import constants.StringConstants;

public class WebUI {

	private static WebDriver driver;
	private static JavascriptExecutor js;

	public static WebDriver initializeBrowser(String browser) {

		switch (browser) {
		case "OPERA":
//			OperaOptions options1 = new OperaOptions();
//			options1.setAcceptInsecureCerts(true);
//			options1.addArguments("start-maximized");
//			System.setProperty(StringConstants.OPERA_KEY_DRIVER, StringConstants.OPERA_BROWSER_DRIVER);
//			driver = new OperaDriver(options1);
//			System.out.println("OPERA was initialized!");
//			break;
			System.out.println("OPERA is deprecated");
		case "CHROME":
			ChromeOptions options2 = new ChromeOptions();
			options2.setAcceptInsecureCerts(true);
			options2.addArguments("start-maximized");
			System.setProperty(StringConstants.CHROME_KEY_DRIVER, StringConstants.CHROME_BROWSER_DRIVER);
			driver = new ChromeDriver(options2);
			System.out.println("CHROME was initialized!");
			break;
		case "FIREFOX":
			FirefoxOptions options3 = new FirefoxOptions();
			options3.setAcceptInsecureCerts(true);
			options3.addArguments("start-maximized");
			System.setProperty(StringConstants.FIREFOX_KEY_DRIVER, StringConstants.FIREFOX_BROWSER_DRIVER);
			driver = new FirefoxDriver(options3);
			System.out.println("FIREFOX was initialized!");
			break;
		case "EDGE":
			EdgeOptions options4 = new EdgeOptions();
			options4.setAcceptInsecureCerts(true);
			options4.addArguments("start-maximized");
			System.setProperty(StringConstants.EDGE_KEY_DRIVER, StringConstants.EDGE_BROWSER_DRIVER);
			driver = new EdgeDriver(options4);
			System.out.println("EDGE was initialized!");
			break;
		default:
			System.out.println("Cannot Open Browser with that key or driver");
		}
		implicitWait(5);
		return driver;	

	}

	public static void openBrowser(String URL) {
		driver.get(URL);
		System.out.println("Browser was opened in: " + URL);
	}

	public static void navigateToURL(String URL) {
		driver.navigate().to(URL);
	}

	public static void goBack() {
		driver.navigate().back();
		;
	}

	public static void goFoward() {
		driver.navigate().forward();
	}

	public static void closeCurrentTab() {
		driver.close();
	}

	public static void closeBrowser() {
		driver.quit();
		System.out.println("Browser was closed!");
	}

	public static String getTitlePage() {
		return driver.getTitle();
	}

	public static String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public static void maximizedWindow() {
		driver.manage().window().maximize();
	}

	public static void minimizedWindow() {
		Point p = new Point(0, 3000);
		driver.manage().window().setPosition(p);
	}

	public static void restoreWindow() {
		Dimension d = new Dimension(300, 1080);
		driver.manage().window().setSize(d);
	}

	public static void click(By object) {
		driver.findElement(object).click();
		System.out.println("Element: " + object + " clicked");
	}

	public static void setText(By object, String text) {
		driver.findElement(object).sendKeys(text);
		System.out.println("Text: " + text + " was written on Element: " + object);
	}

	public static String getText(By object) {
		System.out.println("Obtained Text: " + driver.findElement(object).getText());
		return driver.findElement(object).getText();
	}

	public static void doubleClick(By object) {
		click(object);
		click(object);
	}

	public static void clear(By object) {
		driver.findElement(object).clear();
	}

	public static void delay(int seconds) {

		try {
			System.out.println("Delay: "+seconds+" seconds");
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		System.out.println("Implicit Wait is: " + seconds + " seconds.");
	}

	public static void scrollToObject(By object) {
		js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(object);
		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", element);
		System.out.println("Object scrolled: " + object);
	}

	public static void scrollToPosition(int positionX, int positionY) {
		js = (JavascriptExecutor) driver;
		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(" + positionX + "," + positionY + ")");
		System.out.println("Position scrolled: " + positionX + "," + positionY);
	}

	public static void scrollToBottom() {
		js = (JavascriptExecutor) driver;
		// This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void soundBeep() {
		Toolkit.getDefaultToolkit().beep();
	}

	public static void selectOptionByIndex(By object, int index) {
		WebElement element = driver.findElement(object);
		Select dropdown = new Select(element);
		dropdown.selectByIndex(index);
		System.out.println("Element selected: " + dropdown.getFirstSelectedOption().getText());
	}

	public static void selectOptionByLabel(By object, String label) {
		WebElement element = driver.findElement(object);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(label);
		System.out.println("Element selected: " + dropdown.getFirstSelectedOption().getText());
	}

	public static void selectOptionByValue(By object, String value) {
		WebElement element = driver.findElement(object);
		Select dropdown = new Select(element);
		dropdown.selectByValue(value);
		System.out.println("Element selected: " + dropdown.getFirstSelectedOption().getText());
	}

	public static void selectOptionByList(By listObjects, String option) {

		List<WebElement> options = driver.findElements(listObjects);
		int i = 1;
		for (WebElement element : options) {
			if (element.getText().equalsIgnoreCase(option)) {
				System.out.println(i + ". " + element.getText() + " = " + option);
				element.click();
				options.clear();
				break;
			} else {
				System.out.println(i + ". " + element.getText() + " != " + option);
			}
			i++;
		}

	}

	public static void check(By object) {
		if (driver.findElement(object).isSelected())
			System.out.println(object + " Already checked.");
		else {
			driver.findElement(object).click();
			System.out.println(object + " Checked.");
		}

	}

	public static void uncheck(By object) {
		if (driver.findElement(object).isSelected()) {
			driver.findElement(object).click();
			System.out.println(object + " Unchecked.");
		} else
			System.out.println(object + " Already Unchecked.");
	}

	public static void acceptAlert() {
		driver.switchTo().alert().accept();
		System.out.println("Alert accepted.");
	}

	public static void dismissAlert() {

		driver.switchTo().alert().dismiss();
		System.out.println("Alert dismissed.");
	}

	public static String getAlertText() {
		System.out.println("Alert text: " + driver.switchTo().alert().getText());
		return driver.switchTo().alert().getText();
	}

	public static void identifyGenericElement(By identifierObject, By genericObject) {

		List<WebElement> products = driver.findElements(identifierObject);
		String[] itemsNeededArray = { "Beetroot", "Tomato", "Potato", "Banana", "Apple", "Raspberry", "Carrot" };
		List<String> itemsNeededList = Arrays.asList(itemsNeededArray);

		for (int i = 0; i < products.size(); i++) {
			String[] product = products.get(i).getText().split("-");
			String productFormatted = product[0].trim();

			if (itemsNeededList.contains(productFormatted)) {
				driver.findElements(genericObject).get(i).click();
				// WebUI.delay(7);
				System.out.println((i + 1) + ". " + productFormatted + " Added");
			} else
				System.out.println((i + 1) + ". " + productFormatted + " Not needed");
		}
	}

	public static boolean verifyElementPresent(By object) {
		if (driver.findElement(object).isDisplayed())
			System.out.println("True " + object + " is present.");
		else
			System.out.println("False " + object + " is Not present.");
		return driver.findElement(object).isDisplayed();
	}

	public static void mouseOver(By object) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(object)).build().perform();
	}
	
	public static void dragAndDrop(By source, By target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(source), driver.findElement(target)).build().perform();;
	}

	public static void doubleClickIntoText(By object, String text) {

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(object)).click().keyDown(Keys.SHIFT).sendKeys(text).doubleClick()
				.build().perform();
	}

	public static void clickAndHold(By object) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(object)).clickAndHold().build().perform();
	}
	
	public static void rightClick(By object) {
		
		Actions actions = new Actions(driver);
		actions.contextClick(driver.findElement(object)).build().perform();
		
	}
	
	public static void useKeyboard(Keys key) {
		Actions actions = new Actions(driver);
		actions.keyDown(key).build().perform();;
	}
	
	public static void moveToTab(String tab) {
		
		Set<String> windows = driver.getWindowHandles(); //[parentID, childID, subchildID]
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		String subchildID = "";
		if(windows.size()==3) subchildID = it.next();
							
		switch (tab) {
		case StringConstants.PARENTID:
			driver.switchTo().window(parentID);
			System.out.println("Focus was switched to Parent tab");
			break;
		case StringConstants.CHILDID:
			driver.switchTo().window(childID);
			System.out.println("Focus was switched to Child tab");
			break;
		case StringConstants.SUBCHILDID:
			driver.switchTo().window(subchildID);
			System.out.println("Focus was switched to SubChild tab");
			break;
		
		default:
			System.out.println("Tab not detected!");
		}
		
	}
	
	public static void switchToFrame(By object) {
		driver.switchTo().frame(driver.findElement(object));
	}
	
	public static int getElementsCount(By object) {
		return driver.findElements(object).size();	
	}
	
	public static int getElementsCountInSection(By objectSection, By element) {
		WebElement footerdriver = driver.findElement(objectSection);
		return footerdriver.findElements(element).size();
	}
	
	public static String getPageTitle() {
		System.out.println("Title: "+driver.getTitle());
		return driver.getTitle();
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	        System.out.println(d);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	public static String extractOnlyNumbers(String number){

		String textToNumber = number.replaceAll("[^0-9]", "");

		return textToNumber;
	}
	
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}
	
	public static void deleteCookie(Cookie cookie) {
		driver.manage().deleteCookie(cookie);
	}
	
	public static void deleteCookieByname(String cookieName) {
		driver.manage().deleteCookieNamed(cookieName);
	}
	
	public static void takeScreenShot(WebDriver webdriver,String fileWithPath){

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Screenshot taken");

    }
	
	public static void takeScreenShot(String fileWithPath){

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Screenshot taken");

    }
	
	public static String getAttribute(By object, String attribute) {
		return driver.findElement(object).getAttribute(attribute);
	}
	
	public static WebElement aboveLocator(By commonObject, By referenceObject) {
		WebElement webElement =  driver.findElement(with(commonObject).above(driver.findElement(referenceObject)));
		return webElement;
	}

	public static WebElement belowLocator(By commonObject, By referenceObject) {
		WebElement webElement =  driver.findElement(with(commonObject).below(driver.findElement(referenceObject)));
		return webElement;
	}
	
	public static WebElement leftOfLocator(By commonObject, By referenceObject) {
		WebElement webElement =  driver.findElement(with(commonObject).toLeftOf(driver.findElement(referenceObject)));
		return webElement;
	}
	
	public static WebElement rightOfLocator(By commonObject, By referenceObject) {
		WebElement webElement =  driver.findElement(with(commonObject).toRightOf(driver.findElement(referenceObject)));
		return webElement;
	}

}
