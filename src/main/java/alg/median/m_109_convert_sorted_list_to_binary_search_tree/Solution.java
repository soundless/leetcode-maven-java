/*
 * [109] Convert Sorted List to Binary Search Tree
 *
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree
 *
 * algorithms
 * Medium (34.63%)
 * Total Accepted:    120.7K
 * Total Submissions: 348.5K
 * Testcase Example:  '[-10,-3,0,5,9]'
 *
 * Given a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 *
 *
 *
 *
 * Example:
 *
 * Given the sorted linked list: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following
 * height balanced BST:
 *
 * ⁠     0
 * ⁠    / \
 * ⁠  -3   9
 * ⁠  /   /
 * ⁠-10  5
 *
 *
 */
/**
 * Definition for singly-linked list.
 * public package algorithms.leetcode.median.m_109_convert_sorted_list_to_binary_search_tree;
 * <p>
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 * <p>
 * Definition for a binary tree node.
 * public package algorithms.leetcode.median.m_109_convert_sorted_list_to_binary_search_tree;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 * <p>
 * Definition for a binary tree node.
 * public package algorithms.leetcode.median.m_109_convert_sorted_list_to_binary_search_tree;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public package algorithms.leetcode.median.m_109_convert_sorted_list_to_binary_search_tree;

 class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
package alg.median.m_109_convert_sorted_list_to_binary_search_tree;

import util.ListNode;
import util.TreeNode;

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return null;
    }
}
