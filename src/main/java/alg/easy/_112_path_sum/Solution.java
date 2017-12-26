/*
 * [112] Path Sum
 *
 * https://leetcode.com/problems/path-sum
 *
 * algorithms
 * Easy (34.39%)
 * Total Accepted:    191.2K
 * Total Submissions: 556.1K
 * Testcase Example:  '[]\n1'
 *
 *
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 *
 *
 * For example:
 * Given the below binary tree and sum = 22,
 *
 * ⁠             5
 * ⁠            / \
 * ⁠           4   8
 * ⁠          /   / \
 * ⁠         11  13  4
 * ⁠        /  \      \
 * ⁠       7    2      1
 *
 *
 *
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.easy._112_path_sum;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.easy._112_path_sum;

import util.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return false;
    }
}
