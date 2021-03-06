/*
 * [235] Lowest Common Ancestor of a Binary Search Tree
 *
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree
 *
 * algorithms
 * Easy (39.49%)
 * Total Accepted:    171.1K
 * Total Submissions: 433.1K
 * Testcase Example:  '[2,1]\nnode with value 2\nnode with value 1'
 *
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of
 * two given nodes in the BST.
 *
 *
 *
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor
 * is defined between two nodes v and w as the lowest node in T that has both v
 * and w as descendants (where we allow a node to be a descendant of
 * itself).”
 *
 *
 *
 * ⁠       _______6______
 * ⁠      /              \
 * ⁠   ___2__          ___8__
 * ⁠  /      \        /      \
 * ⁠  0      _4       7       9
 * ⁠        /  \
 * ⁠        3   5
 *
 *
 *
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another
 * example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of
 * itself according to the LCA definition.
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.easy.e_235_lowest_common_ancestor_of_a_binary_search_tree;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.easy.e_235_lowest_common_ancestor_of_a_binary_search_tree;

import util.TreeNode;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return null;
    }
}
