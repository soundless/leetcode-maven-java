package alg.easy.e_14_longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void test_e_13_longest_common_prefix() {
        String[] strs = {"hello", "help", "hell"};
        Solution solution = new Solution();
        String expected = "he";
        assertEquals(expected, solution.longestCommonPrefix(strs));

        String[] strs1 = {};
        assertEquals("", solution.longestCommonPrefix(strs1));
    }
}
