class Calculator{

	public int operationOnTwoVariable(int i, int j, String operator) {
		int result=0;
		switch (operator) {
		case "+":
			result=i+j;
			break;
		case "-":
			result=i-j;
			break;
		default:
			break;
		}
		
		return result;
	}
	
}
public class TestCalculator {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int add=calculator.operationOnTwoVariable(10,2,"-");
		System.out.println("Addition is : "+add);

	}

}
