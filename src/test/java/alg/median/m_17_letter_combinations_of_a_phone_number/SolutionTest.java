package alg.median.m_17_letter_combinations_of_a_phone_number;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_17_letter_combinations_of_a_phone_number() {
        String input = "23";
        List<String> expected = new ArrayList<>();
        expected.add("ad");
        expected.add("ae");
        expected.add("af");
        expected.add("bd");
        expected.add("be");
        expected.add("bf");
        expected.add("cd");
        expected.add("ce");
        expected.add("cf");
        Solution solution = new Solution();
        assertEquals(expected, solution.letterCombinations(input));
    }
}
