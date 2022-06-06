package engineering.oddsystems.leetcode.strings;

import java.util.List;
import org.junit.jupiter.api.Test;

class GenerateAllParenthesisCombinationsTest {

  private GenerateAllParenthesisCombinations generator = new GenerateAllParenthesisCombinations();

  @Test
  void testGenerateEven() {
    List<String> result = generator.generate(4);
    System.out.println(result);
  }

  @Test
  void generateOdd() {
    List<String> result = generator.generate(3);
    System.out.println(result);
  }
}
