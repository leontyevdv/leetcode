package dev.oddsystems.leetcode.arrays;

public class SubArraySum {

  boolean subArraySum(int[] nonNegativeArr, int x) {
    int right = 0;
    int current_sum = 0;

    for (int left = 0; left < nonNegativeArr.length; ++left) {
      // recalculate sum
      if (left > 0) {
        current_sum -= nonNegativeArr[left - 1];
      }

      // shift the right boundary if needed
      while (right < nonNegativeArr.length && current_sum < x) {
        current_sum += nonNegativeArr[right];
        ++right;
      }

      if (current_sum == x) {
        return true;
      }
    }

    return false;
  }
}
