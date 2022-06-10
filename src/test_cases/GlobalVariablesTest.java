package test_cases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariablesTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("Files/properties/GlobalVariables.properties");

		prop.load(fis);

		System.out.println(prop.getProperty("browser"));

		System.out.println(prop.getProperty("url"));

		prop.setProperty("browser", "firefox");

		System.out.println(prop.getProperty("browser"));

		FileOutputStream fos = new FileOutputStream("Files/properties/GlobalVariables.properties");

		prop.store(fos, null);

	}

}
