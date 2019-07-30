package com.foxminded.test;

import com.foxminded.anagram.Anagram;

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
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlyOneSpace() {
        String parameter = " ";
        String expectedResult = " ";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsStringOfSpaces() {
        String parameter = "   ";
        String expectedResult = "   ";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlyOneLetter() {
        String parameter = "a";
        String expectedResult = "a";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsLowerCaseIdenticalLetters() {
        String parameter = "aaaaaaaaa";
        String expectedResult = "aaaaaaaaa";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWordShouldReturnReversedStringWhenInputContainsWordWithOnlyLetters() {
        String parameter = "ytrewq";
        String expectedResult = "qwerty";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWordShouldReturnReversedStringWhenInputContainsOneLetterWithDifferentCases() {
        String parameter = "aaAaaaA";
        String expectedResult = "AaaaAaa";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWordShouldReturnSameStringWhenInputContainsOnlyNonLetters() {
        String parameter = "1234!`*";
        String expectedResult = "1234!`*";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWordShouldReturnStringWithReversedOnlyLettersWhenInputContainsStringWithLettersAndNonLetters() {
        String parameter = "d1c1ba";
        String expectedResult = "a1b1cd";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }

    @Test
    void reverseEveryWordShouldReturnStringWithReversedOnlyLettersInEveryWordWhenInputStringContainsSeveralWordsWithLettersAndNonLetters() {
        String parameter = "d1c1ba hgf!e";
        String expectedResult = "a1b1cd efg!h";
        String result = new Anagram().reverseEveryWord(parameter);
        assertEquals(expectedResult, result);
    }
}
