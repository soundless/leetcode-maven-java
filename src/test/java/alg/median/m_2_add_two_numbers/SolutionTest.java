package alg.median.m_2_add_two_numbers;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test_addTwoNumbers() {
        ListNode n1 = new ListNode(2);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(3);

        ListNode m1 = new ListNode(5);
        m1.next = new ListNode(6);
        m1.next.next = new ListNode(4);

        ListNode e1 = new ListNode(7);
        e1.next = new ListNode(0);
        e1.next.next = new ListNode(8);

        Solution s = new Solution();
        ListNode actual = s.addTwoNumbers(n1, m1);
        assertEquals(e1.toString(), actual.toString());
    }
}
