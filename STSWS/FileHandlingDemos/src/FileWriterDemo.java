import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		File file1=new File("test2.txt");
		try {
			FileWriter fileWriter=new FileWriter(file1);
			fileWriter.write("This is test file\nThis is demo");
			fileWriter.flush();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
