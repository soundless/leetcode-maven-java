package alg.median.m_11_container_with_most_water;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void test_11_container_with_most_water() {
        int[] height = {1, 2, 3, 4, 3, 2, 1, 5};
        Solution solution = new Solution();
        assertEquals(16, solution.maxArea(height));
    }
}
