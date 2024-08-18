package exercises;

public class URLify {

    // Statement: URLify Write a method to replace all spaces in a string with '%20'.
    // You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string.
    // (Note: if implementing in java, please use a character array so that you can perform this operation in place.)
    // Input:  "Mr John Smith    ", 13
    // Output: "Mr%20John%20Smith"

    public static String URLifyStringNewArray(String inputString, int stringTrueLength) {
        final String SPACE_REPRESENTATION = "%20";

        char[] stringURLified = new char[inputString.length()];

        char[] inputStringInCaracters = inputString.toCharArray(); // O(n)

        int indexToFillStringURLified = 0;
        int indexToIterateInputStringInCaracters = 0;

        while (indexToIterateInputStringInCaracters < stringTrueLength) {
            if (inputStringInCaracters[indexToIterateInputStringInCaracters] != ' ') {
                stringURLified[indexToFillStringURLified] = inputStringInCaracters[indexToIterateInputStringInCaracters];
            } else {
                for (int i = indexToFillStringURLified; i < indexToFillStringURLified + 3; i++) {
                    stringURLified[i] = SPACE_REPRESENTATION.toCharArray()[i - indexToFillStringURLified];
                }
                indexToFillStringURLified = indexToFillStringURLified + 2;
            }
            indexToFillStringURLified++;
            indexToIterateInputStringInCaracters++;
        }

        return new String(stringURLified);
    }

    public static void URLifyStringInPlace(char[] str, int trueLength) {
        int numberOfSpaces = countSpaces(str, trueLength); // O(n), n = trueLength
        int newIndex = trueLength - 1 + numberOfSpaces * 2;

        if (newIndex + 1 < str.length) {
            str[newIndex + 1] = '\0';
        }

        for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) { // O(n), n = trueLength
            if (str[oldIndex] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex = newIndex - 3;
            } else {
                str[newIndex] = str[oldIndex];
                newIndex--;
            }
        }
        // O(n) + O(n) = O(n)
        // The time complexity of the algorithm is O(n) where n is trueLength.
    }

    private static int countSpaces(char[] str, int end) {
        int count = 0;
        for (int i = 0; i < end; i++) {
            if (str[i] == ' ') {
                count++;
            }
        }
        return count;
    }

}
