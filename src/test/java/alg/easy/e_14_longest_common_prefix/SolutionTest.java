package alg.easy.e_14_longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void test_e_13_longest_common_prefix() {
        String[] strs = {"hello", "help", "hell"};
        Solution solution = new Solution();
        String expected = "hel";
        assertEquals(expected, solution.longestCommonPrefix(strs));

        String[] strs1 = {};
        assertEquals("", solution.longestCommonPrefix(strs1));

        String[] strs2 = {"a", "a", "a"};
        String expected2 = "a";
        assertEquals(expected2, solution.longestCommonPrefix(strs2));
    }
}
