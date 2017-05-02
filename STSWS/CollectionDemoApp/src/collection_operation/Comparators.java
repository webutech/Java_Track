package collection_operation;

import java.util.Comparator;

public class Comparators {
	public static Comparator stringComparator(){
		return new Comparator() {
			public int compare(Object o1,Object o2){
				 	String s1 = (String)o1;
	                String s2 = (String)o2;
	                int len1 = s1.length();
	                int len2 = s2.length();
	                int n = Math.min(len1, len2);
	                char v1[] = s1.toCharArray();
	                char v2[] = s2.toCharArray();
	                int pos = 0;
	                
	                while (n-- != 0) {
	                    char c1 = v1[pos];
	                    char c2 = v2[pos];
	                    if (c1 != c2) {
	                        return c1 - c2;
	                    }
	                    pos++;
	                }
	                return len1 - len2;
	            }
		};
	}

}
