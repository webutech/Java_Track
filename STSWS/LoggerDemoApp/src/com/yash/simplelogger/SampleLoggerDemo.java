package com.yash.simplelogger;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SampleLoggerDemo {
	private static Logger logger=Logger.getLogger("SampleLoggerDemo");
	public static void main(String[] args) {
		logger.setLevel(Level.SEVERE);
		//Log info
		logger.info("-----Logger started-----");
		try{
			System.out.println(5/0);
			
		}
		catch(Exception ex){
			logger.log( Level.SEVERE, "Divide by 0");
		}
		logger.info("-----Logger End-----");
	}
}
