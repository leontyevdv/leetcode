package engineering.oddsystems.leetcode.arrays;

import java.lang.reflect.Array;

public class CircularBuffer<T> {

  private final T[] buffer;

  private int head = -1;

  @SuppressWarnings(value = "unchecked")
  public CircularBuffer(Class<T> clazz, int capacity) {
    buffer = (T[]) Array.newInstance(clazz, capacity);
  }

  public int put(T element) {
    head = ++head % buffer.length;
    buffer[head] = element;
    return head;
  }
}
