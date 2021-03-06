/*
 * [654] Maximum Binary Tree
 *
 * https://leetcode.com/problems/maximum-binary-tree
 *
 * algorithms
 * Medium (69.91%)
 * Total Accepted:    18.6K
 * Total Submissions: 26.7K
 * Testcase Example:  '[3,2,1,6,0,5]'
 *
 *
 * Given an integer array with no duplicates. A maximum tree building on this
 * array is defined as follow:
 *
 * The root is the maximum number in the array.
 * The left subtree is the maximum tree constructed from left part subarray
 * divided by the maximum number.
 * The right subtree is the maximum tree constructed from right part subarray
 * divided by the maximum number.
 *
 *
 *
 *
 * Construct the maximum tree by the given array and output the root node of
 * this tree.
 *
 *
 * Example 1:
 *
 * Input: [3,2,1,6,0,5]
 * Output: return the tree root node representing the following tree:
 *
 * ⁠     6
 * ⁠   /   \
 * ⁠  3     5
 * ⁠   \    /
 * ⁠    2  0
 * ⁠      \
 * ⁠       1
 *
 *
 *
 * Note:
 *
 * The size of the given array will be in the range [1,1000].
 *
 *
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.median.m_654_maximum_binary_tree;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.median.m_654_maximum_binary_tree;

import util.TreeNode;

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return null;
    }
}
