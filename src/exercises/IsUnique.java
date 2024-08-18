package exercises;

import java.util.HashSet;

import static java.util.Arrays.sort;

public class IsUnique {

    // Statement: Implement an algorithm to determine if a string has all unique characters

    public static boolean isUniqueHashSet(String inputString) {
        HashSet<Character> uniqueCharacters = new HashSet<>();

        for (char character : inputString.toCharArray()) {
            if (uniqueCharacters.contains(character)) {
                return false;
            } else {
                uniqueCharacters.add(character);
            }
        }
        return true;
        // O(n), because the contains in HashSet is O(1)
    }

    public static boolean isUniqueWithoutDataStructures(String inputString) {
        char[] inputCaracters = inputString.toCharArray();
        sort(inputCaracters);

        for (int i = 0; i < inputCaracters.length - 1; i++) {
            if (inputCaracters[i] == inputCaracters[i + 1]) {
                return false;
            }
        }
        return true;
        // O(n.log(n)) - O(n.log(n)) of sort algorithm and O(n) of the loop, the worst case is O(n.log(n))
    }


}
