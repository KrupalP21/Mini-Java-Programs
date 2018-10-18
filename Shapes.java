
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter number of lines: ");
int n = IO.readInt();

//print a square of stars
for (int l = 0; l < n; l++) { //iterates over the lines
	
	for(int k = 0; k < n; k++) { //prints a line of stars
		
		System.out.print("*");
	}
	System.out.println(); //prints a new line
}

//print a triangle of stars

for(int l = 0; l < n ; l++) {
	
	for(int k = 0; k <= l; k++) {
		System.out.print("* ");

	}
System.out.println();//prints a new line after every stars line
}
	}

}
