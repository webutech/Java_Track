/**
 * Demonstrating StackOverFlowErrorDemo
 * @author sharma.pankaj
 *
 */
public class StackOverFlowErrorDemo {	
	public static void main(String[] args) {
		System.out.println("-------main: start---------");
		method1();
		System.out.println("-------main: end---------");
	}
	public static void method1(){
		System.out.println("-------method1: start---------");
		method2();
		System.out.println("-------method1: end---------");		
	}
	public static void method2(){
		System.out.println("-------method2: start---------");
		method2();
		System.out.println("-------method2: end---------");		
	}
}
