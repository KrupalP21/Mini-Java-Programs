
public class LuckyNines {

	public static void main(String[] args) {
		System.out.println("Enter lower bound: ");
		int lowerEnd = IO.readInt();
		System.out.println("Enter higher bound: ");
		int upperEnd = IO.readInt();
		int answer = countLuckyNines(lowerEnd,upperEnd);
		IO.outputIntAnswer(answer);
	}
	
	public static int countLuckyNines(int lowerEnd, int upperEnd) {
	
	
	
	if (lowerEnd > upperEnd) {
		IO.reportBadInput();
	return -1;
	}
	 	int count = 0;
        String container = "";
        int stringLength = 0;

        for (int i = lowerEnd; i <= upperEnd; i++)
        {
            container = Integer.toString(i);
            stringLength = container.length();
            for (int j = 0; j < stringLength; j++)
            {
                if ((container.charAt(j)) == '9')
                {
                    count = count + 1;
                }
            }
            
        
            
            }
    return count;    
	}

	}

