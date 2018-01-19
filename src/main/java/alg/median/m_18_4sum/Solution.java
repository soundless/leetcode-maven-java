/*
 * [18] 4Sum
 *
 * https://leetcode.com/problems/4sum
 *
 * algorithms
 * Medium (27.18%)
 * Total Accepted:    138.4K
 * Total Submissions: 509.4K
 * Testcase Example:  '[1,0,-1,0,-2,2]\n0'
 *
 * Given an array S of n integers, are there elements a, b, c, and d in S such
 * that a + b + c + d = target? Find all unique quadruplets in the array which
 * gives the sum of target.
 *
 * Note: The solution set must not contain duplicate quadruplets.
 *
 *
 *
 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is:
 * [
 * ⁠ [-1,  0, 0, 1],
 * ⁠ [-2, -1, 1, 2],
 * ⁠ [-2,  0, 0, 2]
 * ]
 *
 */
package alg.median.m_18_4sum;

import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0 ) {
            return result;
        }
        Arrays.sort(nums);
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length;  b++) {
                Map<Integer, Integer> map = new HashMap<>();
                for (int c = b + 1; c < nums.length; c++) {
                    int num_d = target - nums[a] - nums[b] - nums[c];
                    if (map.containsKey(num_d)) {
                        result.add(Arrays.asList(nums[a], nums[b], nums[c], num_d));
                    }
                    else {
                        map.put(nums[c],c);
                    }
                }
            }
        }
        return result;
    }
}
