/*
 * [98] Validate Binary Search Tree
 *
 * https://leetcode.com/problems/validate-binary-search-tree
 *
 * algorithms
 * Medium (23.82%)
 * Total Accepted:    202.9K
 * Total Submissions: 852.1K
 * Testcase Example:  '[2,1,3]'
 *
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 *
 *
 * Assume a BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the
 * node's key.
 * The right subtree of a node contains only nodes with keys greater than the
 * node's key.
 * Both the left and right subtrees must also be binary search trees.
 *
 *
 *
 * Example 1:
 *
 * ⁠   2
 * ⁠  / \
 * ⁠ 1   3
 *
 * Binary tree [2,1,3], return true.
 *
 *
 * Example 2:
 *
 * ⁠   1
 * ⁠  / \
 * ⁠ 2   3
 *
 * Binary tree [1,2,3], return false.
 *
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.median.m_98_validate_binary_search_tree;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.median.m_98_validate_binary_search_tree;

import util.TreeNode;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return false;
    }
}
