/*
 * [652] Find Duplicate Subtrees
 *
 * https://leetcode.com/problems/find-duplicate-subtrees
 *
 * algorithms
 * Medium (36.18%)
 * Total Accepted:    8.5K
 * Total Submissions: 23.4K
 * Testcase Example:  '[2,1,1]'
 *
 *
 * Given a binary tree, return all duplicate subtrees. For each kind of
 * duplicate subtrees, you only need to return the root node of any one of
 * them.
 *
 *
 * Two trees are duplicate if they have the same structure with same node
 * values.
 *
 *
 * Example 1:
 *
 * ⁠       1
 * ⁠      / \
 * ⁠     2   3
 * ⁠    /   / \
 * ⁠   4   2   4
 * ⁠      /
 * ⁠     4
 *
 * The following are two duplicate subtrees:
 *
 * ⁠     2
 * ⁠    /
 * ⁠   4
 *
 * and
 *
 * ⁠   4
 *
 * Therefore, you need to return above trees' root in the form of a list.
 *
 *
 *
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.median._652_find_duplicate_subtrees;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
package alg.median._652_find_duplicate_subtrees;

import util.TreeNode;

import java.util.List;

class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        return null;
    }
}
