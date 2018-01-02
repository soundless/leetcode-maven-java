package alg.easy.e_9_palindrome_number;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void test_9_palindrome_number() {
        Map<Integer, Boolean> tests = new HashMap<>();
        tests.put(12321, true);
        tests.put(1221, true);
        tests.put(-12321, false);
        tests.put(Integer.MIN_VALUE, false);
        tests.put(1234567899, false);
        tests.put(0, true);
        for (Map.Entry m : tests.entrySet()) {
            Solution solution = new Solution();
            assertEquals(m.getValue(), solution.isPalindrome((int) m.getKey()));
        }
    }
}