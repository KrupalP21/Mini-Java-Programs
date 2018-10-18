
public class CalculatorV2 {

	public static void main(String[] args) {
		
		System.out.print("Enter first number: ");
		double op1 = IO.readDouble();
		System.out.print("Enter a second number: ");
		double op2 = IO.readDouble();
		System.out.println("Enter operation [1]-addition, [2]-subtraction, [3]-multiplication, [4]-division");
		int operation = IO.readInt();
		
		if (operation == 1) {
			double result = op1 + op2;
					IO.outputDoubleAnswer(result);
		} else if (operation == 2) {
			double result = op1 - op2;
			IO.outputDoubleAnswer(result);
		} else if (operation == 3) {
			double result = op1 * op2;
			IO.outputDoubleAnswer(result);
		} else if (operation == 4) {
			if (op2 == 0) {
				System.out.print("Error, division by 0");
			} else {
				double result = op1 / op2;
				IO.outputDoubleAnswer(result);			
			}
		} else {
			System.out.println("Invalid operation");
		}

	}

}
