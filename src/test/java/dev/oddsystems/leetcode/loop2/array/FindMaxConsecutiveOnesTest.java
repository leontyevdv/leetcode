package dev.oddsystems.leetcode.loop2.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaxConsecutiveOnesTest {

  private FindMaxConsecutiveOnes solver = new FindMaxConsecutiveOnes();

  @Test
  void testReturnsCorrectConsequence() {
    // given
    int[] nums = {1, 1, 0, 1, 1, 1};

    // when
    int maxConsequence = solver.findMaxConsecutiveOnes(nums);

    // then
    Assertions.assertEquals(3, maxConsequence);
  }

  @Test
  void testReturnsZeroIfNoOnes() {
    // given
    int[] nums = {0, 0, 0, 0, 0};

    // when
    int maxConsequence = solver.findMaxConsecutiveOnes(nums);

    // then
    Assertions.assertEquals(0, maxConsequence);
  }

  @Test
  void testReturnsZeroIfEmptyArray() {
    // given
    int[] nums = {};

    // when
    int maxConsequence = solver.findMaxConsecutiveOnes(nums);

    // then
    Assertions.assertEquals(0, maxConsequence);
  }

  @Test
  void testReturnsCorrectMaxConsequenceIfAllOnes() {
    // given
    int[] nums = {1, 1, 1, 1, 1};

    // when
    int maxConsequence = solver.findMaxConsecutiveOnes(nums);

    // then
    Assertions.assertEquals(5, maxConsequence);
  }
}
