public class Change {

	public static void main(String[] args){
		System.out.println("What is the salesTotal?");
		double saleTotal = IO.readDouble();

		System.out.println("What is the customerPayment?");
		double customerPayment = IO.readDouble();

		change(saleTotal, customerPayment);
	}


	public static void change(double saleTotal, double customerPayment) {
		

		if (customerPayment < saleTotal){
			IO.reportBadInput();
			IO.outputIntAnswer(-1);
			return;
		}
		else {
			double change = customerPayment - saleTotal;
			double bill130 = 0;
			double bill55 = 0;
			double bill25 = 0;
			double bill5 = 0;
			double bill1 = 0;
			double cents75 = 0;
			double cents30 = 0;
			double cents1 = 0;

			if ((change / 130.0) < 1) {
				bill130 = 0;
			}
			else {
				bill130 = Math.floor(change/130.0);
				change = change - bill130*130;
			}


			if ((change / 55.0) < 1) {
				bill55 = 0;
			}
			else {
				bill55 = Math.floor(change/55.0);
				change = change - bill55*55;
			}


			if ((change / 25.0) < 1) {
				bill25 = 0;
			}
			else {
				bill25 = Math.floor(change/25.0);
				change = change - bill25*25;
			}


			if ((change / 5.0) < 1) {
				bill5 = 0;
			}
			else {
				bill5 = Math.floor(change/5.0);
				change = change - bill5*5;
			}


			if ((change / 1) < 1) {
				bill1 = 0;
			}
			else {
				bill1 = Math.floor(change);
				change = change - bill1;
			}


			if ((change / 0.75) < 1) {
				cents75 = 0;
			}
			else {
				cents75 = Math.floor(change/0.75);
				change = change - cents75*0.75;
			}


			if ((change / 0.30) < 1) {
				cents30 = 0;
			}
			else {
				cents30 = Math.floor(change/0.30);
				change = change - cents30*0.30;
			}


			if ((change / 0.01) < 1) {
				cents1 = 0;
			}
			else {
				cents1 = Math.ceil(change/0.01);
				change = change - cents1*0.01;
			}


			IO.outputIntAnswer((int) bill130);
			IO.outputIntAnswer((int) bill55);
			IO.outputIntAnswer((int) bill25);
			IO.outputIntAnswer((int) bill5);
			IO.outputIntAnswer((int) bill1);
			IO.outputIntAnswer((int) cents75);
			IO.outputIntAnswer((int) cents30);
			IO.outputIntAnswer((int) cents1);

		}

	}





}
