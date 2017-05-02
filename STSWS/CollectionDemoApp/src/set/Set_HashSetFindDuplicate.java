package set;
import java.util.HashSet;
import java.util.Set;

/**
 * Find out the duplicate name from the provided names. 
 * show the duplicate name separately and show the dinstinct name list separately. 
 * @author sharma.pankaj
 *
 */

public class Set_HashSetFindDuplicate {

	public static void main(String[] args) {
		// set up test data
		String names[]={
				new String("pankaj"),
				new String("rajesh"),
				new String("suresh"),
				new String("pankaj"),
				new String("suresh"),
				new String("pankaj")
				
		};
		
		// Create HashSet object and assign it to Set reference. 
		
		System.out.println("-----Initial list-------");
		StringBuilder sb=new StringBuilder();
		for (String name : names) {
			sb.append(name+", ");
			
		}		
		System.out.println(sb.substring(0, sb.lastIndexOf(",")));
		Set set=new HashSet();
		for(int i=0;i<names.length;i++){
			if(!set.add(names[i])){
				System.out.println("\nDuplicate name detected : "+names[i]);
			}
			
		}
		System.out.println("\n"+set.size()+" distinct words detected :  list : "+set);
	}

}
