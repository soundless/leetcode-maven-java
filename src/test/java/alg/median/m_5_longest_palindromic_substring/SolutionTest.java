package alg.median.m_5_longest_palindromic_substring;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testLongestPalindromicSubstring() throws Exception {
        Map<String, String> tests = new HashMap<>();
        tests.put("bab", "babad");
        tests.put("bb", "cbbd");
        tests.put("b", "b");
        tests.put("a", "ab");
        tests.put("12321", "122112321");
        tests.put("aaaaaaaaaaa", "aaaaaaaaaaa");
        tests.put("abcbabcba", "babcbabcbaccba");
        for (Map.Entry m : tests.entrySet()) {
            Solution solution = new Solution();
            assertEquals(m.getKey().toString(), solution.longestPalindrome(m.getValue().toString()));
        }
    }
}