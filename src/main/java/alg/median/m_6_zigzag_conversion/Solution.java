/*
 * [6] ZigZag Conversion
 *
 * https://leetcode.com/problems/zigzag-conversion
 *
 * algorithms
 * Medium (27.00%)
 * Total Accepted:    182.7K
 * Total Submissions: 676.6K
 * Testcase Example:  '""\n1'
 *
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 *
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 *
 * Write the code that will take a string and make this conversion given a
 * number of rows:
 *
 * string convert(string text, int nRows);
 *
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 */
package alg.median.m_6_zigzag_conversion;

class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows <= 0) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int step = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += step) {
                sb.append(s.charAt(j));
                if (i != 0 && i != numRows - 1) {
                    int temp = j + step - 2 * i;
                    if (temp < s.length()) {
                        sb.append(s.charAt(temp));
                    }
                }
            }
        }
        return sb.toString();
    }
}
