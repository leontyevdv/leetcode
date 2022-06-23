package engineering.oddsystems.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

  private final BinarySearch binarySearch = new BinarySearch();

  @Test
  void testSearchRightBoundaryElement() {
    assertTrue(binarySearch.binary_search(new int[] {1, 2, 3, 4, 5}, 5));
  }

  @Test
  void testSearchLeftBoundaryElement() {
    assertTrue(binarySearch.binary_search(new int[] {1, 2, 3, 4, 5}, 1));
  }

  @Test
  void testSearchInEvenLengthArray() {
    assertTrue(binarySearch.binary_search(new int[] {1, 2, 3, 4, 5, 6}, 3));
  }

  @Test
  void testSearchInOddLengthArray() {
    assertTrue(binarySearch.binary_search(new int[] {1, 2, 3, 4, 5}, 3));
  }

  @Test
  void testSearchInSingleElementArray() {
    assertTrue(binarySearch.binary_search(new int[] {3}, 3));
  }

  @Test
  void testSearchInEmptyArray() {
    assertFalse(binarySearch.binary_search(new int[] {}, 3));
  }

  @Test
  void testSearchInNegativeElementsArray() {
    assertTrue(binarySearch.binary_search(new int[] {-5, -4, -3, -2, -1}, -3));
  }
}
