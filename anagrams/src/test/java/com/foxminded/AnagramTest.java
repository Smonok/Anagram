package test.java.com.foxminded;

import main.java.com.foxminded.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

    @Test
    void reverseEveryWordShouldThrowIllegalArgumentExceptionWhenNull() {
        String parameter = null;
        assertThrows(IllegalArgumentException.class, () -> new Anagram().reverseEveryWord(parameter));
    }

    @Test
    void reverseEveryWordShouldReturnEmptyStringWhenEmptyStringOnInput() {
        String parameter = "";
        String expectedactualResult = "";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlyOneSpace() {
        String parameter = " ";
        String expectedactualResult = " ";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlySpaces() {
        String parameter = "   ";
        String expectedactualResult = "   ";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlyOneLetter() {
        String parameter = "a";
        String expectedactualResult = "a";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsLowerCaseIdenticalLetters() {
        String parameter = "aaaaaaaaa";
        String expectedactualResult = "aaaaaaaaa";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnReversedStringWhenInputContainsWordWithOnlyLetters() {
        String parameter = "ytrewq";
        String expectedactualResult = "qwerty";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnReversedStringWhenInputContainsOneLetterWithDifferentCases() {
        String parameter = "aaAaaaA";
        String expectedactualResult = "AaaaAaa";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlyNonLetters() {
        String parameter = "1234!`*";
        String expectedactualResult = "1234!`*";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnStringWithReversedOnlyLettersWhenInputContainsStringWithLettersAndNonLetters() {
        String parameter = "d1c1ba";
        String expectedactualResult = "a1b1cd";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnStringWithReversedOnlyLettersInEveryWordWhenInputStringContainsSeveralWordsWithLettersAndNonLetters() {
        String parameter = "d1c1ba hgf!e";
        String expectedactualResult = "a1b1cd efg!h";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedactualResult, actualResult);
    }
}
