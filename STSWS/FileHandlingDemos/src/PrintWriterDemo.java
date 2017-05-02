import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		try{
		PrintWriter pw=new PrintWriter(new File("test3.txt"));
		pw.println("this is test file");
		pw.println("this is test demo");
		pw.close();
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}
}
