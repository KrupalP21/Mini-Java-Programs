
public class WordCount {
		public static int countWords(String original, int maxLength){
			int countwords = 0;
			String[] allwords = original.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
			for (int k = 0; k < allwords.length; k++)
			{
				if (allwords[k].length() <= maxLength)
				{
					countwords = countwords + 1;	
				}
			}
			return countwords;
		}
		public static void main(String[] args){
            System.out.println("Enter string: ");
            String s = IO.readString();

            System.out.println("Enter number: ");
            int x = IO.readInt();


            System.out.println(countWords(s, x));
    }
}
