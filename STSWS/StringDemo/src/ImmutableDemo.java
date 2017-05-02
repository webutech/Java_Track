
public class ImmutableDemo {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println("str : "+str);
		System.out.println("str hash code: "+str.hashCode());
		
		str+=" Friends";
		System.out.println("str : "+str);
		System.out.println("str hash code: "+str.hashCode());

	}

}
