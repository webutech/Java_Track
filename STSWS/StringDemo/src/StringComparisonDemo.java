
public class StringComparisonDemo {
	public static void main(String[] args) {
		String str1="Hello";		
		String str2=new String("Hello");		
		
		if(str1==str2){
			System.out.println("both are equal");
		}
		if(str1.equals(str2)){
			System.out.println("Both objects contain same value");
		}
	}
}

