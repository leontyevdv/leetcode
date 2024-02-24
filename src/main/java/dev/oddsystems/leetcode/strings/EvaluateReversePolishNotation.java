package dev.oddsystems.leetcode.strings;

import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReversePolishNotation {

  public static void main(String[] args) {
    String[] tokens = new String[] {"2", "1", "+", "3", "*"};
    System.out.println(evalRPN(tokens));
  }

  public static int evalRPN(String[] tokens) {
    String operators = "+-*/";

    Deque<Integer> stack = new LinkedList<>();
    for (String t : tokens) {
      if (!operators.contains(t)) {
        stack.push(Integer.parseInt(t));
      } else {
        int a = stack.pop();
        int b = stack.pop();
        switch (t) {
          case "+" -> stack.push(a + b);
          case "-" -> stack.push(b - a);
          case "*" -> stack.push(a * b);
          case "/" -> stack.push(b / a);
        }
      }
    }
    return stack.pop();
  }
}
