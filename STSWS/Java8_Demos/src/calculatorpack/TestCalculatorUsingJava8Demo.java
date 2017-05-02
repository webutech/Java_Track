package calculatorpack;

import calculatorpack.Calculator.IntegerMath;

public class TestCalculatorUsingJava8Demo {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		IntegerMath addition=(a,b)->a+b;
		IntegerMath subtraction=(a,b)->a-b;
		int result=calculator.operationOnTwoVariables(10, 2, subtraction);
		System.out.println("Result is : "+result);
	}

}
