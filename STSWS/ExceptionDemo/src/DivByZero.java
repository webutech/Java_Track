
public class DivByZero {
	public static void main(String[] args) {
		System.out.println("-------main : Line First--------");
		int a=10;
		int b=0;
		try{
		int c=a/b;
		System.out.println("Result is : "+c);
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}		
		System.out.println("-------main : Line Last--------");
	}
}
