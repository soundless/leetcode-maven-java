package alg.median._173_binary_search_tree_iterator;

/*
 * [173] Binary Search Tree Iterator
 *
 * https://leetcode.com/problems/binary-search-tree-iterator
 *
 * algorithms
 * Medium (42.59%)
 * Total Accepted:    111.8K
 * Total Submissions: 262.4K
 * Testcase Example:  '[]'
 *
 * Implement an iterator over a binary search tree (BST). Your iterator will be
 * initialized with the root node of a BST.
 *
 * Calling next() will return the next smallest number in the BST.
 *
 * Note: next() and hasNext() should run in average O(1) time and uses O(h)
 * memory, where h is the height of the tree.
 *
 * Credits:Special thanks to @ts for adding this problem and creating all test
 * cases.
 */
/**
 * Definition for binary tree
 * public package algorithms.leetcode.median._173_binary_search_tree_iterator;
 * <p>
 * class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

import util.TreeNode;

class BSTIterator {

    public BSTIterator(TreeNode root) {

    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return false;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return 0;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
