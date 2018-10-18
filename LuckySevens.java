
public class LuckySevens {

	public static void main(String[] args) {
		System.out.println("Enter lower bound: ");
		int lowerBound = IO.readInt();
		System.out.println("Enter higher bound: ");
		int higherBound = IO.readInt();
		
		if (lowerBound > higherBound) {
			IO.reportBadInput();
			return;
		}
		 	int count = 0;
	        String container = "";
	        int stringLength = 0;

	        for (int i = lowerBound; i <= higherBound; i++)
	        {
	            container = Integer.toString(i);
	            stringLength = container.length();
	            for (int j = 0; j < stringLength; j++)
	            {
	                if ((container.charAt(j)) == '7')
	                {
	                    count = count + 1;
	                }
	            }
	            
	            if (i == higherBound)
	            {
	                IO.outputIntAnswer(count);
	            }
	        }

	}

}
