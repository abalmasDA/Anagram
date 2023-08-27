import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String word1, String word2) {

        if (!isNumberCharacterEqual(word1, word2)) {
            return false;
        }

        char[] arrayWord1 = splitWordToArrayChar(word1.toLowerCase());
        char[] arrayWord2 = splitWordToArrayChar(word2.toLowerCase());
        Arrays.sort(arrayWord1);
        Arrays.sort(arrayWord2);

        return Arrays.equals(arrayWord1, arrayWord2);

    }


    private static boolean isNumberCharacterEqual(String word1, String word2) {
        if (word1.length() == word2.length()) {
            return true;
        }
        return false;
    }

    private static char[] splitWordToArrayChar(String wordToSplit) {
        char[] arrayChar = new char[wordToSplit.length()];
        for (int i = 0; i < wordToSplit.length(); i++) {
            arrayChar[i] = wordToSplit.charAt(i);
        }
        return arrayChar;
    }


}
