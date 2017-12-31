/*
 * [5] Longest Palindromic Substring
 *
 * https://leetcode.com/problems/longest-palindromic-substring
 *
 * algorithms
 * Medium (25.23%)
 * Total Accepted:    262.3K
 * Total Submissions: 1M
 * Testcase Example:  '"babad"'
 *
 * Given a string s, find the longest palindromic substring in s. You may
 * assume that the maximum length of s is 1000.
 *
 * Example:
 *
 * Input: "babad"
 *
 * Output: "bab"
 *
 * Note: "aba" is also a valid answer.
 *
 *
 *
 * Example:
 *
 * Input: "cbbd"
 *
 * Output: "bb"
 *
 *
 */
package alg.median.m_5_longest_palindromic_substring;

class Solution {
    private int lo = 0, maxLen = 0;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            // expand in aba
            expandAroundCenter(s, i, i);
            // expand in abba
            expandAroundCenter(s, i, i + 1);
        }
        return s.substring(lo, lo + maxLen);
    }

    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if (maxLen < right - left - 1) {
            lo = left + 1;
            maxLen = right - left - 1;
        }
    }
}
