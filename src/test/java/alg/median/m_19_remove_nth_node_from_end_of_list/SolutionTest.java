package alg.median.m_19_remove_nth_node_from_end_of_list;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_m_19_remove_nth_node_from_end_of_list() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(5);

        ListNode expected1 = new ListNode(2);
        expected1.next = new ListNode(3);
        expected1.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode actual = solution.removeNthFromEnd(head, 2);
        ListNode actual1 = solution.removeNthFromEnd(head, 4);

        assertEquals(expected.toString(), actual.toString());
        assertEquals(expected1.toString(), actual1.toString());
    }
}