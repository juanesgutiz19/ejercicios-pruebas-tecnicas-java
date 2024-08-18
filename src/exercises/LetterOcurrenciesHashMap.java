package exercises;

import java.util.HashMap;

public class LetterOcurrenciesHashMap {

    // Statement: For an input String, return a HashMap containing each letter as its key and, as its value,
    // the number of times the letter appears in the string.

    public static HashMap<Character, Integer> countLetterOcurrencies(String word) {
        HashMap<Character, Integer> outputHashMap = new HashMap<>();
        word.chars()
                .mapToObj(intCaracter -> (char) intCaracter)
                .forEach(caracter -> {
                    int currentLetterOcurrencies;
                    if (outputHashMap.containsKey(caracter)) {
                        currentLetterOcurrencies = outputHashMap.get(caracter) + 1;
                    } else {
                        currentLetterOcurrencies = 1;
                    }
                    outputHashMap.put(caracter, currentLetterOcurrencies);

                });
        return outputHashMap;
        // O(n), n is the word length
    }
}
