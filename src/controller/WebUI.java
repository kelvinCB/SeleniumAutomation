package controller;


import java.awt.Toolkit;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import constants.StringConstants;

public class WebUI {

	private static WebDriver driver;
	private static JavascriptExecutor js;

	public static void initializeBrowser(String browser) {

		switch (browser) {
		case "OPERA":
			System.setProperty(StringConstants.OPERA_KEY_DRIVER, StringConstants.OPERA_BROWSER_DRIVER);
			driver = new OperaDriver();
			implicitWait(10);
			System.out.println("OPERA was initialized!");
			break;
		case "CHROME":
			System.setProperty(StringConstants.CHROME_KEY_DRIVER, StringConstants.CHROME_BROWSER_DRIVER);
			driver = new ChromeDriver();
			implicitWait(10);
			System.out.println("CHROME was initialized!");
			break;
		case "FIREFOX":
			System.setProperty(StringConstants.FIREFOX_KEY_DRIVER, StringConstants.FIREFOX_BROWSER_DRIVER);
			driver = new FirefoxDriver();
			implicitWait(10);
			System.out.println("FIREFOX was initialized!");
			break;
		case "EDGE":
			System.setProperty(StringConstants.EDGE_KEY_DRIVER, StringConstants.EDGE_BROWSER_DRIVER);
			driver = new EdgeDriver();
			implicitWait(10);
			System.out.println("EDGE was initialized!");
			break;
		default:
			implicitWait(10); 
			System.out.println("Cannot Open Browser with that key or driver");
		}

	}

	public static void openBrowser(String URL) {
		driver.get(URL);
		System.out.println("Browser was opened in: "+URL);
	}
	
	public static void navigateToURL(String URL) {
		driver.navigate().to(URL);
	}
	
	public static void goBack() {
		driver.navigate().back();;
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
		Point p = new Point(0,3000);
		driver.manage().window().setPosition(p);
	}
	
	public static void restoreWindow() {
		Dimension d = new Dimension(300, 1080);
		driver.manage().window().setSize(d);
	}
	
	public static void clic(By object) {
		driver.findElement(object).click();
		System.out.println("Element: "+ object +" clicked");
	}
	
	public static void setText(By object, String text) {
		driver.findElement(object).sendKeys(text);
		System.out.println("Text: "+ text + " was written on Element: "+ object);
	}
	
	public static String getText(By object) {
		System.out.println("Obtained Text: "+ driver.findElement(object).getText());
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
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds)); 
	}
	
	public static void scrollToObject(By object) {
		js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(object);
		 //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Object scrolled: "+object);
	}
	
	public static void scrollToPosition(int positionX, int positionY) {
		js = (JavascriptExecutor) driver;
		// This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy("+positionX+","+positionY+")");
        System.out.println("Position scrolled: "+ positionX + "," + positionY );
	}

	public static void scrollToBottom() {
		js = (JavascriptExecutor) driver;
		//This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void soundBeep() {
		Toolkit.getDefaultToolkit().beep();
	}
	
	public static void selectOptionByIndex(By object, int index) {
		WebElement element = driver.findElement(object);
		Select dropdown = new Select(element);
		dropdown.selectByIndex(index);
		System.out.println("Element selected: "+dropdown.getFirstSelectedOption().getText());
	}
	
	public static void selectOptionByLabel(By object, String label) {
		WebElement element = driver.findElement(object);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(label);
		System.out.println("Element selected: "+dropdown.getFirstSelectedOption().getText());
	}
	
	public static void selectOptionByValue(By object, String value) {
		WebElement element = driver.findElement(object);
		Select dropdown = new Select(element);
		dropdown.selectByValue(value);
		System.out.println("Element selected: "+dropdown.getFirstSelectedOption().getText());
	}
	
	public static void selectOptionByList(By listObjects, String option) {
		
		List<WebElement> options = driver.findElements(listObjects);
		int i = 1;
		for(WebElement element : options) {
			i=i;
			if(element.getText().equalsIgnoreCase(option)) {
				System.out.println(i+". "+element.getText()+" = "+option);
				element.click();
				options.clear();
				break;
			}else {
				System.out.println(i+". "+element.getText()+" != "+option);
			}
			i++;
		}
		
	}
	
}
