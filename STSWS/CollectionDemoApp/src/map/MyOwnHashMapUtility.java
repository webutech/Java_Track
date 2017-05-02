package map;

import java.util.Map;

public class MyOwnHashMapUtility {

	private static final Integer ONE = new Integer(1);
	public static void checkDuplicate(Map m, String[] names) {
		
		 for (int i=0; i<names.length; i++) {
	            Integer freq = (Integer) m.get(names[i]);
	            // Adding an entry to the HashMap
	            m.put(names[i], (freq==null ? ONE :
	                new Integer(freq.intValue() + 1)));
	        }
	        System.out.println("Map type = " + m.getClass().getName() + " " + m);
	}

}
