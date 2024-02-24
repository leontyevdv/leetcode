package dev.oddsystems.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.oddsystems.leetcode.linkedlist.AddTwoNumbers.ListNode;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

  private final AddTwoNumbers solution = new AddTwoNumbers();

  @Test
  void addTwoNumbers() {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

    ListNode result = solution.addTwoNumbers(l1, l2);

    ListNode e = new ListNode(7, new ListNode(0, new ListNode(8)));
    assertEquals(e, result);
  }

  @Test
  void addTwoZeros() {
    ListNode l1 = new ListNode(0);
    ListNode l2 = new ListNode(0);

    ListNode result = solution.addTwoNumbers(l1, l2);

    ListNode e = new ListNode(0);
    assertEquals(e, result);
  }

  @Test
  void addTwoNumbersOfDiffLength() {
    ListNode l1 =
        new ListNode(
            9,
            new ListNode(
                9,
                new ListNode(
                    9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
    ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

    ListNode result = solution.addTwoNumbers(l1, l2);

    ListNode e =
        new ListNode(
            8,
            new ListNode(
                9,
                new ListNode(
                    9,
                    new ListNode(
                        9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
    assertEquals(e, result);
  }
}
