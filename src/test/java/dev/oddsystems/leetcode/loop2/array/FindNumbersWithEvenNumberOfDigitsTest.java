package dev.oddsystems.leetcode.loop2.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindNumbersWithEvenNumberOfDigitsTest {

  private FindNumbersWithEvenNumberOfDigits solver = new FindNumbersWithEvenNumberOfDigits();

  @Test
  void testReturnsCorrectCount() {
    // given
    int[] nums = {12, 345, 2, 6, 7896};

    // when
    int count = solver.findNumbers(nums);

    // then
    assertEquals(2, count);
  }
}
