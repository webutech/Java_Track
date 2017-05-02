public class NestedTryDemo2 {
	public static void nestedTry(String[] args){
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println("Result : "+(a/b));
		}
		catch(ArithmeticException ex){
			System.out.println("Divide by Zero error!");
		}
	}
	public static void main(String[] args) {
	
		try{
			nestedTry(args);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Need 2 parameters");
		}
	}
}
