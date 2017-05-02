package map;
import java.util.HashMap;
import java.util.Map;
public class Map_HashMap {
	private static final Integer ONE=new Integer(1);
	public static void main(String[] args) {
		 // Set up testing data
        String name[] = {
            new String("pankaj"),
            new String("rajesh"),
            new String("pankaj"),
            new String("aman"),
            new String("deepak"),
            new String("pankaj"),
            new String("aman")
        };
		
        //Create HashMap object
        Map m=new HashMap();
      
        
        //Initialize Frequency table with data
        for(int i=0; i<name.length;i++){        	
        	Integer freq=(Integer)m.get(name[i]);
        	//System.out.println(freq);
        	System.out.println("frequency of :"+name[i]+" is : "+(freq==null?ONE:new Integer(freq.intValue()+1)));
        	//Adding an Entry to HashMap
        	m.put(name[i], (freq==null?ONE:new Integer(freq.intValue()+1)));
        }
        
        //Display the size of the Map Object
       System.out.println(m.size()+ " distinct word detected");
        
       System.out.println("Display of HashMap object : "+m);

	}

}
