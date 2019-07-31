package test.java.com.foxminded;

import main.java.com.foxminded.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

    @Test
    void reverseEveryWordShouldThrowIllegalArgumentExceptionWhenNull() {
        String parameter = null;
        assertThrows(IllegalArgumentException.class, () -> {
            new Anagram().reverseEveryWord(parameter);
        });
    }

    @Test
    void reverseEveryWordShouldReturnEmptyStringWhenEmptyStringOnInput() {
        String parameter = "";
        String expectedResult = "";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlyOneSpace() {
        String parameter = " ";
        String expectedResult = " ";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlySpaces() {
        String parameter = "   ";
        String expectedResult = "   ";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlyOneLetter() {
        String parameter = "a";
        String expectedResult = "a";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsLowerCaseIdenticalLetters() {
        String parameter = "aaaaaaaaa";
        String expectedResult = "aaaaaaaaa";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnReversedStringWhenInputOnlyLetters() {
        String parameter = "ytrewq";
        String expectedResult = "qwerty";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnReversedStringWhenInputContainsSameLetterWithDifferentCases() {
        String parameter = "aaAaaaA";
        String expectedResult = "AaaaAaa";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlyNonLetters() {
        String parameter = "1234!`*";
        String expectedResult = "1234!`*";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnStringWithReversedOnlyLettersWhenInputContainsStringWithLettersAndNonLetters() {
        String parameter = "d1c1ba";
        String expectedResult = "a1b1cd";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseEveryWordShouldReturnStringWithReversedOnlyLettersInEveryWordWhenInputStringContainsSeveralWordsWithLettersAndNonLetters() {
        String parameter = "d1c1ba hgf!e";
        String expectedResult = "a1b1cd efg!h";
        String actualResult = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, actualResult);
    }
}
