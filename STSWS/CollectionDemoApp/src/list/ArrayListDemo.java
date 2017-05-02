package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(2);
		System.out.println(al+" size:"+al.size());
		
		// Add items to the arraylist
		al.add("R");
		al.add("U");
		al.add("O");
		al.add(new String("x"));
		al.add(2, new Integer(10));
		System.out.println(al+" size:"+al.size());
		
		//Remove an item
		al.remove("U");
		System.out.println(al+" size:"+al.size());
		
		//Check if the list contains specified element
		Boolean b=al.contains("x");
		System.out.println("The list contains x : "+b);
		b=al.contains("p");
		System.out.println("The list contains p : "+b);
		b=al.contains(new Integer(10));
		System.out.println("The list contains 10 : "+b);
		
		// Create list Iterator and iterate the entries
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println("Element : "+it.next());
		}
		
		//Create Object array from ArrayList
		
		Object[] arr=al.toArray();
		for (Object element : arr) {
			System.out.println("element from array : "+element);
		}
	}

}
