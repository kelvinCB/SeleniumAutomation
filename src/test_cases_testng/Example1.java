package test_cases_testng;

import org.testng.annotations.Test;

public class Example1 {

	@Test(groups={"Smoke"})
	public void test1() {
		System.out.println("This is Example1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is Example2");
	}
	
	
}
