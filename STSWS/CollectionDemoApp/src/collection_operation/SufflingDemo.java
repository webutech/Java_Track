package collection_operation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SufflingDemo {

	public static void main(String[] args) {
		String name[] = {
	            new String("pankaj"),
	            new String("rajesh"),
	            new String("pankaj"),
	            new String("aman"),
	            new String("deepak"),
	            new String("pankaj"),
	            new String("aman")
	        };
		List l=Arrays.asList(name);
		System.out.println("Before shuffel : "+l);
		
		Collections.shuffle(l);
		System.out.println("After shuffel : "+l);
		
		Collections.sort(l);
		System.out.println("After sorting : "+l);
	}

}
