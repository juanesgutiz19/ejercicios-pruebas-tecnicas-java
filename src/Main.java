import static exercises.MergeTwoSortedLists.mergeListsAscendingLineal;
import static exercises.MergeTwoSortedLists.mergeListsAscendingNlogaritmic;

public class Main {
    public static void main(String[] args) {

//        HashMap<Character, Integer> letterOcurrenciesHashMap = countLetterOcurrencies("LHHHOOLAHA");
//        System.out.println(letterOcurrenciesHashMap);

//        System.out.println(isUniqueHashSet("HOLA"));
//        System.out.println(isUniqueWithoutDataStructures("HOLA"));

//        System.out.println(checkPermutationBetweenStrings("abcd", "abcd"));
//        System.out.println(checkPermutationBetweenStrings("abcd", "dcba"));
//        System.out.println(checkPermutationBetweenStrings("abcd", "abcde"));
//        System.out.println(checkPermutationBetweenStrings("abcd", "abcf"));
//        System.out.println(checkPermutationBetweenStrings("", ""));
//        System.out.println(checkPermutationBetweenStrings("aabbcc", "abcabc"));
//        System.out.println(checkPermutationBetweenStrings("a", "a"));

//        System.out.println(URLifyStringNewArray("Mr John Smith    ", 13));

//        char[] input = "Mr John Smith    ".toCharArray();
//        URLifyStringInPlace(input, 13);
//        System.out.println(input);

//        System.out.println(checkPalindromePermutation("Tact Coa"));
//        System.out.println(checkPalindromePermutation("a"));
//        System.out.println(!checkPalindromePermutation("ab"));
//        System.out.println(checkPalindromePermutation("aa"));
//        System.out.println(checkPalindromePermutation("abccba"));

//        String[] words = {"hello","leetcode"};
//        System.out.println(wordsAreInAlienLanguage(words, "hlabcdefgijkmnopqrstuvwxyz"));

//        String[] words = {"habito", "hacer", "lectura", "sonreir"};
//        System.out.println(wordsAreInAlienLanguage(words, "hlabcdefgijkmnopqrstuvwxyz"));


//        String[] words = {"conocer", "cono"};
//        System.out.println(wordsAreInAlienLanguage(words, "abcdefghijkImnopgrstuvwxyz"));

//        Animal catOne = new Cat("Katty");
//        Animal dogOne = new Dog("Zeus");
//
//        catOne.makeSound();
//        dogOne.makeSound();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        mergeListsAscendingNlogaritmic(nums1, nums2, m, n);

        // Output the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}