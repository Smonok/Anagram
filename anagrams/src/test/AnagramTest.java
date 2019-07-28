package test;

import anagram.Anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class AnagramTest {

    @Test
    void reverseEveryWord_NormalString_ReversedOnlyLettersInThisString() {
        String parameter = "d1c1ba hgf!e";
        String expectedResult = "a1b1cd efg!h";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWord_StringOfSpaces_SameString() {
        String parameter = "   ";
        String expectedResult = "   ";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWord_Null_IllegalArgumentException() {
        String parameter = null;
        assertThrows(IllegalArgumentException.class, () -> {
            new Anagram().reverseEveryWord(parameter);
        });
    }

    @Test
    void reverseEveryWord_OnlyNotLetters_SameString() {
        String parameter = "1234!`*";
        String expectedResult = "1234!`*";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }
    
    @Test
    void reverseEveryWord_EmptyString_EmptyString() {
        String parameter = "";
        String expectedResult = "";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }
    
    @Test
    void reverseEveryWord_OnlyLetters_SameString() {
        String parameter = "a b c d e";
        String expectedResult = "a b c d e";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }
    
    @Test
    void reverseEveryWord_OneWord_ReversedOnlyLettersInThisWord() {
        String parameter = "ytr3ewq";
        String expectedResult = "qwe3rty";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }
}
