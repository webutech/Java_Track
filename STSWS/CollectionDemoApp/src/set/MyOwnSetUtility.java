package set;

import java.util.Set;

public class MyOwnSetUtility {

	public static void checkDuplicate(Set s, String[] numbers) {
		 for (int i=0; i<numbers.length; i++)
	            if (!s.add(numbers[i]))
	        System.out.println("Set type = " + s.getClass().getName() + " " + s);
	    }
}
