
public class FinallyDemo {
	static void myMethod(int n) throws Exception{
		try{
			switch(n){
			case 1: System.out.println("1st Case");
			return;
			case 3: System.out.println("3rd Case");
			return;
			case 4: System.out.println("4th Case");
			return;
			case 2: System.out.println("2nd Case");
			return;
			}
		}
		catch(RuntimeException ex){
			System.out.println("Runtime Exception :  ");
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("try-block entered");
		}
	}
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			try{
				FinallyDemo.myMethod(i);
			}catch(Exception e){
				System.out.println("Exception caught : ");
				System.out.println(e.getMessage());
			}
			System.out.println();
			
		}
	}

}
