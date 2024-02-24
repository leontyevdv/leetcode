package dev.oddsystems.leetcode.loop2.array;

public class FindMaxConsecutiveOnes {

  public int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int current = 0;
    for (int num : nums) {
      if (num == 1) {
        current++;
      } else {
        max = Math.max(max, current);
        current = 0;
      }
    }
    return Math.max(max, current);
  }
}
