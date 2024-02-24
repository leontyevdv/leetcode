package dev.oddsystems.leetcode.misc;

import java.util.HashMap;
import java.util.Map;

public class RotateNumber180 {

  private final Map<Integer, Integer> dict;

  public RotateNumber180(Map<Integer, Integer> dict) {
    this.dict = new HashMap<>(dict);
  }

  public boolean isValid(int input) {
    int reversed = 0;
    int num = input;
    while (num > 0) {
      int rightMost = num % 10;
      reversed *= 10;
      reversed += dict.get(rightMost);

      num /= 10;
    }
    return input == reversed;
  }

  public static void main(String[] args) {
    Map<Integer, Integer> dict = new HashMap<>();
    dict.put(1, 1);
    dict.put(2, 5);
    dict.put(3, 3);
    dict.put(4, 4);
    dict.put(5, 2);
    dict.put(6, 9);
    dict.put(7, 7);
    dict.put(8, 8);
    dict.put(9, 6);
    dict.put(0, 0);

    RotateNumber180 app = new RotateNumber180(dict);
    System.out.println(app.isValid(100));
  }
}
