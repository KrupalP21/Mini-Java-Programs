
public class Factorial {

	public static void main(String[] args) {
System.out.print("Enter a number: ");
int n = IO.readInt();

//example of factorial using a for loop
int fact = 1;
for (int i =2; i <= n; i = i + 1) {
	fact = fact * i;
}
IO.outputIntAnswer(fact);
//example of factorial using a while loop

fact = 1;
int i = 2;
while ( i <= n) {
	fact = fact * i;
	i = i + 1;
}
IO.outputIntAnswer(fact);
	}

}
