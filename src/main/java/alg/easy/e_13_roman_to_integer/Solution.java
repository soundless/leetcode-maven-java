/*
 * [13] Roman to Integer
 *
 * https://leetcode.com/problems/roman-to-integer
 *
 * algorithms
 * Easy (46.94%)
 * Total Accepted:    192.4K
 * Total Submissions: 409.9K
 * Testcase Example:  '"DCXXI"'
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 */
package alg.easy.e_13_roman_to_integer;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int result = 0;
        if (s == null || s.length() == 0) {
            return result;
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int last = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));
            if (curr > last) {
                result += curr - 2 * last;
            }
            else {
                result += curr;
            }
            last = curr;
        }
        return result;
    }
}
