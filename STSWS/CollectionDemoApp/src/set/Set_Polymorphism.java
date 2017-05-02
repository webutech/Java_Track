package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Polymorphism {

	public static void main(String[] args) {
		 // Set up test data
        String numbers[] = {
            new String("2"),
            new String("3"),
            new String("4"),
            new String("1"),
            new String("2")
        };
        
        Set s = new HashSet();
        MyOwnSetUtility.checkDuplicate(s,numbers);
        s = new TreeSet();
        MyOwnSetUtility.checkDuplicate(s,numbers);
        s = new LinkedHashSet();
        MyOwnSetUtility.checkDuplicate(s,numbers);
	}	
}
