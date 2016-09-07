package tests.test_ds;

import data_structures.common.MyStack;
import data_structures.dynamic.MyLinkedStack;
import data_structures.static_str.MyArrayStack;

import java.util.Stack;

/**
 * Created by nagornyyalek on 07.09.2016.
 */
public class TestStack {

    public static void main(String[] args) {

        MyStack stack = new MyLinkedStack();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println(stack);

    }
}
