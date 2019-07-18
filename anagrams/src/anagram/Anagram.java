package anagram;

public class Anagram {
	
	public String reverseEveryWord(String original){	
		final String splitKeepingSpaces = "(?<= )|(?= )";
	 	String[] splitStr = original.split(splitKeepingSpaces);		
				
		for(int i = 0; i < splitStr.length; i++){
			StringBuilder word = new StringBuilder(splitStr[i]);
			char[] symbols = new char[word.length()];
			int[] positions = new int[word.length()];
			int count = 0;
			for(int j = 0; j < word.length(); j++) {
				if(!Character.isLetter(word.charAt(j))) {
					symbols[count] = word.charAt(j);
					positions[count] = j;										
					count++;
				}						
			}
			
			removeNotLetters(word, positions, count);			
			word.reverse();
			insertNotLetters(word, positions, symbols, count);									
			splitStr[i] = word.toString();
		}
		
		return String.join("", splitStr);
	}	
	
	private void removeNotLetters(StringBuilder word, int[] notLettersPositions, int notLettersCount) {
		for(int i = notLettersCount - 1; i >= 0; i--)
			word.deleteCharAt(notLettersPositions[i]);		
	}
	
	private void insertNotLetters(StringBuilder word, int[] notLettersPositions, char[] notLettersSymbols, int notLettersCount) {
		for(int j = 0; j < notLettersCount; j++)
			word.insert(notLettersPositions[j], notLettersSymbols[j]);	
	}
}

