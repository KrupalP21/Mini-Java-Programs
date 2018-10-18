
public class TwoSmallest {

/*	public static void main(String[] args) {
int numCount = 0;
System.out.print("Enter terminator: ");
double terminator = IO.readDouble();
numCount  = numCount + 1;
System.out.print("Enter number: ");
double currentNum = IO.readDouble();
double firstSmall;
double secondSmall;
// FIRST PART DEALS WITH THE "FIRST" COUPLE NUMBER ERROR CASES
if (currentNum != terminator) {
	firstSmall = currentNum;
	secondSmall = currentNum;
	numCount = numCount + 1;
} else {
	do {
		IO.reportBadInput();
		System.out.print("Enter number: ");
		currentNum = IO.readDouble();
		} while (currentNum == terminator);
		firstSmall = currentNum;
		secondSmall = currentNum;
		numCount = numCount + 1;
}
System.out.print("Enter number: ");
currentNum = IO.readDouble();
if (currentNum == terminator) {
	do {
		IO.reportBadInput();
		System.out.print("Enter number: ");
		currentNum = IO.readDouble();
	} while (currentNum == terminator);
	numCount = numCount + 1;
} else {
	numCount = numCount + 1;
if (currentNum < firstSmall) {
	double tempNum = firstSmall;
	firstSmall = currentNum;
	secondSmall = tempNum;
} else {
	secondSmall = currentNum;
}
	//SECOND PART DEALS WITH LONGER CASES AFTER A COUNT OF 3
if (numCount == 3) {
	System.out.print("Enter number: ");
	currentNum = IO.readDouble();
	while (currentNum != terminator) {
		if (currentNum < firstSmall) {
			double tempNum = firstSmall;
			currentNum = firstSmall;
			secondSmall = tempNum;
		} else {
			if (currentNum < secondSmall) {
			secondSmall = currentNum;
			}
		}
		System.out.print("Enter number: ");
		currentNum = IO.readDouble();
	}
}
		IO.outputDoubleAnswer(firstSmall);
		IO.outputDoubleAnswer(secondSmall);
	}
}
	}
*/
	 public static void main(String [] args){

			int numCount=0;
			double firstSmall;
			double secondSmall;
			System.out.print("Enter a terminator: ");
			double terminator = IO.readDouble();
			numCount = numCount + 1; 
			System.out.print("Enter a number: ");
			double currentNum = IO.readDouble();
			if(currentNum != terminator){
			    firstSmall = currentNum;
			    secondSmall = currentNum;
			    numCount = numCount + 1;
			} else { 
			    do {
				IO.reportBadInput();
				System.out.print("Enter a number: ");
				currentNum = IO.readDouble();
				}
			    while(currentNum == terminator);
			    firstSmall = currentNum;
			    secondSmall = currentNum;
			    numCount = numCount + 1;
			}
			System.out.print("Enter a number: ");
			currentNum = IO.readDouble();
			if(currentNum == terminator){
			    do{
				IO.reportBadInput();
				System.out.print("Enter a number: ");
				currentNum = IO.readDouble();
			    }
			    while(currentNum == terminator);
			    numCount = numCount + 1;
			}
			else
			    numCount = numCount + 1;
			if(currentNum < firstSmall) {
			    double tempNum = firstSmall;
			    firstSmall = currentNum;
			    secondSmall = tempNum;
			}
			else
				secondSmall = currentNum;
			if(numCount == 3){
				System.out.print("Enter a number: ");
			    currentNum = IO.readDouble();
			    while(currentNum != terminator){
				if(currentNum < firstSmall){
				    double tempNum = firstSmall;
				    firstSmall = currentNum;
				    secondSmall = tempNum;
				}
				else{
				    if(currentNum < secondSmall)
					secondSmall = currentNum;
				}
				System.out.print("Enter a number: ");
				currentNum = IO.readDouble();
			    }
			}
			System.out.print("Smallest: ");
			IO.outputDoubleAnswer(firstSmall);
			System.out.print("Second Smallest: ");
			IO.outputDoubleAnswer(secondSmall);
			
		    }
		}