package dev.oddsystems.leetcode.strings;

public class MaxConsecutiveElements {

  /**
   * Несмотря на то, что внутри функции два вложенных цикла, функция работает за линейное время даже
   * в худшем случае. Дело в том, что внутри вложенного цикла происходит только увеличение
   * next_letter_idx. Но она инициализирована 000 и не может стать больше, чем N,N,N, поэтому тело
   * вложенного цикла выполняется N+1N+1N+1, то есть O(N)O(N)O(N) раз.
   *
   * <p>От простого выноса внутреннего цикла в отдельную функцию асимптотика измениться не могла,
   * поэтому правильный ответ — O(N).O(N).O(N). Разберёмся, почему некорректен аргумент, приводящий
   * к ответу O(N2).O(N^2).O(N2). Дело в том, что худшие случаи, которые приводят к O(N)O(N)O(N) в
   * рассмотренных подзадачах — это разные худшие случаи. Они не могут происходить одновременно. Но
   * если смотреть на эти функции по отдельности, такой вывод сделать не очень просто.
   *
   * @param str
   * @return
   */
  public int maxConsecutiveElements(String str) {
    int result = 0;
    int curLetterIdx = 0;

    while (curLetterIdx < str.length()) {
      int nextLetterIdx = curLetterIdx;
      while (nextLetterIdx < str.length()
          && str.charAt(nextLetterIdx) == str.charAt(curLetterIdx)) {
        ++nextLetterIdx;
      }
      result = Math.max(result, nextLetterIdx - curLetterIdx);
      curLetterIdx = nextLetterIdx;
    }
    return result;
  }
}
