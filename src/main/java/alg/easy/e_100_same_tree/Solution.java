/*
 * [100] Same Tree
 *
 * https://leetcode.com/problems/same-tree
 *
 * algorithms
 * Easy (47.07%)
 * Total Accepted:    236K
 * Total Submissions: 501.4K
 * Testcase Example:  '[1,2,3]\n[1,2,3]'
 *
 *
 * Given two binary trees, write a function to check if they are the same or
 * not.
 *
 *
 * Two binary trees are considered the same if they are structurally identical
 * and the nodes have the same value.
 *
 *
 *
 *
 * Example 1:
 *
 * Input:     1         1
 * ⁠         / \       / \
 * ⁠        2   3     2   3
 *
 * ⁠       [1,2,3],   [1,2,3]
 *
 * Output: true
 *
 *
 *
 * Example 2:
 *
 * Input:     1         1
 * ⁠         /           \
 * ⁠        2             2
 *
 * ⁠       [1,2],     [1,null,2]
 *
 * Output: false
 *
 *
 *
 * Example 3:
 *
 * Input:     1         1
 * ⁠         / \       / \
 * ⁠        2   1     1   2
 *
 * ⁠       [1,2,1],   [1,1,2]
 *
 * Output: false
 *
 *
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.easy.e_100_same_tree;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.easy.e_100_same_tree;

import util.TreeNode;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return false;
    }
}
