package basics;

public class ExtendThreadClassTest2 {

	public static void main(String[] args) {
		//Create object instance of a class that is subclass of Thread class
		System.out.println("Creating PrintNameThread Object instance....");
		PrintNameThread pnt1=new PrintNameThread("A");
		
		PrintNameThread pnt2=new PrintNameThread("B");
		
		PrintNameThread pnt3=new PrintNameThread("C");
		
		
	}

}
