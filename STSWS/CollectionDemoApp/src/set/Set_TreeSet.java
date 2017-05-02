package set;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet description
 * @author sharma.pankaj
 * 
 * taken from :  java's official reference. 
 * 
 * A NavigableSet implementation based on a TreeMap. The elements are ordered using their natural ordering, 
 * or by a Comparator provided at set creation time, depending on which constructor is used.
 * the ordering maintained by a set (whether or not an explicit comparator is provided) 
 * must be consistent with equals if it is to correctly implement the Set interface.
 * This is so because the Set interface is defined in terms of the equals operation, 
 * but a TreeSet instance performs all element comparisons using its compareTo (or compare) method, 
 * so two elements that are deemed equal by this method are, from the standpoint of the set, equal. 
 *
 */

public class Set_TreeSet {


	public static void main(String[] args) {
		// Create TreeSet object and set reference
		TreeSet ts=new TreeSet<>();
		
		System.out.println("One : "+ts.add("One"));
		System.out.println("Two : "+ts.add("Two"));
		System.out.println("Three : "+ts.add("Three"));
		System.out.println("Four : "+ts.add("Four"));
		System.out.println("Three : "+ts.add("Three"));
		
		// Show the item of TreeSet
		System.out.println(ts);		
		TreeSet ts2=new TreeSet<>();
		System.out.println("1 : "+ts2.add(1));
		System.out.println("2 : "+ts2.add(2));
		System.out.println("3 : "+ts2.add(3));
		System.out.println("4 : "+ts2.add(4));
		System.out.println("1 : "+ts2.add(1));
		
		System.out.println(ts2);
	}

}
