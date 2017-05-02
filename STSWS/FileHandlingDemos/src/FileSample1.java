import java.io.File;
import java.io.IOException;
/**
 * File Demo
 * @author sharma.pankaj
 *
 */

public class FileSample1 {
	public static void main(String[] args) {
		// it is just the object, not actual file in directory
		File file1=new File("test1.txt");
		// to check that file exist or not. 
		System.out.println(file1.exists());
		boolean newFile=false;
		try{
		newFile=file1.createNewFile();
		System.out.println(newFile);
		System.out.println(file1.exists());
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}
}
