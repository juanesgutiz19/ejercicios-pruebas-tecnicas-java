package exercises;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class CheckPermutation {

    // Statement: Given two strings, write a method to decide if one is permutation of the other
    // Explanation: One string is permutation of the other: abc -> bca, cab, bac...

    public static boolean checkPermutationBetweenStrings(String firstString, String secondString) {

        if (firstString.length() != secondString.length()) {
            return false;
        }

        char[] firstStringInCaracters = firstString.toCharArray();
        char[] secondStringInCaracters = secondString.toCharArray();

        sort(firstStringInCaracters);
        sort(secondStringInCaracters);

        return Arrays.equals(firstStringInCaracters, secondStringInCaracters);

        // O(n.log(n)) because of the sort method
    }


}
