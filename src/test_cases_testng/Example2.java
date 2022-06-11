package test_cases_testng;

import org.testng.annotations.Test;

public class Example2 {
	
	@Test
	public void test3() {
		System.out.println("This is Example3");
	}
	
	@Test(groups={"Smoke"}, dependsOnMethods = {"test3"})
	public void test4() {
		System.out.println("This is Example4");
	}
	
	@Test(enabled = false)
	public void test5() {
		System.out.println("This is Example4");
	}

}
