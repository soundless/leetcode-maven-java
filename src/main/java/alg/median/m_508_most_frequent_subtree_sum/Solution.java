/*
 * [508] Most Frequent Subtree Sum
 *
 * https://leetcode.com/problems/most-frequent-subtree-sum
 *
 * algorithms
 * Medium (52.15%)
 * Total Accepted:    24.1K
 * Total Submissions: 46.3K
 * Testcase Example:  '[5,2,-3]'
 *
 *
 * Given the root of a tree, you are asked to find the most frequent subtree
 * sum. The subtree sum of a node is defined as the sum of all the node values
 * formed by the subtree rooted at that node (including the node itself). So
 * what is the most frequent subtree sum value? If there is a tie, return all
 * the values with the highest frequency in any order.
 *
 *
 * Examples 1
 * Input:
 *
 * ⁠ 5
 * ⁠/  \
 * 2   -3
 *
 * return [2, -3, 4], since all the values happen only once, return all of them
 * in any order.
 *
 *
 * Examples 2
 * Input:
 *
 * ⁠ 5
 * ⁠/  \
 * 2   -5
 *
 * return [2], since 2 happens twice, however -5 only occur once.
 *
 *
 * Note:
 * You may assume the sum of values in any subtree is in the range of 32-bit
 * signed integer.
 *
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.median.m_508_most_frequent_subtree_sum;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.median.m_508_most_frequent_subtree_sum;

import util.TreeNode;

class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        return null;
    }
}
