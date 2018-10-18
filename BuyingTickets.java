
public class BuyingTickets {

	public static void main(String[] args) {
System.out.print("How many tickets?");
int nTickets = IO.readInt();
double fullTicket = 10;
double cost = 0.0;

while ( nTickets > 0 ) { // condition is tested before entering the loop
	char tType;
	
	do { // condition is tested after the first iteration of the loop
		System.out.print("Ticket type: [a]-adult, [c]-child, [s]-senior: ");
		tType = IO.readChar();
		if ( tType == 'c' ) {
			cost = cost + fullTicket / 2;
		} else if (tType == 'a' ) {
		cost = cost + fullTicket;
		} else if (tType == 's') {
			cost = cost + fullTicket / 3;
		} else {
			System.out.print("Error: Invalid ticket type.");
		}
	} while (tType != 'c' && tType != 'a' && tType != 's');
nTickets = nTickets - 1;	
}
	IO.outputDoubleAnswer(cost);
}
	}

