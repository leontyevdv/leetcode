package dev.oddsystems.leetcode.loop2.array;

/**
 * Time complexity: O(m + n)
 *
 * <p>Space complexity: O(1)
 */
public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int pIns = m + n - 1;

    while (p2 >= 0) {
      if (p1 >= 0 && nums1[p1] > nums2[p2]) {
        nums1[pIns--] = nums1[p1--];
      } else {
        nums1[pIns--] = nums2[p2--];
      }
    }
  }
}
