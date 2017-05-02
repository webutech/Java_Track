import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyMath{
	public List<Integer> findEvenNumbers(List<Integer> values){
		List<Integer> evenNumbers=new ArrayList<>();
		values.forEach((i)->{if(i%2==0){
				evenNumbers.add(i);
			}
		});
		return evenNumbers;
	}
}
public class EvenNumberDemo {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		MyMath myMath=new MyMath();
		List<Integer> evenNumbers=myMath.findEvenNumbers(values);
		System.out.println("Even Numbers : "+evenNumbers);
	}
}
