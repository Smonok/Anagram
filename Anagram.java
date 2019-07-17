
public class Anagram {

	public static void main(String[] args) {
		String testStr = "d1c1ba hgf!e";
		System.out.println(testStr + " => " + "["+reverseEveryWord(testStr)+"]");	
	}

	 public static String reverseEveryWord(String original){
			String[] splitStr = original.split("(?<= )|(?= )");
			String str="";
						
			for(String splited: splitStr) {
				StringBuilder word = new StringBuilder(splited);
				char[] symb = new char[word.length()];
				int[] position = new int[word.length()];
				int indx = 0;
				for(int j=0;j<word.length();j++) {
					if(!Character.isLetter(word.charAt(j))) {
						symb[indx] = word.charAt(j);
						position[indx] = j;
						indx++;
					}						
				}
				
				for(int i=indx-1;i>=0;i--)
					word.deleteCharAt(position[i]);
				
				word.reverse();
				
				for(int i=0;i<indx;i++)
					word.insert(position[i], String.valueOf(symb[i]));
				
				str += word.toString();
			}
			return str;
	 }
	 
	 
	
	
}
