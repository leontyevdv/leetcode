package engineering.oddsystems.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxLowerOrEqualTest {

  private final MaxLowerOrEqual maxLowerOrEqual = new MaxLowerOrEqual();

  @Test
  void testFindEqual() {
    assertEquals(3, maxLowerOrEqual.maxLowerOrEqual(new int[] {1, 2, 3, 4, 5}, 4));
  }

  @Test
  void testFindMaxLower() {
    assertEquals(2, maxLowerOrEqual.maxLowerOrEqual(new int[] {1, 3, 5, 7}, 6));
  }

  @Test
  void testFindMaxLowerRightBound() {
    assertEquals(2, maxLowerOrEqual.maxLowerOrEqual(new int[] {1, 2, 3}, 4));
  }

  @Test
  void testNotFoundInEmptyArray() {
    assertEquals(-1, maxLowerOrEqual.maxLowerOrEqual(new int[] {}, 4));
  }

  @Test
  void testNotFoundWhenXGreaterThanFirst() {
    assertEquals(-1, maxLowerOrEqual.maxLowerOrEqual(new int[] {5, 6, 7}, 4));
  }
}
