package engineering.oddsystems.leetcode.arrays;

public class BinarySearch {

  boolean binary_search(int[] arr, int x) {
    int leftIdx = 0;
    int rightIdx = arr.length;

    // Exclude the right boundary
    while (leftIdx < rightIdx) {
      int midIdx = (leftIdx + rightIdx) / 2;
      if (arr[midIdx] == x) {
        return true;
      } else if (arr[midIdx] < x) {
        leftIdx = midIdx + 1;
      } else {
        rightIdx = midIdx;
      }
    }
    return false;
  }
}
