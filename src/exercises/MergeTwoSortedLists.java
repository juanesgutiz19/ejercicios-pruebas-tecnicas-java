package exercises;

import java.util.Arrays;

public class MergeTwoSortedLists {

    // Given two lists of integers, nums1 and nums2, each sorted in ascending order, and two integers m and n,
    // which represent the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a
    // single sorted array in ascending order. For this, nums1 has a length of m + n, where the first m elements
    // denote the elements to be merged, and the last n elements are 0 and should be ignored.

    // nums1 = [1, 2, 3, 0, 0, 0]
    // m = 3
    // nums2 = [2, 5, 6]
    // n = 3
    //
    // ---> [1, 2, 2, 3, 5, 6]

    public static void mergeListsAscendingLineal(int[] nums1, int[] nums2, int m, int n) {
        int p1 = m - 1; // Pointer for nums1 (Since end)
        int p2 = n - 1; // Pointer for nums2 (Since end)
        int p = m + n - 1; // Pointer for the end of merged array

        // While there are elements to be merged
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
    }

    public static void mergeListsAscendingNlogaritmic(int[] nums1, int[] nums2, int m, int n) {
        for (int i = m ; i <= m + n - 1; i++) {
            nums1[i] = nums2[i - n];
        }

        Arrays.sort(nums1);
    }
}
