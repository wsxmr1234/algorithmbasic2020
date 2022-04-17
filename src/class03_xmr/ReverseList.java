package class03_xmr;

public class ReverseList {
    public static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static class DoubleNode {
        public int value;
        public DoubleNode pre;
        public DoubleNode next;

        public DoubleNode(int value, DoubleNode pre, DoubleNode next) {
            this.value = value;
            this.pre = pre;
            this.next = next;
        }
    }

    public static Node reverseLinkedList(Node head) {
        Node pre = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre; //!注意return的是pre
    }

    public static DoubleNode reverseDoubleList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode curr = head;
        DoubleNode next = null;

        while (curr != null) {
            next = curr.next;

            curr.next = pre;
            curr.pre = next;

            pre = curr;
            curr = next;
        }

        return pre;
    }

}
