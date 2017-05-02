class MyMath{
	
	public void add(int num1,int num2){
		System.out.println("-------add(int num1,int num2)-------");
		System.out.println("result : - "+(num1+num2));
	}
//	public void add(int num1,float num2){
//		System.out.println("-------add(int num1,float num2)-------");
//		System.out.println("result : - "+(num1+num2));
//	}
//	public void add(float num1,int num2){
//		System.out.println("-------add(float num1,int num2)-------");
//		System.out.println("result : - "+(num1+num2));
//	}
//	public void add(float num1,float num2){
//		System.out.println("-------add(float num1,float num2)-------");
//		System.out.println("result : - "+(num1+num2));
//	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		MyMath myMath=new MyMath();
		myMath.add(10,(int)20.5f);

	}

}
