package alg.median.m_3_longest_substring_without_repeating_characters;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class SolutionTest {
    @Test
    public void testSolution() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("abcabcbb", 3);
        hashMap.put("bbbbb", 1);
        hashMap.put("pwwkew", 3);
        hashMap.put("abbc", 2);
        Solution solution = new Solution();
        for (Map.Entry m:hashMap.entrySet()) {
            assertEquals(m.getValue(), solution.lengthOfLongestSubstring(m.getKey().toString()));
        }
    }
}
