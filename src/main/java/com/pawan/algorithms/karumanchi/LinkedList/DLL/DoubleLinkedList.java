package com.pawan.algorithms.karumanchi.LinkedList.DLL;

import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

/**
 * Created by Pawan on 10/04/17.
 */
public class DoubleLinkedList {
    private LLNode head = null;
    private int size=0;

    public void addNode(LLNode node) {
        //First node of list .. hurray
        if (null==head) {
            head = node;
        } else {
            LLNode tempNode = head;
            while(tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(node);
        }
        size++;
    }

    public void insertNodeInFront(LLNode node) {
        LLNode tempNode = head;
        head = node;
        node.setNext(tempNode);
        System.out.println(head.getData());
        size++;
    }

    public void insertAtKthNode(LLNode node) {

    }

    public void deleteFirstNode() {

    }

    public void deleteLastNode() {

    }

    public void deleteKthNode(int k) {

    }

    public LLNode findMidNode() {
        LLNode slowNode=head, fastNode=head;
        while((null != fastNode) && (null != fastNode.getNext())) {
            slowNode = slowNode.getNext();
            fastNode = null!=fastNode.getNext()?fastNode.getNext().getNext():fastNode.getNext();
        }

        return slowNode;
    }

    @Override
    public String toString() {
        LLNode currNode = head;
        String result = "";
        while(null!=currNode) {
            result += currNode.getData() + " <--> ";
            currNode = currNode.getNext();
        }
        return result+"null";
    }
}
