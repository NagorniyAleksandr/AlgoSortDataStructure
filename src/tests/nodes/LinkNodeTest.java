package tests.nodes;

import data_structures.dynamic.Node;
import utils.ds.NodeUtils;
import utils.time.ITimeAction;
import utils.time.TimeCounter;

/**
 * Created by nagornyyalek on 06.09.2016.
 */
public class LinkNodeTest {

    public static void main(String[] args) {
        test1();

        test2();

        test3();

        test4();

        Node head = NodeUtils.createChain(1000);

        long time1 = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                System.out.println(NodeUtils.toString(head));
            }
        });
        System.out.println(time1);

        long time2 = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                System.out.println(NodeUtils.toStringR(head));
            }
        });
        System.out.println("recur "+time2);



    }


    private static void test4() {
        Node head = new Node(1, null);
        Node last = head;

        for (int i = 0; i < 10; i++) {
            last = new Node(i, last);
        }
    }

    private static void test3() {
        Node head = new Node(1, null);

        for (int i = 0; i < 10; i++) {
            head = new Node(i, head);
        }
    }

    private static void test2() {
        Node head = new Node(1, null);
        Node second = new Node(2, head);
        Node third = new Node(3, second);

        head = null;
        second = null;
    }

    private static void test1() {
        Node head = new Node(1, null);
        Node second = new Node(2, head);
        Node third = new Node(3, second);
    }
}
