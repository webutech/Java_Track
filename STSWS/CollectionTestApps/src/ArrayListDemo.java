import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		 // Create LinkedList object and add 4 Integer objects to it.
        LinkedList list = new LinkedList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(1));
        System.out.println(list+", size = "+list.size());
        
        // Add Integer objects to the beginning and end of the LinkedList object.
        list.addFirst(new Integer(0));
        list.addLast(new Integer(4));
        System.out.println(list);
        System.out.println(list.getFirst() + ", " + list.getLast());
        System.out.println(list.get(2)+", "+list.get(3));      
	}
}
