package alg.median.m_18_4sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_m_18_4sum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> a1 = Arrays.asList(-2, -1, 2, 1);
        List<Integer> a2 = Arrays.asList(-2, 0, 2, 0);
        List<Integer> a3 = Arrays.asList(-1, 0, 1, 0);
        expected.add(a1);
        expected.add(a2);
        expected.add(a3);
        Solution solution = new Solution();
        List<List<Integer>> actual = solution.fourSum(nums, target);
        assertEquals(expected, actual);
    }
}
