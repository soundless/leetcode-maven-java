/*
 * [16] 3Sum Closest
 *
 * https://leetcode.com/problems/3sum-closest
 *
 * algorithms
 * Medium (31.39%)
 * Total Accepted:    153.3K
 * Total Submissions: 488.3K
 * Testcase Example:  '[0,0,0]\n1'
 *
 * Given an array S of n integers, find three integers in S such that the sum
 * is closest to a given number, target. Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 *
 *
 * ⁠   For example, given array S = {-1 2 1 -4}, and target = 1.
 *
 * ⁠   The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 */
package alg.median.m_16_3sum_closest;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);
        outer_loop:
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target - sum);
                if (diff == 0) {
                    result = sum;
                    break outer_loop;
                }
                if (diff < min) {
                    min = diff;
                    result = sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
