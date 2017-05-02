import java.io.Serializable;
class Person{
	public int a;
	public Person(){
		
	}
}

public  class Employee extends Person implements Serializable, Cloneable {

		public  int age;
		public static String name="Unknown";
		public String address;
		
		public Employee() {
			
		}

		public Employee(int age, String address) {
			this.age = age;
			this.address = address;
		}
		
		public void addEmployee(){
			
		}
		
		public void searchEmployee(int empId){
			
		}		
		
}
