package test_cases_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

	ExtentReports extent;

	@BeforeTest
	public void config() {
		//ExtentSparkReporter
		ExtentSparkReporter reporter = new ExtentSparkReporter("Files/extentReports/ExtentReportDemo.html");
		reporter.config().setReportName("Extent Report Demo Results"); //set report name
		reporter.config().setDocumentTitle("Extent Report Demo Results"); //set document title 
		reporter.config().setEncoding("utf-8");  //set encoding to utf-8

		//ExtentReports
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Kelvin");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Browser", "Firefox");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("OS Version", "10");
		extent.setSystemInfo("Port", "8080");
		extent.setSystemInfo("URL", "https://rahulshettyacademy.com");
	}

	@Test
	public void initialDemo() {
		
		ExtentTest test = extent.createTest("Initial Demo");
		System.setProperty("webdriver.gecko.driver", "Files/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.quit();
		test.pass("Test passed");
		extent.flush();
	}
	
	@Test
	public void secondDemo() {
		
		ExtentTest test = extent.createTest("Second Demo");
		System.setProperty("webdriver.gecko.driver", "Files/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.quit();
		test.fail("Test failed");
		extent.flush();
	}

}
