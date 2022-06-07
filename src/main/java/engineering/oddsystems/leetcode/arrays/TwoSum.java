package engineering.oddsystems.leetcode.arrays;

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
    Map<Integer, Integer> memory = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int curr = nums[i];
      int adder = target - curr;
      if (memory.get(adder) != null) {
        return new int[] {memory.get(adder), i};
      }
      memory.put(curr, i);
    }
    return new int[0];
  }
}
