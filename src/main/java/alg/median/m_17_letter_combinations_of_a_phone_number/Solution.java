/*
 * [17] Letter Combinations of a Phone Number
 *
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number
 *
 * algorithms
 * Medium (35.50%)
 * Total Accepted:    195.9K
 * Total Submissions: 551.9K
 * Testcase Example:  '""'
 *
 * Given a digit string, return all possible letter combinations that the
 * number could represent.
 *
 *
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given
 * below.
 *
 *
 *
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 *
 *
 * Note:
 * Although the above answer is in lexicographical order, your answer could be
 * in any order you want.
 *
 */
package alg.median.m_17_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.equals("")) {
            return result;
        }
        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});

        helper(result, digits, new StringBuilder(), 0, map);
        return result;
    }

    private void helper(List<String> result, String digits, StringBuilder stringBuilder, int i, Map<Character, char[]> map) {
        if (i == digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        char digit = digits.charAt(i);
        char[] chars = map.get(digit);

        for (int j = 0; j < chars.length; j++) {
            stringBuilder.append(chars[j]);
            helper(result, digits, stringBuilder, i + 1, map);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
