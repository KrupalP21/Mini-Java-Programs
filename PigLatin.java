public class PigLatin {

    public static void main (String[] args) {
        String original = IO.readString();
        translate(original);        
    } 
    public static String translate(String original) {    
        String translate = "";
        String firstLetter = new String();
        firstLetter = original.substring(0, 1);
        String vowelEnding = "vai";
        String consonantEnding = "ai";
        
        if(firstLetter.equalsIgnoreCase("a")) {
            translate = original + vowelEnding;
        }
        
        else if(firstLetter.equalsIgnoreCase("e")) {
            translate = original + vowelEnding;
        }
        
        else if(firstLetter.equalsIgnoreCase("i")) {
            translate = original + vowelEnding;
        }
        
        else if(firstLetter.equalsIgnoreCase("o")) {
            translate = original + vowelEnding;
        }
        
        else if(firstLetter.equalsIgnoreCase("u")) {
            translate = original + vowelEnding;
        }
        
        else {
            translate = original.substring(1) + firstLetter.toLowerCase() + consonantEnding;
        }
        
        IO.outputStringAnswer(translate);
        return translate;
        
    }
    
}	




