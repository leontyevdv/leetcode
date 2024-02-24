package dev.oddsystems.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/** Given a string s, find the length of the longest substring without repeating characters. */
public class LengthOfLongestSubstring {

  public int lengthOfLongestSubstring(String s) {
    if (s.isEmpty()) return 0;

    Map<Character, Integer> map = new HashMap<>();
    int max = 0;
    for (int i = 0, j = 0; i < s.length(); ++i) {
      if (map.containsKey(s.charAt(i))) {
        j = Math.max(j, map.get(s.charAt(i)) + 1);
      }
      map.put(s.charAt(i), i);
      max = Math.max(max, i - j + 1);
    }
    return max;
  }
}
