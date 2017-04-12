package com.pawan.algorithms.karumanchi.LinkedList.problems;

import com.pawan.algorithms.karumanchi.LinkedList.ListUtil;
import com.pawan.algorithms.karumanchi.LinkedList.SLL.SinglyLinkedList;
import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

import java.io.IOException;
import java.security.PublicKey;

/**
 * Created by pawan.s on 4/12/2017.
 */
public class MergeSortedLists {
    public  static void main(String args[]) throws IOException{
        System.out.println("enter list 1");
        SinglyLinkedList l1 = new SinglyLinkedList();
        ListUtil.makeList(l1);

        System.out.println("enter list 2");
        SinglyLinkedList l2 = new SinglyLinkedList();
        ListUtil.makeList(l2);

        LLNode head = mergeSortedLists(l1.getHead(), l2.getHead());
        String result = "";
        while(null!=head) {
            result += head.getData() + " --> ";
            head = head.getNext();
        }
        System.out.println(result);
    }

    private static LLNode mergeSortedLists(LLNode h1, LLNode h2) {
        if(null==h1){
            return h2;
        }
        if(null==h2) {
            return h1;
        }

        LLNode head = null;
        if(h2.getData() <= h1.getData()) {
            head = h2;
            head.setNext(mergeSortedLists(h2.getNext(), h1));
        } else if( h2.getData() > h1.getData()) {
            head = h1;
            head.setNext(mergeSortedLists(h1.getNext(), h2));
        }

        return head;
    }
}
