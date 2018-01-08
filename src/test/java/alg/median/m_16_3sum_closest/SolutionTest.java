package alg.median.m_16_3sum_closest;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test_m_16_3sum_closest() {
        int[] S = {-1, 2, 1, -4};
        int target = 1;
        int expected = 2;
        Solution solution = new Solution();
        assertEquals(expected, solution.threeSumClosest(S, target));

        int[] S1 = {-1, 0, 1, 2, -1, -4};
        // target, expected
        Map<Integer, Integer> tests = new HashMap<>();
        tests.put(0, 0);
        tests.put(1, 1);
        tests.put(2, 2);
        tests.put(4, 3);
        tests.put(-6, -6);
        tests.put(-7, -6);
        for (Map.Entry m : tests.entrySet()) {
            Solution solution1 = new Solution();
            assertEquals(m.getValue(), solution1.threeSumClosest(S1, (int) m.getKey()));
        }
    }
}
