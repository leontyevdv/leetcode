package dev.oddsystems.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a number N. Generate all correct parenthesis sequences from N opening and N closing
 * parenthesis.
 */
public class GenerateAllParenthesisCombinations {

  /**
   * @param leftOpen Number of opening parenthesis remained
   * @param leftClosed Number of closing parenthesis remained
   * @param accum Current sequence
   * @param result All combinations
   */
  private void generate(int leftOpen, int leftClosed, String accum, List<String> result) {
    if (leftOpen <= 0 && leftClosed <= 0) {
      result.add(accum);
      return;
    }

    if (leftOpen > 0) {
      generate(leftOpen - 1, leftClosed, accum + "(", result);
    }

    if (leftClosed > leftOpen) {
      generate(leftOpen, leftClosed - 1, accum + ")", result);
    }
  }

  public List<String> generate(int n) {
    List<String> result = new ArrayList<>();
    generate(n, n, "", result);
    return result;
  }
}
