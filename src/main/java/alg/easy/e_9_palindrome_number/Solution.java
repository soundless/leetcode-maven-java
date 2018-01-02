/*
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number
 *
 * algorithms
 * Easy (35.59%)
 * Total Accepted:    274.3K
 * Total Submissions: 770.8K
 * Testcase Example:  '-2147483648'
 *
 * Determine whether an integer is a palindrome. Do this without extra space
 *
 * click to show spoilers.
 *
 * Some hints:
 *
 * Could negative integers be palindromes? (ie, -1)
 *
 * If you are thinking of converting the integer to string, note the
 * restriction of using extra space.
 *
 * You could also try reversing an integer. However, if you have solved the
 * problem "Reverse Integer", you know that the reversed integer might
 * overflow. How would you handle such case?
 *
 * There is a more generic way of solving this problem.
 *
 *
 */
package alg.easy.e_9_palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x, z = 0;
        while (y > 0) {
            z = z * 10 + y % 10;
            y /= 10;
        }
        return x == z;
    }
}