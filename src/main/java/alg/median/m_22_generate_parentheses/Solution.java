/*
 * [22] Generate Parentheses
 *
 * https://leetcode.com/problems/generate-parentheses
 *
 * algorithms
 * Medium (46.56%)
 * Total Accepted:    180.5K
 * Total Submissions: 387.6K
 * Testcase Example:  '3'
 *
 *
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 *
 *
 *
 * For example, given n = 3, a solution set is:
 *
 *
 * [
 * ⁠ "((()))",
 * ⁠ "(()())",
 * ⁠ "(())()",
 * ⁠ "()(())",
 * ⁠ "()()()"
 * ]
 *
 */
package alg.median.m_22_generate_parentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", n, n);
        return result;
    }

    private void dfs(List<String> result, String temp, int left, int right) {
        // left > right means more ")" than "(", we should stop here
        if (left > right) {
            return;
        }

        if (left == 0 && right == 0) {
            result.add(temp);
            return;
        }

        if (left > 0) {
            dfs(result, temp + "(", left - 1, right);
        }

        if (right > 0) {
            dfs(result, temp + ")", left, right - 1);
        }
    }
}
