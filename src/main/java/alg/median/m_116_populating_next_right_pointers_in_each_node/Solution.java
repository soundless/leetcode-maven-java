package alg.median.m_116_populating_next_right_pointers_in_each_node;

/*
 * [116] Populating Next Right Pointers in Each Node
 *
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node
 *
 * algorithms
 * Medium (36.92%)
 * Total Accepted:    154.4K
 * Total Submissions: 418.3K
 * Testcase Example:  '{}'
 *
 *
 * Given a binary tree
 *
 * ⁠   struct TreeLinkNode {
 * ⁠     TreeLinkNode *left;
 * ⁠     TreeLinkNode *right;
 * ⁠     TreeLinkNode *next;
 * ⁠   }
 *
 *
 *
 * Populate each next pointer to point to its next right node. If there is no
 * next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 *
 *
 * Note:
 *
 * You may only use constant extra space.
 * You may assume that it is a perfect binary tree (ie, all leaves are at the
 * same level, and every parent has two children).
 *
 *
 *
 *
 * For example,
 * Given the following perfect binary tree,
 *
 * ⁠        1
 * ⁠      /  \
 * ⁠     2    3
 * ⁠    / \  / \
 * ⁠   4  5  6  7
 *
 *
 *
 * After calling your function, the tree should look like:
 *
 * ⁠        1 -> NULL
 * ⁠      /  \
 * ⁠     2 -> 3 -> NULL
 * ⁠    / \  / \
 * ⁠   4->5->6->7 -> NULL
 *
 *
 */
/**
 * Definition for binary tree with next pointer.
 * public package algorithms.leetcode.median.m_116_populating_next_right_pointers_in_each_node;
 * <p>
 * class TreeLinkNode {
 * int val;
 * TreeLinkNode left, right, next;
 * TreeLinkNode(int x) { val = x; }
 * }
 */

import util.TreeLinkNode;

class Solution {
    public void connect(TreeLinkNode root) {

    }
}
