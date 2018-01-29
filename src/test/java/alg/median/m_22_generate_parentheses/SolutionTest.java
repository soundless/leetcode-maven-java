package alg.median.m_22_generate_parentheses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_m_22_generate_parentheses() {
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(1, Arrays.asList("()"));
        map.put(2, Arrays.asList("(())", "()()"));
        map.put(3, Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"));
        for (Map.Entry m: map.entrySet()) {
            Solution solution = new Solution();
            List<String> actual = solution.generateParentheses((int) m.getKey());
            assertEquals(m.getValue(), actual);
        }
    }
}
