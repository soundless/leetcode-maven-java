package alg.easy._1_two_sum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class _1_TwoSum_Test {

    @Test
    public void test_TwoSum() throws Exception {
        int[] data = {2, 7, 9, 11};
        int[] expected = {1, 2};

        Solution solution = new Solution();
        int[] actual = solution.twoSum(data, 9);

        assertArrayEquals(expected, actual);
    }
}