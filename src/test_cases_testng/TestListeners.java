package test_cases_testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestListeners {
	
	@BeforeTest
	public void preRequisitesTest() {
		System.out.println("This will be execute before any test case");
	}
	
	@BeforeSuite
	public void preRequisitesSuite() {
		System.out.println("This will be execute before any test suite");
	}
	
	@BeforeClass
	public void preRequisitesClass() {
		System.out.println("This will be execute before any class");
	}
	
	@BeforeMethod
	public void preRequisitesMethod() {
		System.out.println("This will be execute before any method");
	}
	
	@BeforeGroups
	public void preRequisitesGroup() {
		System.out.println("This will be execute before any group");
	}
	
	
	
	
	@AfterTest
	public void posRequisitesTest() {
		System.out.println("This will be execute after any test case");
	}
	
	@AfterSuite
	public void posRequisitesSuite() {
		System.out.println("This will be execute after any test suite");
	}
	
	@BeforeClass
	public void posRequisitesClass() {
		System.out.println("This will be execute after any class");
	}
	
	@BeforeMethod
	public void posRequisitesMethod() {
		System.out.println("This will be execute after any method");
	}
	
	@BeforeGroups
	public void posRequisitesGroup() {
		System.out.println("This will be execute after any group");
	}
	
	

}
