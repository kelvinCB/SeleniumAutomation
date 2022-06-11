package test_cases_testng;

import org.testng.annotations.Test;

public class OnePiece {

	@Test
	public void beforeTimeSkip() {
		System.out.println("One Piece Exists!!");
	}
	
	@Test
	public void afterTimeSkip() {
		System.out.println("Kaido Vs Nikka");
	}
	
}
