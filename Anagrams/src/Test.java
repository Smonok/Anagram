
public class Test {

	public static void main(String[] args) {
		
		Anagram anagram = new Anagram();
		String testStr = "d1c1ba hgf!e";
		System.out.println(testStr + " => " + anagram.reverseEveryWord(testStr));	
	}
}
