package set;

import java.util.Collection;
import java.util.HashSet;

/**
 * HashSet Demo App
 * @author sharma.pankaj
 * Description and properties
 * This class implements the Set interface, backed by a hash table (actually a HashMap instance). 
 * It makes no guarantees as to the iteration order of the set; in particular, 
 * it does not guarantee that the order will remain constant over time. 
 * This class permits the null element.
 * 
 * This class offers constant time performance for the basic operations (add, remove, contains and size), 
 * assuming the hash function disperses the elements properly among the buckets. 
 * Iterating over this set requires time proportional to the sum of the HashSet instance's size 
 * (the number of elements) plus the "capacity" of the backing HashMap instance (the number of buckets). 
 * Thus, it's very important not to set the initial capacity too high (or the load factor too low) 
 * if iteration performance is important.
 * 
 * this is not Synchronized
 * 
 * For more understanding :  look for :  HashSet on https://docs.oracle.com/javase/8/docs/api/
 * 
 *
 */
public class SetHashSetAdd {
	public static void main(String[] args) {
		// Create reference and object of HashSet
		HashSet hs=new HashSet();
		System.out.println("one :"+hs.add("one"));
		System.out.println("two :"+hs.add("two"));
		System.out.println("three :"+hs.add("three"));
		System.out.println("five :"+hs.add("five"));
		System.out.println("four :"+hs.add("four"));
		System.out.println(hs);
		// Add a duplicate item to HashSet
		System.out.println("four :"+hs.add("four"));
		
		// Printout the HashSet object
		System.out.println(hs);
		
	}

}
