package util;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int x) {
        this.val = x;
    }

    @Override
    public String toString() {
        String result = "";
        ListNode node = this;
        while (node != null) {
            result += node.val + " -> ";
            node = node.next;
        }
        result += "null";
        return result;
    }

    public int getVal() {
        return this.val;
    }

    public void setVal(int x) {
        this.val = x;
    }

    public ListNode getNext() {
        return this.next;
    }

    public void setNext(ListNode node) {
        this.next = node;
    }
}
