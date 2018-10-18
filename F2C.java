/*
 * Converts from Fahrenheit to Celsius 
 */
public class F2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Please enter the temperature in Fahrenheit: ");
		double tempF = IO.readDouble();
		
		while (tempF < -459.67) {
			System.out.println("error: temperature is too low less than -459.67");
			System.out.print("Please enter the temperature again: ");
			tempF = IO.readDouble();
		}
		
			//only executed if tempF > -459.67
		double tempC = (tempF - 32) * 5 / 9;
		IO.outputDoubleAnswer(tempC);
		
}
}
