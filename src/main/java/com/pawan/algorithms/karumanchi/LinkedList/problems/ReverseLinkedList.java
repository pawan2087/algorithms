package com.pawan.algorithms.karumanchi.LinkedList.problems;

import com.pawan.algorithms.karumanchi.LinkedList.ListUtil;
import com.pawan.algorithms.karumanchi.LinkedList.SLL.SinglyLinkedList;
import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

import java.io.IOException;

/**
 * Created by Pawan on 13/04/17.
 */
public class ReverseLinkedList {
    public static void main(String[] args) throws IOException {
        System.out.println("enter list 1");
        SinglyLinkedList l1 = new SinglyLinkedList();
        ListUtil.makeList(l1);

        LLNode[] head = new LLNode[1];
        reverseLinkedList(l1.getHead(),  head);

        System.out.println(ListUtil.printList(head[0]));
    }

    public static void reverseLinkedList(LLNode current, LLNode[] head) {
        if(current==null) {
            return;
        }

        LLNode next = current.getNext();
        if(null==next) {
            head[0] = current;
            return;
        }

        reverseLinkedList(next, head);
        next.setNext(current);
        current.setNext(null);
    }
}
