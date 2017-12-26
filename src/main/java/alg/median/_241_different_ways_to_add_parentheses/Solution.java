/*
 * [241] Different Ways to Add Parentheses
 *
 * https://leetcode.com/problems/different-ways-to-add-parentheses
 *
 * algorithms
 * Medium (45.11%)
 * Total Accepted:    50.3K
 * Total Submissions: 111.6K
 * Testcase Example:  '"2-1-1"'
 *
 * Given a string of numbers and operators, return all possible results from
 * computing all the different possible ways to group numbers and operators.
 * The valid operators are +, - and *.
 *
 * Example 1
 * Input: "2-1-1".
 * ((2-1)-1) = 0
 * (2-(1-1)) = 2
 * Output: [0, 2]
 *
 * Example 2
 * Input: "2*3-4*5"
 * (2*(3-(4*5))) = -34
 * ((2*3)-(4*5)) = -14
 * ((2*(3-4))*5) = -10
 * (2*((3-4)*5)) = -10
 * (((2*3)-4)*5) = 10
 * Output: [-34, -14, -10, -10, 10]
 *
 * Credits:Special thanks to @mithmatt for adding this problem and creating all
 * test cases.
 */
package alg.median._241_different_ways_to_add_parentheses;

import java.util.List;

class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        return null;
    }
}
