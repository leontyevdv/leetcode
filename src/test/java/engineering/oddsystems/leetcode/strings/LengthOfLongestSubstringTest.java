package engineering.oddsystems.leetcode.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LengthOfLongestSubstringTest {

  private final LengthOfLongestSubstring solution = new LengthOfLongestSubstring();

  @Test
  void testStr() {
    // given
    String s = "abcabcbb";

    // when
    int r = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(3, r);
  }

  @Test
  void testOneLetterStr() {
    // given
    String s = "bbbbb";

    // when
    int r = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(1, r);
  }

  @Test
  void testDoubleSymbolsInRow() {
    // given
    String s = "pwwkew";

    // when
    int r = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(3, r);
  }

  @Test
  void testSingleLetter() {
    // given
    String s = "p";

    // when
    int r = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(1, r);
  }

  @Test
  void testEmptyString() {
    // given
    String s = "";

    // when
    int r = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(0, r);
  }

  @Test
  void testAnotherString() {
    // given
    String s = "dvdf";

    // when
    int r = solution.lengthOfLongestSubstring(s);

    // then
    assertEquals(3, r);
  }
}
