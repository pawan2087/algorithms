package com.pawan.algorithms.karumanchi.LinkedList.problems;

import com.pawan.algorithms.karumanchi.LinkedList.ListUtil;
import com.pawan.algorithms.karumanchi.LinkedList.SLL.SinglyLinkedList;
import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

import java.io.IOException;
import java.util.List;

/**
 * Created by pawan.s on 4/11/2017.
 */
public class FindKthNodeFromEnd {
    private static int limit=0;
    private static int mK=0;

    public static void main(String[] args) throws IOException {
        SinglyLinkedList sll = new SinglyLinkedList();
        ListUtil.makeList(sll);
        System.out.println("enter the value of k");
        int k = ListUtil.getIntFromConsole();
        //findKthNodeFromEnd(sll.getHead(), k);
        //mK = k;
        findKthNodeFromEndRecursive(sll.getHead(), k);
    }

    private static boolean findKthNodeFromEnd(LLNode head, int k) {
        LLNode tempNode = head;
        while(k>1 && tempNode!=null) {
            tempNode = tempNode.getNext();
            k--;
        }
        if(null==tempNode) { System.out.println("List is not large enough"); return false;}
        LLNode kNode = head;
        while(null!=tempNode.getNext()) {
            kNode = kNode.getNext();
            tempNode = tempNode.getNext();
        }

        System.out.format("The %dth node = [%d]", k, kNode.getData());
        return true;
    }

    private static void findKthNodeFromEndRecursive(LLNode head, int k) {

        if(null==head) return;
        findKthNodeFromEndRecursive(head.getNext(), k);
        limit++;
        if(limit==k) {
            System.out.println(head.getData());
        }
    }
}
