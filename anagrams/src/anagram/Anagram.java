package anagram;

public class Anagram {
	
    public String reverseEveryWord(String original){
        final String splitKeepingSpaces = "(?<= )|(?= )";
        String[] splitOriginal = original.split(splitKeepingSpaces);	
        
        for(int i = 0; i < splitOriginal.length; i++){
            StringBuilder word = new StringBuilder(splitOriginal[i]);
            char[] symbols = new char[word.length()];
            int[] positions = new int[word.length()];
            int number = findNotLetters(word, positions, symbols);
            
            removeNotLetters(word, positions, number);
            word.reverse();
            insertNotLetters(word, positions, symbols, number);
            splitOriginal[i] = word.toString();
        }
        
        return String.join("", splitOriginal);
    }	
	
    private void removeNotLetters(StringBuilder word, int[] positions, int numberOfNotLetters) {
        for(int i = numberOfNotLetters - 1; i >= 0; i--)
            word.deleteCharAt(positions[i]);
    }
    
    private void insertNotLetters(StringBuilder word, int[] positions, char[] symbols, int numberOfNotLetters) {
        for(int i = 0; i < numberOfNotLetters; i++)
            word.insert(positions[i], symbols[i]);	
    }
	
    private int findNotLetters(StringBuilder word, int[] positions, char[] symbols) {
        int index = 0;
        for(int i = 0; i < word.length(); i++) {
            if(!Character.isLetter(word.charAt(i))) {
                symbols[index] = word.charAt(i);
                positions[index] = i;
                index++;
            }
        }
        
        return index;
    }    
}

