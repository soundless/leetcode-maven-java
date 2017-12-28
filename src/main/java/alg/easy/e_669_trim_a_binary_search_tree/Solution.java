/*
 * [669] Trim a Binary Search Tree
 *
 * https://leetcode.com/problems/trim-a-binary-search-tree
 *
 * algorithms
 * Easy (58.06%)
 * Total Accepted:    16.5K
 * Total Submissions: 28.4K
 * Testcase Example:  '[1,0,2]\n1\n2'
 *
 *
 * Given a binary search tree and the lowest and highest boundaries as L and R,
 * trim the tree so that all its elements lies in [L, R] (R >= L). You might
 * need to change the root of the tree, so the result should return the new
 * root of the trimmed binary search tree.
 *
 *
 * Example 1:
 *
 * Input:
 * ⁠   1
 * ⁠  / \
 * ⁠ 0   2
 *
 * ⁠ L = 1
 * ⁠ R = 2
 *
 * Output:
 * ⁠   1
 * ⁠     \
 * ⁠      2
 *
 *
 *
 * Example 2:
 *
 * Input:
 * ⁠   3
 * ⁠  / \
 * ⁠ 0   4
 * ⁠  \
 * ⁠   2
 * ⁠  /
 * ⁠ 1
 *
 * ⁠ L = 1
 * ⁠ R = 3
 *
 * Output:
 * ⁠     3
 * ⁠    /
 * ⁠  2
 * ⁠ /
 * ⁠1
 *
 *
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.easy.e_669_trim_a_binary_search_tree;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.easy.e_669_trim_a_binary_search_tree;

import util.TreeNode;

class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        return null;
    }
}
