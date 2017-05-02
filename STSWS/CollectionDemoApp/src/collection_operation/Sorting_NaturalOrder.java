package collection_operation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_NaturalOrder {

	public static void main(String[] args) {
		 // Set up test data
        String n[] = {
            new String("John"),
            new String("Karl"),
            new String("Groucho"),
            new String("Oscar")
        };
        
        // Create a List from an array
        List l = Arrays.asList(n);
        
        // Perform the sorting operation
        Collections.sort(l);
        
        System.out.println("Sorting list of strings = " + l);
        
         // Set up test data
        Integer int1[] = {
            new Integer(56),
            new Integer(78),
            new Integer(34),
            new Integer(10)
        };
        
        // Create a List from an array
        List l2 = Arrays.asList(int1);
        
        // Perform the sorting operation
        Collections.sort(l2);
        
        System.out.println("Sorting list of numbers = " + l2);     

	}

}
