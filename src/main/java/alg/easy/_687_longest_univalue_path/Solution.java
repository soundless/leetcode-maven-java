/*
 * [687] Longest Univalue Path
 *
 * https://leetcode.com/problems/longest-univalue-path
 *
 * algorithms
 * Easy (33.98%)
 * Total Accepted:    12.1K
 * Total Submissions: 35.6K
 * Testcase Example:  '[5,4,5,1,1,5]'
 *
 * Given a binary tree, find the length of the longest path where each node in
 * the path has the same value. This path may or may not pass through the
 * root.
 *
 * Note: The length of path between two nodes is represented by the number of
 * edges between them.
 *
 *
 * Example 1:
 *
 *
 *
 *
 * Input:
 *
 * ⁠             5
 * ⁠            / \
 * ⁠           4   5
 * ⁠          / \   \
 * ⁠         1   1   5
 *
 *
 *
 *
 * Output:
 *
 * 2
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 *
 * Input:
 *
 * ⁠             1
 * ⁠            / \
 * ⁠           4   5
 * ⁠          / \   \
 * ⁠         4   4   5
 *
 *
 *
 *
 * Output:
 *
 * 2
 *
 *
 *
 * Note:
 * The given binary tree has not more than 10000 nodes.  The height of the tree
 * is not more than 1000.
 *
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.easy._687_longest_univalue_path;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.easy._687_longest_univalue_path;

import util.TreeNode;

class Solution {
    public int longestUnivaluePath(TreeNode root) {
        return 0;
    }
}
