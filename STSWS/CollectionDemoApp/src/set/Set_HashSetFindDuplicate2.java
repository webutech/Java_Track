package set;
import java.util.HashSet;
import java.util.Set;

/**
 * Find out the duplicate name from the provided names. 
 * show the duplicate name separately and show the dinstinct name list separately. 
 * @author sharma.pankaj
 *
 */

public class Set_HashSetFindDuplicate2 {

	public static void main(String[] args) {
		// set up test data
		String names[]={
				new String("pankaj"),
				new String("rajesh"),
				new String("suresh"),
				new String("pankaj"),
				new String("suresh"),
				new String("aman")
		};
		
		// Create HashSet object and assign it to Set reference. 
		
		System.out.println("-----Initial list-------");
		StringBuilder sb=new StringBuilder();
		for (String name : names) {
			sb.append(name+", ");
			
		}		
		System.out.println(sb.substring(0, sb.lastIndexOf(",")));
		Set uniques=new HashSet();
		Set duplicates=new HashSet();
		for(int i=0;i<names.length;i++){
			if(!uniques.add(names[i])){
				duplicates.add(names[i]);
			}
		}
		//remove items that duplicate in uniques
		uniques.removeAll(duplicates);
		System.out.println("unique names : "+uniques);
		System.out.println("duplicate names : "+duplicates);
	}

}
