
public class MutableDemo {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Hello");
		System.out.println("str hash code : "+str.hashCode());
		System.out.println("str = "+str);
		str.append(" Friends");
		System.out.println("str hash code : "+str.hashCode());
		System.out.println("str = "+str);
		System.out.println("------Insertions-------");
		str.insert(5, " Dear");
		System.out.println("str hash code : "+str.hashCode());
		System.out.println("str = "+str);
		
		

	}

}
