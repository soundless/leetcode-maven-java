/*
 * [12] Integer to Roman
 *
 * https://leetcode.com/problems/integer-to-roman
 *
 * algorithms
 * Medium (45.60%)
 * Total Accepted:    124.8K
 * Total Submissions: 273.6K
 * Testcase Example:  '1'
 *
 * Given an integer, convert it to a roman numeral.
 *
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 */
package alg.median.m_12_integer_to_roman;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> hash = new LinkedHashMap<>();
        hash.put(1000, "M");
        hash.put(900, "CM");
        hash.put(500, "D");
        hash.put(400, "CD");
        hash.put(100, "C");
        hash.put(90, "XC");
        hash.put(50, "L");
        hash.put(40, "XL");
        hash.put(10, "X");
        hash.put(9, "IX");
        hash.put(5, "V");
        hash.put(4, "IV");
        hash.put(1, "I");
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            for (int key: hash.keySet()) {
                while (num / key > 0) {
                    result.append(hash.get(key));
                    num -= key;
                }
            }
        }
        return result.toString();
    }
}
