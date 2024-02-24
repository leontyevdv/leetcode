package dev.oddsystems.leetcode.strings;

/** Time complexity - O(N) */
public class LongestPalindrome {

  public static void main(String[] args) {
    String str = "daabddfddbegtd";
    bruteForce(str);
    manacher(str);
  }

  /**
   * Time Complexity: O(N^3)
   *
   * <p>Space Complexity: O(1)
   *
   * @param str A given string
   */
  static void bruteForce(String str) {
    // All substrings of length 1 are palindromes
    int start = 0;
    int maxLength = 1;

    // Checking all the substrings
    int n = str.length();
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        boolean flag = true;

        // Checking for a palindromic subtring
        for (int k = 0; k < (j - i + 1) / 2; k++) {
          if (str.charAt(i + k) != str.charAt(j - k)) {
            flag = false;
          }
        }

        // If substring is palindromic
        if (flag && (j - i + 1) > maxLength) {
          start = i;
          maxLength = j - i + 1;
        }
      }
    }

    System.out.println(str.substring(start, start + maxLength) + "; length: " + maxLength);
  }

  /**
   * See an explanation of the Manacher's algorithm by link {@see
   * https://www.scaler.com/topics/data-structures/manachers-algorithm/}
   *
   * <p>Manacher's algorithm is used to find the longest palindromic substring in any given string.
   * This algorithm is faster than the brute force approach, as it exploits the idea of a palindrome
   * happening inside another palindrome.
   *
   * <p>Manacher's algorithm is designed to find the palindromic substrings with odd lengths only.
   * To use it for even lengths also, we tweak the input string by inserting the character "#" at
   * the beginning and each alternate position after that (changing "abcaac" to "#a#b#c#a#a#c#").
   *
   * <p>Time Complexity: O(N)
   *
   * <p>Space Complexity: O(N)
   */
  static void manacher(String s) {
    /*
     If length of given string is n then its length after
     inserting n+1 "#", one "@", and one "$" will be
     (n) + (n+1) + (1) + (1) = 2n+3
    */
    int strLen = 2 * s.length() + 3;
    char[] sChars = new char[strLen];

    /*
     Inserting special characters to ignore special cases
     at the beginning and end of the array
     "abc" -> @ # a # b # c # $
     "" -> @#$
     "a" -> @ # a # $
    */
    sChars[0] = '@';
    sChars[strLen - 1] = '$';
    int t = 1;
    for (char c : s.toCharArray()) {
      sChars[t++] = '#';
      sChars[t++] = c;
    }
    sChars[t] = '#';

    int maxLen = 0;
    int start = 0;
    int maxRight = 0;
    int center = 0;
    int[] p = new int[strLen]; // i's radius, which doesn't include i
    for (int i = 1; i < strLen - 1; i++) {
      if (i < maxRight) {
        p[i] = Math.min(maxRight - i, p[2 * center - i]);
      }

      // Expanding along the center
      while (sChars[i + p[i] + 1] == sChars[i - p[i] - 1]) {
        p[i]++;
      }

      // Updating center and its bound
      if (i + p[i] > maxRight) {
        center = i;
        maxRight = i + p[i];
      }

      // Updating ans
      if (p[i] > maxLen) {
        start = (i - p[i] - 1) / 2;
        maxLen = p[i];
      }
    }

    // Printing the longest Palindromic substring
    System.out.println(s.substring(start, start + maxLen) + "; length: " + maxLen);
  }
}
