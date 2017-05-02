import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatchingDemo {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("proj1([^,])*");
		Matcher m=p.matcher("proj3.txt,proj1abc.pdf,proj1.txt,proj2.txt,proj1.java");
		while(m.find()){
			System.out.print(m.start()+" ");
		}
	}
}
