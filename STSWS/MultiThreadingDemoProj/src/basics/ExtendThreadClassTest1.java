package basics;

public class ExtendThreadClassTest1 {

	public static void main(String[] args) {
		//Create object instance of a class that is subclass of Thread class
		System.out.println("Creating PrintNameThread Object instance....");
		PrintNameThread pnt1=new PrintNameThread("A");
		//Start the thread by calling start() method
		System.out.println("Calling start() method of "+pnt1.getName()+" thread");
		pnt1.start();
		System.out.println("\n\n");
		
		//Create object instance of a class that is subclass of Thread class
				System.out.println("Creating PrintNameThread Object instance....");
				PrintNameThread pnt2=new PrintNameThread("B");
				//Start the thread by calling start() method
				System.out.println("Calling start() method of "+pnt2.getName()+" thread");
				pnt2.start();
				System.out.println("\n\n");
				
				//Create object instance of a class that is subclass of Thread class
				System.out.println("Creating PrintNameThread Object instance....");
				PrintNameThread pnt3=new PrintNameThread("C");
				//Start the thread by calling start() method
				System.out.println("Calling start() method of "+pnt3.getName()+" thread");
				pnt3.start();
		

	}

}
