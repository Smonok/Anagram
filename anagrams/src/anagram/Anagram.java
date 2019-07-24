package anagram;

public class Anagram {
    private final String WORDS_AND_SPACES = "(?<= )|(?= )";

    public String reverseEveryWord(String original) {
        String[] splitOriginal = original.split(WORDS_AND_SPACES);

        for (int i = 0; i < splitOriginal.length; i++)
            splitOriginal[i] = reverseWord(splitOriginal[i]);

        return String.join("", splitOriginal);
    }

    private String reverseWord(String inputWord) {
        StringBuilder word = new StringBuilder(inputWord);
        char[] symbols = new char[word.length()];
        int[] positions = new int[word.length()];
        int number = findNotLetters(word, positions, symbols);

        removeNotLetters(word, positions, number);
        word.reverse();
        insertNotLetters(word, positions, symbols, number);
        return word.toString();
    }

    private void removeNotLetters(StringBuilder word, int[] positions, int count) {
        for (int i = count - 1; i >= 0; i--)
            word.deleteCharAt(positions[i]);
    }

    private void insertNotLetters(StringBuilder word, int[] positions, char[] symbols, int count) {
        for (int i = 0; i < count; i++)
            word.insert(positions[i], symbols[i]);
    }

    private int findNotLetters(StringBuilder word, int[] positions, char[] symbols) {
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                symbols[index] = word.charAt(i);
                positions[index] = i;
                index++;
            }
        }
        return index;
    }
}

