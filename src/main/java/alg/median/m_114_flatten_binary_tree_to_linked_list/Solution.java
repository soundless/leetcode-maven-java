/*
 * [114] Flatten Binary Tree to Linked List
 *
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list
 *
 * algorithms
 * Medium (35.84%)
 * Total Accepted:    147.1K
 * Total Submissions: 410.3K
 * Testcase Example:  '[]'
 *
 *
 * Given a binary tree, flatten it to a linked list in-place.
 *
 *
 *
 * For example,
 * Given
 *
 * ⁠        1
 * ⁠       / \
 * ⁠      2   5
 * ⁠     / \   \
 * ⁠    3   4   6
 *
 *
 *
 * The flattened tree should look like:
 *
 * ⁠  1
 * ⁠   \
 * ⁠    2
 * ⁠     \
 * ⁠      3
 * ⁠       \
 * ⁠        4
 * ⁠         \
 * ⁠          5
 * ⁠           \
 * ⁠            6
 *
 *
 * click to show hints.
 *
 * Hints:
 * If you notice carefully in the flattened tree, each node's right child
 * points to the next node of a pre-order traversal.
 *
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.median.m_114_flatten_binary_tree_to_linked_list;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.median.m_114_flatten_binary_tree_to_linked_list;

import util.TreeNode;

class Solution {
    public void flatten(TreeNode root) {

    }
}
