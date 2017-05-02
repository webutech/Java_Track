public class NestedTryDemo {
	public static void main(String[] args) {
		System.out.println("-------main : Line First--------");		
		int a,b;
		try{
			a=Integer.parseInt(args[0]);
			try{
				b=Integer.parseInt(args[1]);
				System.out.println("Result is : "+(a/b));
			}
			catch(ArithmeticException ex){
				System.out.println(ex.getMessage());
			}		
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Need 2 Parameters");
		}
		System.out.println("-------main : Line Last--------");
	}
}
