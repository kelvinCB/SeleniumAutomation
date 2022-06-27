package test_cases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger log =LogManager.getLogger(Log4jDemo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.info("This is info message");
		log.debug("This is debug message");
		log.error("This is error message");
		log.warn("This is warn message");
		log.fatal("This is fatal message");
		

	}

}
