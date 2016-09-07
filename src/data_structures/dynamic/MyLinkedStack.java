package data_structures.dynamic;

import data_structures.common.MyStack;
import utils.ds.NodeUtils;

/**
 * Created by nagornyyalek on 07.09.2016.
 */
public class MyLinkedStack implements MyStack{

    private Node top;


    @Override
    public void push(Object obj) {

        if(top == null){
            top = new Node(obj, null);
        } else {
            top = new Node(obj, top);
        }

        // above code could be: top = new Node(obj, top);
    }

    @Override
    public Object pop() {

        if (top == null){
            System.out.println("Stack is empty");
            return null;
        }

        Object forRet = top.val;
        top = top.next;
        return forRet;
    }

    @Override
    public String toString() {
        return "MyLinkedStack{\n" +
                "top=" + NodeUtils.toStringR(top).replaceAll("->", "\n") +
                '}';
    }
}
