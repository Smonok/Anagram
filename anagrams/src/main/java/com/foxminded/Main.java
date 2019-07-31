package main.java.com.foxminded;

import main.java.com.foxminded.Anagram;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String testStr = "d1c1ba hgf!e";
        System.out.format("Input string: %s\nString after reverse: %s", testStr, anagram.reverseEveryWord(testStr));
    }
}
