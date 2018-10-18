
public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			int dByThree = i % 3;
			int dByFive = i % 5;
			
			if (dByThree == 0 && dByFive == 0 ) {
				System.out.println("FizzBuzz");
			} else if ( dByThree == 0 ) {
				System.out.println("Fizz");
			} else if ( dByFive == 0) {
				System.out.println("Buzz");
			} else { 
				System.out.println(i);
			}
		}
	}
}

		
	


