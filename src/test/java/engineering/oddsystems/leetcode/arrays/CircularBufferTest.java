package engineering.oddsystems.leetcode.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class CircularBufferTest {

  @TestFactory
  Stream<DynamicTest> dynamicTestsFromStreamInJava8() {
    int capacity = 10;
    CircularBuffer<String> cb = new CircularBuffer<>(String.class, capacity);
    IntStream.range(0, capacity).forEach(it -> cb.put(String.valueOf(it)));

    return IntStream.range(0, 100)
        .boxed()
        .map(
            idx ->
                DynamicTest.dynamicTest(
                    "Index: " + idx,
                    () -> assertEquals(String.valueOf(idx % capacity), cb.get(idx))));
  }
}
