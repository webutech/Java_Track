package calculatorpack;

public class Calculator {
	
		interface IntegerMath{
			int operation(int a,int b);
		}
		
		public int operationOnTwoVariables(int a,int b, IntegerMath op)
		{
			return op.operation(a, b);
		}
	

}
