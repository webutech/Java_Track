package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {

	public static void main(String[] args) {
		Set ts1=new LinkedHashSet();
		ts1.add("one");
		ts1.add("two");
		ts1.add("three");
		ts1.add("five");
		ts1.add("four");
		ts1.add("one");		
		System.out.println("ts1 : "+ts1);
		Set ts2=new LinkedHashSet();
		ts2.add(1);
		ts2.add(2);
		ts2.add(3);
		ts2.add(5);
		ts2.add(4);
		ts2.add(1);
		System.out.println("ts2 : "+ts2);
	}
}
