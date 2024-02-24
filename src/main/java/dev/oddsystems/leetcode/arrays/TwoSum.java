package dev.oddsystems.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 *
 * <p>You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * <p>You can return the answer in any order.
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
    for (int i = 1; i < nums.length; i++) {
      for (int j = 0; j + i < nums.length; j++) {
        if (nums[j] + nums[j + i] == target) {
          res[0] = j;
          res[1] = j + i;
          return res;
        }
      }
    }
    return res;
  }
}
