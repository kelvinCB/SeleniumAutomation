package test_cases_testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OnePiece {

	@Test
	public void beforeTimeSkip() {
		System.out.println("One Piece Exists!!");
	}
	
	@Test(groups={"Smoke"})
	public void afterTimeSkip() {
		System.out.println("Kaido Vs Nikka");
	}
	
	@Test(dataProvider="getData")
 	public void gearFive(String username, String password) {
		System.out.println("Luffy and Buggy new Yonkous");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() {
		// 1. Goal: enter a user with good credit history
		// 2. Goal: enter a user with bad credit history
		// 3. Goal: enter a user with no credit history
		
		Object[][] data = new Object[3][2];
		
		//1
		data[0][0] = "username1";
		data[0][1] = "password1";
		//2
		data[1][0] = "username2";
		data[1][1] = "password2";
		//3
		data[2][0] = "username3";
		data[2][1] = "password3";
		
		return data;
	}
	
}
