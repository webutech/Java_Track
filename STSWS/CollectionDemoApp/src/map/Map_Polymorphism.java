package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Polymorphism {

	public static void main(String[] args) {
		 // Set up testing data
        String names[] = {
        		 new String("Sohan"),
		            new String("Shailee"),
		            new String("Bharat"),
		            new String("Pawan"),
		            new String("Sachin"),
		            new String("Bharat")
        };
        
        Map m = new HashMap();
        MyOwnHashMapUtility.checkDuplicate(m, names);
        
        m = new TreeMap();
        MyOwnHashMapUtility.checkDuplicate(m, names);
        
        m = new LinkedHashMap();
        MyOwnHashMapUtility.checkDuplicate(m, names);

	}

}
