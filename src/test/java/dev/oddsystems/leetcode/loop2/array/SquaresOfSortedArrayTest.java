package dev.oddsystems.leetcode.loop2.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquaresOfSortedArrayTest {

  private SquaresOfSortedArray solver = new SquaresOfSortedArray();

  @Test
  void testReturnsCorrectSquares() {
    // given
    int[] nums = {-4, -1, 0, 3, 10};
    int[] expected = {0, 1, 9, 16, 100};

    // when
    int[] squares = solver.sortedSquares(nums);

    // then
    assertArrayEquals(expected, squares);
  }
}
