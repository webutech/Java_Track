import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrintReaderDemo {
	public static void main(String[] args) {
		try{
			FileReader fr=new FileReader(new File("test3.txt"));
			BufferedReader br=new BufferedReader(fr);
			String str=br.readLine();
			System.out.println(str);
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}
}
