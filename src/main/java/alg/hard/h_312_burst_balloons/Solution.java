/*
 * [312] Burst Balloons
 *
 * https://leetcode.com/problems/burst-balloons
 *
 * algorithms
 * Hard (43.24%)
 * Total Accepted:    33K
 * Total Submissions: 76.4K
 * Testcase Example:  '[3,1,5,8]'
 *
 *
 * ⁠   Given n balloons, indexed from 0 to n-1. Each balloon is painted with a
 * ⁠   number on it represented by array nums.
 *
 * ⁠   You are asked to burst all the balloons. If the you burst
 * ⁠   balloon i you will get nums[left] * nums[i] * nums[right] coins. Here
 * left
 * ⁠   and right are adjacent indices of i. After the burst, the left and right
 * ⁠   then becomes adjacent.
 *
 *
 * ⁠   Find the maximum coins you can collect by bursting the balloons
 * wisely.
 *
 *
 * ⁠   Note:
 * ⁠   (1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore
 * you can not burst them.
 * ⁠   (2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
 *
 *
 *
 *
 * ⁠   Example:
 *
 *
 * ⁠   Given [3, 1, 5, 8]
 *
 *
 * ⁠   Return 167
 *
 *
 * ⁠   nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
 * ⁠  coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
 *
 *
 * Credits:Special thanks to @dietpepsi for adding this problem and creating
 * all test cases.
 */
package alg.hard.h_312_burst_balloons;

class Solution {
    public int maxCoins(int[] nums) {
        return 0;
    }
}
