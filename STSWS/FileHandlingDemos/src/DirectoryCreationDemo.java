import java.io.File;
public class DirectoryCreationDemo {
	public static void main(String[] args) {
		File file=new File("testDir");
		file.mkdir();
	}
}
