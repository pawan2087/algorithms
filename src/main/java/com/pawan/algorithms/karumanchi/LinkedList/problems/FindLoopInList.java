package com.pawan.algorithms.karumanchi.LinkedList.problems;

import com.pawan.algorithms.karumanchi.LinkedList.CLL.CircularLinkedList;
import com.pawan.algorithms.karumanchi.LinkedList.ListUtil;
import com.pawan.algorithms.karumanchi.LinkedList.SLL.SinglyLinkedList;
import com.pawan.algorithms.karumanchi.LinkedList.core.CLLNode;
import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

import java.io.IOException;

/**
 * Created by pawan.s on 4/11/2017.
 */
public class FindLoopInList {
    private static int limit=0;
    private static int mK=0;

    public static void main(String[] args) throws IOException {
        //SinglyLinkedList sll = new SinglyLinkedList();
        //ListUtil.makeList(sll);
        CircularLinkedList cll = new CircularLinkedList();
        ListUtil.makeCList(cll);
        //if(isListLooped(sll.getHead()))
        if(isListLooped(cll.getHead()))
            System.out.println("looped");
        else
            System.out.println("not looped");
    }

    private static boolean isListLooped(Object head) {
        if(head instanceof LLNode) {
            LLNode fastNode = (LLNode) head, slowNode = (LLNode) head;
            int counter=0;
            while(null!=fastNode) {
                if(counter%2 != 0)
                    slowNode = slowNode.getNext();
                fastNode = fastNode.getNext();
                if(slowNode.equals(fastNode)) {
                    return true;
                }
            }

            return false;
        }
        else if(head instanceof CLLNode) {
            CLLNode fastNode = (CLLNode) head, slowNode = (CLLNode) head;
            int counter=0;
            while(null!=fastNode) {
                if(counter%2 != 0)
                    slowNode = slowNode.getNext();
                fastNode = fastNode.getNext();
                if(slowNode.equals(fastNode)) {
                    return true;
                }
            }

            return false;
        }
        return false;
    }

}
