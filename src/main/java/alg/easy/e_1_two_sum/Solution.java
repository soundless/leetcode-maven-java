/*
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum
 *
 * algorithms
 * Easy (36.34%)
 * Total Accepted:    719.7K
 * Total Submissions: 2M
 * Testcase Example:  '[3,2,4]\n6'
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 *
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 *
 */
package alg.easy.e_1_two_sum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = {-1, -1};
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if ( nums[i] + nums[j] == target ) {
                    results[0] = i + 1;
                    results[1] = j + 1;
                }
            }
        }
        return results;
    }
}
