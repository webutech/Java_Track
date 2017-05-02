package filehandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogToFileUsingFileHandler {
	private static Logger logger=Logger.getLogger("loggerdemo");
	public static void main(String[] args) throws Exception{
		logger.addHandler(new FileHandler("myOwnLog.xml"));
		logger.info("--logging started---");
		try {
			System.out.println(3/0);
			
		} catch (Exception e) {
			
			logger.log(Level.SEVERE,"Devide by Zero");
		}		
		logger.info("---logging done----");
	}
}
