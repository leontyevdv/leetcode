package engineering.oddsystems.leetcode.arrays;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class CircularBufferTest {

  @Test
  public void testBuffer() {
    CircularBuffer<String> cb = new CircularBuffer<>(String.class, 10);

    OptionalDouble average =
        IntStream.range(0, 100)
            .map(num -> cb.put(String.valueOf(num)))
            .peek(System.out::println)
            .average();
  }

}
