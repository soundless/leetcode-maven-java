/*
 * [19] Remove Nth Node From End of List
 *
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list
 *
 * algorithms
 * Medium (33.95%)
 * Total Accepted:    211.6K
 * Total Submissions: 623.3K
 * Testcase Example:  '[1]\n1'
 *
 * Given a linked list, remove the nth node from the end of list and return its
 * head.
 *
 *
 * For example,
 *
 *
 * ⁠  Given linked list: 1->2->3->4->5, and n = 2.
 *
 * ⁠  After removing the second node from the end, the linked list becomes
 * 1->2->3->5.
 *
 *
 *
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 *
 */
/**
 * Definition for singly-linked list.
 * public package algorithms.leetcode.median.m_19_remove_nth_node_from_end_of_list;
 * <p>
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
package alg.median.m_19_remove_nth_node_from_end_of_list;

import util.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
