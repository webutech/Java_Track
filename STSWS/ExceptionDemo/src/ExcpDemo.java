
public class ExcpDemo {
	
	public static void main(String[] args) {
		System.out.println("-------main : Line First--------");
		method1();
		
		System.out.println("-------main : Line Last--------");
	}
	
	public static void method1(){
		System.out.println("-------method1 : Line :First ---------");
		method2();
		System.out.println("-------method1 : Line :Last ---------");
	}
	
	public static void method2(){
		System.out.println("-------method2 : Line :First ---------");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("Result : "+c);
		System.out.println("-------method2 : Line :Last ---------");
	}
}
