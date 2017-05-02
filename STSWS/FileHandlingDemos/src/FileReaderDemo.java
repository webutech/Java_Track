import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileReaderDemo {
	public static void main(String[] args) {
		char[] cbuf=new char[50];
		int size;
		try {
			FileReader fileReader=new FileReader(new File("test2.txt"));
			size=fileReader.read(cbuf);
			System.out.println("Size = "+size);
			for (char character : cbuf) {
				System.out.print(character);
			}
			fileReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
