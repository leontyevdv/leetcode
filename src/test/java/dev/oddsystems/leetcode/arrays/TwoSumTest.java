package dev.oddsystems.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {

  private final TwoSum solution = new TwoSum();

  @Test
  public void testTwoSumEvenNumOfElements() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;

    int[] result = solution.twoSum(nums, target);

    assertArrayEquals(new int[] {0, 1}, result);
  }

  @Test
  public void testTwoSumOddNumOfElements() {
    int[] nums = {3, 2, 4};
    int target = 6;

    int[] result = solution.twoSum(nums, target);

    assertArrayEquals(new int[] {1, 2}, result);
  }

  @Test
  public void testTwoSumWithinTwoElements() {
    int[] nums = {3, 3};
    int target = 6;

    int[] result = solution.twoSum(nums, target);

    assertArrayEquals(new int[] {0, 1}, result);
  }
}
