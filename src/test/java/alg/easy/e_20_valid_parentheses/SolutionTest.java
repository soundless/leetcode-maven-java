package alg.easy.e_20_valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_20_valid_parentheses() {
        String[] valid_strings = {"()", "()[]{}", "[]({})"};
        String[] invalid_strings = {"(]", "([)]", "}"};
        Solution solution = new Solution();
        for (String valid : valid_strings) {
            System.out.println("test valid: " + valid);
            assertEquals(true, solution.isValid(valid));
        }
        for (String invalid: invalid_strings) {
            System.out.println("test invalid: " + invalid);
            assertEquals(false, solution.isValid(invalid));
        }
    }
}
