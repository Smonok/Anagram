<<<<<<< HEAD
package anagram;
=======
import java.util.Arrays;
>>>>>>> parent of 448fba5... Cleaned the code (removed unnecessary import)

public class Anagram {
	
	 public String reverseEveryWord(String original){				
		 	final String SPLIT_KEEPING_SPACES = "(?<= )|(?= )";
		 	String[] splitStr = original.split(SPLIT_KEEPING_SPACES);		
						
			for(String splitted : splitStr) {
				StringBuilder word = new StringBuilder(splitted);
				char[] symbol = new char[word.length()];
				int[] position = new int[word.length()];
				int index = 0;
				for(int j = 0; j < word.length(); j++) {
					if(!Character.isLetter(word.charAt(j))) {
						symbol[index] = word.charAt(j);
						position[index] = j;
						index++;
					}						
				}
				
				for(int i = index - 1; i >= 0; i--)
					word.deleteCharAt(position[i]);
				
				word.reverse();
				
				for(int i = 0; i < index; i++)
					word.insert(position[i], symbol[i]); 				
			}
						
			return String.join("", splitStr);
	 }	
}