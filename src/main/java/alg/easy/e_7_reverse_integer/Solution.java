/*
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer
 *
 * algorithms
 * Easy (24.40%)
 * Total Accepted:    329K
 * Total Submissions: 1.3M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output:  321
 *
 *
 *
 * Example 2:
 *
 * Input: -123
 * Output: -321
 *
 *
 *
 * Example 3:
 *
 * Input: 120
 * Output: 21
 *
 *
 *
 * Note:
 * Assume we are dealing with an environment which could only hold integers
 * within the 32-bit signed integer range. For the purpose of this problem,
 * assume that your function returns 0 when the reversed integer overflows.
 *
 */
package alg.easy.e_7_reverse_integer;

class Solution {
    public int reverse(int x) {
        int flag = 1;
        if (x < 0) {
            flag = -1;
            x *= -1;
        }
        long result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            if ((flag > 0 && result > Integer.MAX_VALUE) ||
                    (flag < 0 && flag * result < Integer.MIN_VALUE)) {
                return 0;
            }
            x /= 10;
        }

        return flag * (int) result;
    }
}
