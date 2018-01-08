package alg.median.m_15_3sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_m_15_3sum() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        Solution solution = new Solution();
        List<Integer> a1 = new ArrayList<>();
        a1.add(-1);
        a1.add(0);
        a1.add(1);
        List<Integer> a2 = new ArrayList<>();
        a2.add(-1);
        a2.add(-1);
        a2.add(2);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(a1);
        expected.add(a2);
        assertEquals(expected, solution.threeSum(input));
    }
}
