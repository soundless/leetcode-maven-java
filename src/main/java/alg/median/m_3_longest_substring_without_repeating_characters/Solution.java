/*
 * [3] Longest Substring Without Repeating Characters
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters
 *
 * algorithms
 * Medium (24.50%)
 * Total Accepted:    396.6K
 * Total Submissions: 1.6M
 * Testcase Example:  '"abcabcbb"'
 *
 * Given a string, find the length of the longest substring without repeating
 * characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
 * answer must be a substring, "pwke" is a subsequence and not a substring.
 */
package alg.median.m_3_longest_substring_without_repeating_characters;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        if (s == null || s.length() == 0) {
            return result;
        }

        Set<Character> hash = new HashSet<>();
        int i = 0, j = 0;
        while (i < s.length()) {
            if (!hash.contains(s.charAt(i))) {
                hash.add(s.charAt(i++));
                result = Math.max(result, hash.size());
            }
            else {
                hash.remove(s.charAt(j++));
            }
        }
        return result;
    }
}
