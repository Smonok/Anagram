package test;

import anagram.Anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class AnagramTest {

    @Test
    void reverseEveryWord_NormalString_ThisStringReversed() {
        String parameter = "d1c1ba hgf!e";
        String expResult = "a1b1cd efg!h";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expResult, result);
    }

    @Test
    void reverseEveryWord_StringOfSpaces_SameString() {
        String parameter = "   ";
        String expResult = "   ";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expResult, result);
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
        String expResult = "1234!`*";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expResult, result);
    }
}
