package alg.easy.e_7_reverse_integer;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_e_7_reverse_integer() {
        Map<Integer, Integer> tests = new HashMap<>();
        tests.put(123, 321);
        tests.put(-123, -321);
        tests.put(120, 21);
        tests.put(1234567899, 0);
        tests.put(-1234567899, 0);
        tests.put(Integer.MAX_VALUE, 0);
        tests.put(Integer.MIN_VALUE, 0);
        tests.put(0, 0);
        tests.put(100, 1);
        tests.put(10000, 1);
        for (Map.Entry m : tests.entrySet()) {
            Solution solution = new Solution();
            assertEquals((int) m.getValue(), solution.reverse((int) m.getKey()));
        }
    }
}
