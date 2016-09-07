package utils.ds;

import data_structures.dynamic.Node;

public class NodeUtils {
    public static void addToTail(Node head, Node newNode) {

    }

    public static String toString(Node head) {
        /*
        String first = head.val.toString();
        String second = head.next.toString();
        String third = head.next.next.val.toString();
        */
        String res = "";//StringBuilder
        Node iter = head;
        while (iter != null) {
            res += iter.val + "->";
            iter = iter.next;
        }
        return res;
    }

    public static String toStringR(Node head) {

        return head != null ?
                (head.val.toString() + "->" + toStringR(head.next)) : "";
    }

    public static Node createChain(int size) {
        Node head = new Node(0, null);
        Node last = head;
        for (int i = 1; i < size; i++) {
            last.next = new Node(i, null);
            last = last.next;
        }
        return head;
    }
}