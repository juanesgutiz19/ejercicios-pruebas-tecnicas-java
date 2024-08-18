package exercises;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    // Given a string, write a function to check if it is a permutation of a palindrome.
    // A palindrome is a word or phrase that is the same forwards and backwards. A permutation
    // is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
    // You can ignore casing and non-letters characters.

    public static boolean checkPalindromePermutation(String input) {
        String lowerCaseInput = input.toLowerCase();
        char[] inputInCharacters = lowerCaseInput.toCharArray();
        HashMap<Character, Integer> numberOfOcurrencesOfCharacter = new HashMap<>();
        int numberOfLetterCharacters = 0;

        for (char character : inputInCharacters) {
            if (character >= 'a' && character <= 'z') {
                if (!numberOfOcurrencesOfCharacter.containsKey(character)) {
                    numberOfOcurrencesOfCharacter.put(character, 1);
                } else {
                    int numberOfOcurrences = numberOfOcurrencesOfCharacter.get(character);
                    int newNumberOfOcurrences = numberOfOcurrences + 1;
                    numberOfOcurrencesOfCharacter.put(character, newNumberOfOcurrences);
                }
                numberOfLetterCharacters++;
            }
        }

        int numberOfOcurrencesOfCharacterSize = numberOfOcurrencesOfCharacter.size();
        int evenOcurrenceOfCharacters = countEvenOcurrenceOfCharacters(numberOfOcurrencesOfCharacter);
        if (isEven(numberOfLetterCharacters)) {
            return numberOfOcurrencesOfCharacterSize == evenOcurrenceOfCharacters;
        } else {
            return evenOcurrenceOfCharacters == numberOfOcurrencesOfCharacterSize - 1;
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static int countEvenOcurrenceOfCharacters(HashMap<Character, Integer> numberOfOcurrencesOfCharacter) {
        int evenCounter = 0;
        for (Map.Entry<Character, Integer> entry : numberOfOcurrencesOfCharacter.entrySet()) {
            if (isEven(entry.getValue())) {
                evenCounter++;
            }
        }
        return evenCounter;
    }

}
