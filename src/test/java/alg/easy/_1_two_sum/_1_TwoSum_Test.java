package alg.easy._1_two_sum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class _1_TwoSum_Test {

    @Test
    public void test_TwoSum() {
        int[] data = {9, 7, 2, 11};
        int[] expected = {2, 3};

        Solution solution = new Solution();
        int[] actual = solution.twoSum(data, 9);

        assertArrayEquals(expected, actual);
    }
}