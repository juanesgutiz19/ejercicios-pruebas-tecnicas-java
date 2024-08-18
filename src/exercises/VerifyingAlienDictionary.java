package exercises;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAlienDictionary {

    // In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order.
    // The order of the alphabet is some permutation of lowercase letters.
    // Given a sequence of words written in the alien language, and the order of the alphabet,
    // return true if and only if the given words are sorted lexicographically in this alien language.

    // Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz". Output: true
    // Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

    public static boolean wordsAreInAlienLanguage(String[] words, String alphabeticalOrder) {
        for (int i = 0; i < words.length - 1; i++) {
            if (!isInAlienOrder(words[i], words[i + 1], alphabeticalOrder)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isInAlienOrder(String firstWord, String secondWord, String order) {

        Map<Character, Integer> diccionario = new HashMap<>();
        for (int index = 0; index < 26; index++) {
            diccionario.put(order.charAt(index), index + 1);
        }

        int shortestLength = Math.min(firstWord.length(), secondWord.length());

        for (int i = 0; i < shortestLength; i++) {
            int indexFirstWordChar = diccionario.get(firstWord.charAt(i));
            int indexSecondWordChar = diccionario.get(secondWord.charAt(i));

            if (indexFirstWordChar < indexSecondWordChar) {
                return true;
            } else if (indexFirstWordChar > indexSecondWordChar) {
                return false;
            }
        }

        return firstWord.length() <= secondWord.length();
    }


}
