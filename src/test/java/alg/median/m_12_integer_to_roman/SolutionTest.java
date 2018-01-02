package alg.median.m_12_integer_to_roman;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void test_m_13_integer_to_roman() {
        Map<Integer, String> tests = new HashMap<>();
        tests.put(1, "I");
        tests.put(8, "VIII");
        tests.put(10, "X");
        tests.put(23, "XXIII");
        tests.put(99, "XCIX");
        tests.put(123, "CXXIII");
        tests.put(545, "DXLV");
        tests.put(1000, "M");
        tests.put(1024, "MXXIV");
        tests.put(1999, "MCMXCIX");
        tests.put(2000, "MM");
        tests.put(3999, "MMMCMXCIX");
        for (Map.Entry m : tests.entrySet()) {
            Solution solution = new Solution();
            assertEquals(m.getValue(), solution.intToRoman((int) m.getKey()));
        }
    }
}
