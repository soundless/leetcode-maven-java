package alg.median.m_117_populating_next_right_pointers_in_each_node_ii;

/*
 * [117] Populating Next Right Pointers in Each Node II
 *
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii
 *
 * algorithms
 * Medium (33.89%)
 * Total Accepted:    115.3K
 * Total Submissions: 340.4K
 * Testcase Example:  '{}'
 *
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * What if the given tree could be any binary tree? Would your previous
 * solution still work?
 *
 * Note:
 * You may only use constant extra space.
 *
 *
 * For example,
 * Given the following binary tree,
 *
 * ⁠        1
 * ⁠      /  \
 * ⁠     2    3
 * ⁠    / \    \
 * ⁠   4   5    7
 *
 *
 *
 * After calling your function, the tree should look like:
 *
 * ⁠        1 -> NULL
 * ⁠      /  \
 * ⁠     2 -> 3 -> NULL
 * ⁠    / \    \
 * ⁠   4-> 5 -> 7 -> NULL
 *
 *
 */

/**
 * Definition for binary tree with next pointer.
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int x) {
        val = x;
    }
}

class Solution {
    public void connect(TreeLinkNode root) {

    }
}
