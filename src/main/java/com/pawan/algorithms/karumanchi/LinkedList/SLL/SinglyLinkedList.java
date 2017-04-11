package com.pawan.algorithms.karumanchi.LinkedList.SLL;

import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

/**
 * Created by Pawan on 10/04/17.
 */
public class SinglyLinkedList {
    private LLNode head = null;
    private int size=0;

    public LLNode getHead() { return this.head; }

    public void addNode(int data) {
        //First node of list .. hurray
        LLNode node = new LLNode(data);
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

    public void insertNodeInFront(int data) {
        LLNode node = new LLNode(data);
        LLNode tempNode = head;
        head = node;
        node.setNext(tempNode);
        System.out.println(head.getData());
        size++;
    }

    public void insertAtKthNode(LLNode node) {

    }

    public LLNode deleteFirstNode() {
        LLNode tempNode = head;
        head = head.getNext();
        tempNode.setNext(null);
        return tempNode;
    }

    public LLNode deleteLastNode() {
        LLNode resultNode = null;
        if (null==head) { System.out.println("head is null");return null;}
        else if (null==head.getNext()) {
            resultNode = head;
            head = null;
            return resultNode;
        }

        LLNode currNode = head.getNext();
        LLNode prevNode = head;
        //System.out.format("current=%d", currNode.getData());
        while(currNode.getNext()!=null) {
            currNode = currNode.getNext();
            prevNode = prevNode.getNext();
            //System.out.format("current=%d", currNode.getData());
        }
        prevNode.setNext(null);
        return currNode;
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
            result += currNode.getData() + " --> ";
            currNode = currNode.getNext();
        }
        return result+"null";
    }
}
