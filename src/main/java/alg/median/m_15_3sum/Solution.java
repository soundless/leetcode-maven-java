/*
 * [15] 3Sum
 *
 * https://leetcode.com/problems/3sum
 *
 * algorithms
 * Medium (21.80%)
 * Total Accepted:    271.6K
 * Total Submissions: 1.2M
 * Testcase Example:  '[-1,0,1,2,-1,-4]'
 *
 * Given an array S of n integers, are there elements a, b, c in S such that a
 * + b + c = 0? Find all unique triplets in the array which gives the sum of
 * zero.
 *
 * Note: The solution set must not contain duplicate triplets.
 *
 *
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 * ⁠ [-1, 0, 1],
 * ⁠ [-1, -1, 2]
 * ]
 *
 */
package alg.median.m_15_3sum;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> hash = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0 - nums[i] - nums[j];
                if (hash.containsKey(temp)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(temp);
                    list.add(nums[j]);
                    if (!result.contains(list)) {
                        result.add(list);
                    }
                }
                else {
                    hash.put(nums[j], j);
                }
            }
        }
        return result;
    }
}
