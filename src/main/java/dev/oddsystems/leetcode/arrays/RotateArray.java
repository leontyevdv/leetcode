package dev.oddsystems.leetcode.arrays;

import java.util.Arrays;

/**
 * Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3, the
 * array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    RotateArray.rotate(arr, 11);
    System.out.println(Arrays.toString(arr));
  }

  public static void rotate(int[] arr, int k) {
    if (arr == null || k < 0) {
      throw new IllegalArgumentException("Illegal argument!");
    }

    k = k % arr.length;

    // length of first part
    int a = arr.length - k;

    reverse(arr, 0, a - 1);
    reverse(arr, a, arr.length - 1);
    reverse(arr, 0, arr.length - 1);
  }

  public static void reverse(int[] arr, int left, int right) {
    if (arr == null || arr.length == 1) {
      return;
    }

    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }
}
