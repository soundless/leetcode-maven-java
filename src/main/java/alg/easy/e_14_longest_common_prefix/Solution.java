/*
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix
 *
 * algorithms
 * Easy (31.56%)
 * Total Accepted:    226.1K
 * Total Submissions: 716.5K
 * Testcase Example:  '[]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 *
 */
package alg.easy.e_14_longest_common_prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = "";
        int length = strs.length;
        if (length == 0) {
            return longest;
        }

        longest = strs[0];
        int i = 0, j = 1;
        while (i < longest.length()) {
            for (; j < length; j++) {
                if (strs[j].length() < longest.length() && strs[j].charAt(i) == longest.charAt(i)) {
                    i++;
                }
                else {
                    j = length;
                }
            }
            if (j == length) {
                break;
            }
        }
        return longest.substring(0, i);
    }
}
