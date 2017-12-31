package alg.median.m_2_add_two_numbers;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_addTwoNumbers() {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode m1 = new ListNode(5);
        ListNode m2 = new ListNode(6);
        ListNode m3 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;

        ListNode e1 = new ListNode(7);
        ListNode e2 = new ListNode(0);
        ListNode e3 = new ListNode(8);
        e1.next = e2;
        e2.next = e3;

        Solution s = new Solution();
        ListNode actual = s.addTwoNumbers(n1, m1);
        assertEquals(e1.val, actual.val);
        assertEquals(e2.val, actual.next.val);
        assertEquals(e3.val, actual.next.next.val);
    }
}
