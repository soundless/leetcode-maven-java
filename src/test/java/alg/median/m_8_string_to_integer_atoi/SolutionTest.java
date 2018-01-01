package alg.median.m_8_string_to_integer_atoi;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_8_string_to_integer_atoi() {
        Map<String, Integer> tests = new HashMap<>();
        tests.put("2345", 2345);
        tests.put(" 2345  ", 2345);
        tests.put("    -234 5", -234);
        tests.put("  1234a6789", 1234);
        tests.put("-0012a42", -12);
        tests.put("asdfdfs", 0);
        tests.put("", 0);
        tests.put("+1    ", 1);
        tests.put(",", 0);
        tests.put(Integer.toString(Integer.MAX_VALUE), Integer.MAX_VALUE);
        tests.put(Integer.toString(Integer.MIN_VALUE), Integer.MIN_VALUE);
        for (Map.Entry m : tests.entrySet()) {
            Solution solution = new Solution();
            assertEquals(m.getValue(), solution.myAtoi(m.getKey().toString()));
        }
    }
}
