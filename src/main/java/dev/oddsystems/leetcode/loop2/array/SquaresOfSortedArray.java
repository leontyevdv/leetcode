package dev.oddsystems.leetcode.loop2.array;

public class SquaresOfSortedArray {
  public int[] sortedSquares(int[] nums) {
    int[] squares = new int[nums.length];
    int left = 0;
    int right = nums.length - 1;
    int index = nums.length - 1;

    while (left <= right) {
      if (Math.abs(nums[left]) > Math.abs(nums[right])) {
        squares[index] = nums[left] * nums[left];
        left++;
      } else {
        squares[index] = nums[right] * nums[right];
        right--;
      }
      index--;
    }

    return squares;
  }
}
