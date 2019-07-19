package anagram;

public class Anagram {
	
    public String reverseEveryWord(String original){
        final String splitKeepingSpaces = "(?<= )|(?= )";
        String[] splitOriginal = original.split(splitKeepingSpaces);	
        
        for(int i = 0; i < splitOriginal.length; i++){
            StringBuilder word = new StringBuilder(splitOriginal[i]);
            char[] symbols = new char[word.length()];
            int[] positions = new int[word.length()];
            int number = 0;
            
            rememberNotLetters(word, positions, symbols, number);
            removeNotLetters(word, positions, number);
            word.reverse();
            insertNotLetters(word, positions, symbols, number);
            splitOriginal[i] = word.toString();
        }
        
        return String.join("", splitOriginal);
    }	
	
    private void removeNotLetters(StringBuilder word, int[] notLettersPositions, int numberOfNotLetters) {
        for(int i = numberOfNotLetters - 1; i >= 0; i--)
            word.deleteCharAt(notLettersPositions[i]);
    }
    
    private void insertNotLetters(StringBuilder word, int[] notLettersPositions, char[] notLettersSymbols, int numberOfNotLetters) {
        for(int i = 0; i < numberOfNotLetters; i++)
            word.insert(notLettersPositions[i], notLettersSymbols[i]);	
    }
	
    private void rememberNotLetters(StringBuilder word, int[] notLettersPositions, char[] notLettersSymbols, int notLettersCounter) {
        for(int i = 0; i < word.length(); i++) {
            if(!Character.isLetter(word.charAt(i))) {
                notLettersSymbols[notLettersCounter] = word.charAt(i);
                notLettersPositions[notLettersCounter] = i;
                notLettersCounter++;
            }
        }
    }	
}

