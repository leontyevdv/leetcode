package engineering.oddsystems.leetcode.arrays;

public class MaxLowerOrEqual {

  int maxLowerOrEqual(int[] sortedArr, int x) {
    // Check if the search element exists
    if (sortedArr.length == 0 || sortedArr[0] > x) {
      return -1;
    }

    int leftIdx = 0;
    int rightIdx = sortedArr.length;
    while (leftIdx + 1 < rightIdx) {
      int midIdx = (leftIdx + rightIdx) / 2;
      if (sortedArr[midIdx] <= x) {
        leftIdx = midIdx;
      } else {
        rightIdx = midIdx;
      }
    }
    return leftIdx;
  }
}
