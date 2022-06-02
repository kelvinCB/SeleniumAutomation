package controller;

import java.awt.Toolkit;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.StringConstants;

public class WebUI {

	private static WebDriver driver;
	private static JavascriptExecutor js;

	public static void initializeBrowser(String browser) {

		switch (browser) {
		case "OPERA":
			System.setProperty(StringConstants.OPERA_KEY_DRIVER, StringConstants.OPERA_BROWSER_DRIVER);
			driver = new OperaDriver();
			System.out.println("OPERA was initialized!");
			break;
		case "CHROME":
			System.setProperty(StringConstants.CHROME_KEY_DRIVER, StringConstants.CHROME_BROWSER_DRIVER);
			driver = new ChromeDriver();
			System.out.println("CHROME was initialized!");
			break;
		case "FIREFOX":
			System.setProperty(StringConstants.FIREFOX_KEY_DRIVER, StringConstants.FIREFOX_BROWSER_DRIVER);
			driver = new FirefoxDriver();
			System.out.println("FIREFOX was initialized!");
			break;
		case "EDGE":
			System.setProperty(StringConstants.EDGE_KEY_DRIVER, StringConstants.EDGE_BROWSER_DRIVER);
			driver = new EdgeDriver();
			System.out.println("EDGE was initialized!");
			break;
		default:
			System.out.println("Cannot Open Browser with that key or driver");
		}
		implicitWait(5);

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

	public static void clic(By object) {
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

	public static void doubleClic(By object) {
		clic(object);
		clic(object);
	}

	public static void clear(By object) {
		driver.findElement(object).clear();
	}

	public static void delay(int seconds) {

		// WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		// w.until(ExpectedConditions.visibilityOfElementLocated(null));

		try {
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
		List itemsNeededList = Arrays.asList(itemsNeededArray);

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

	public static void doubleClicIntoText(By object, String text) {

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(object)).click().keyDown(Keys.SHIFT).sendKeys(text).doubleClick()
				.build().perform();
	}

	public static void clicAndHold(By object) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(object)).clickAndHold().build().perform();
	}
	
	public static void rightClic(By object) {
		
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

}
