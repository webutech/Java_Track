package unnammedclass;

public class ToyCarTest {

	public static void main(String[] args) {
		Car car=new Car() {
			
			@Override
			public void stop() {
				System.out.println("Dream car stoped");
				
			}
			
			@Override
			public void drive() {
				System.out.println("Drive dream car...");
				
			}
		};
		
		System.out.println(car);

	}

}
