
public class SmallestLargest {

	public static void main(String[] args) {
		
		System.out.println("Enter a terminating number: ");
		double termValue = IO.readDouble();
		
		double max = 0;
		double min = 0;		
		double num;
		
		System.out.println("Enter number: ");
		num = IO.readDouble();
		
		min = num;
		max = num;
		
		do {
			System.out.println("Enter number: ");
			num = IO.readDouble();
			
			if (num == termValue) {
				break;
			}
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			
				
		} while (num != termValue);
		
		System.out.println("Min value is: ");
		IO.outputDoubleAnswer(min);
		System.out.println("Max value is: ");
		IO.outputDoubleAnswer(max);
		}
	}


