package dev.oddsystems.leetcode.loop2.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class RemoveElementTest {
  private RemoveElement solver = new RemoveElement();

  @Test
  void testReturnsCorrectLength() {
    // given
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;

    // when
    int length = solver.removeElement(nums, val);

    System.out.println(Arrays.toString(nums));
    // then
    // assertEquals(2, length);
  }
}
