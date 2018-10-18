
public class PayFee {

	public static void main(String[] args) {
		System.out.print("Enter payment: ");
		double payment = IO.readDouble();
		
		if (payment <= 500) {
			double fee = 10;
			IO.outputDoubleAnswer(fee);
		} else if (payment > 500 && payment < 5000) {
			double fee1 = (payment * .01);
			double fee2 = 20;
			if (fee1 > fee2) {
				IO.outputDoubleAnswer(fee1);
			} else {
				IO.outputDoubleAnswer(fee2);
				
			}
		} else if (payment >= 5000 && payment < 10000 ) {
			double fee1 = (payment * .02);
			double fee2 = 120;
			if (fee1 > fee2) {
				IO.outputDoubleAnswer(fee1);
			} else {
				IO.outputDoubleAnswer(fee2);
			} 
		} else if (payment >= 10000 && payment < 15000) {
			   double fee1 = (payment * .02);
			   IO.outputDoubleAnswer(fee1);
		}else if (payment == 15000) {
				double fee1 = 200;
				double fee2 = fee1 + (payment * .03);
				IO.outputDoubleAnswer(fee2);
		} else if (payment > 15000) {
			    double fee1 = payment - 15000;
				double fee2 = fee1 * .04;
				double fee3 = fee2 + 200 + 150;
				IO.outputDoubleAnswer(fee3);
			
		} else { 
			System.out.print("Invalid Payment");		
	}
			
			}
		
	}
