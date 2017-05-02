package collection_operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_Comparator {
	
	public static void main(String[] args) {
		 // Create an ArrayList object and add items to it.
        ArrayList a1 = new ArrayList();
        a1.add("Boston");
        a1.add("New York");
        a1.add("Seoul");
        a1.add("Tokyo");
        a1.add("London");
        a1.add("Bangkok");
        System.out.println("Before sorting = " + a1);
     // Get String Comparator object and sort the list
        Comparator comp = Comparators.stringComparator();
        Collections.sort(a1, comp);
        
        // Display the sorted list
        System.out.println("Sorted list using String Comparator = " + a1);
	}

}
