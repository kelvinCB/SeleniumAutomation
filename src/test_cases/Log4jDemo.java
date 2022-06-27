package test_cases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	/*
	 * Use log. Error()
	 * to log when elements are not displayed in the page or if anyvalidations fail
	 * 
	 * Use Log. Debug()
	 * When each Selenium action is performed like click, SendKeys, getText()
	 * 
	 * Use log.info()
	 * When operation is successfully completed ex: After loading page, or after any
	 * successful validations
	 * It’s just counterpart to log. Error()
	 * 
	 */
	private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("This is info message");
		log.debug("This is debug message");
		log.error("This is error message");
		log.warn("This is warn message");
		log.fatal("This is fatal message");

	}

}
