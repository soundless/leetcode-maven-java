package alg.easy.e_13_roman_to_integer;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_e_13_roman_to_integer() {
        Map<String, Integer> tests = new HashMap<>();
        tests.put("", 0);
        tests.put("I", 1);
        tests.put("VIII", 8);
        tests.put("X", 10);
        tests.put("XXIII", 23);
        tests.put("XCIX", 99);
        tests.put("CXXIII", 123);
        tests.put("DXLV", 545);
        tests.put("M", 1000);
        tests.put("MXXIV", 1024);
        tests.put("MCMXCIX", 1999);
        tests.put("MM", 2000);
        tests.put("MMMCMXCIX", 3999);
        for (Map.Entry m : tests.entrySet()) {
            Solution s = new Solution();
            assertEquals(m.getValue(), s.romanToInt(m.getKey().toString()));
        }
    }
}
