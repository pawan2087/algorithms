package com.pawan.algorithms.karumanchi.LinkedList.CLL;

import com.pawan.algorithms.karumanchi.LinkedList.core.CLLNode;

/**
 * Created by Pawan on 11/04/17.
 */
public class CircularLinkedList {
    private CLLNode head = null;
    private int length;

    public CircularLinkedList() {
        this.length = 0;
    }

    public CLLNode getHead() {
        return this.head;
    }

    public void addNode(int data) {
        CLLNode node = new CLLNode(data);
        if (null==head) {
            head = node;
            head.setNext(head);
        } else {
            CLLNode tempNode = head;
            while (tempNode.getNext() != head) {
                tempNode = tempNode.getNext();
            }

            node.setNext(head);
            tempNode.setNext(node);
        }
    }

    public void addNodeInFron(int data) {
        CLLNode node = new CLLNode(data);
        if (null==head) {
            head = node;
            head.setNext(head);
        } else {
            CLLNode tempNode = head;
            while (tempNode.getNext() != head) {
                tempNode = tempNode.getNext();
            }

            node.setNext(head);
            tempNode.setNext(node);
            head = node;
        }
    }

    public void deleteLastNode() {
        if(null==head) { return; }
        else if(head.getNext()==head) {
            head = null;
        } else {
            CLLNode prevNode, currNode;
            prevNode = head;
            currNode = head.getNext();
            while (currNode.getNext()!=head) {
                currNode = currNode.getNext();
                prevNode = prevNode.getNext();
            }
            prevNode.setNext(currNode.getNext());
        }
    }

    @Override
    public String toString() {
        if (null == head) {
            return "List is empty !";
        } else {
            CLLNode currNode = head;
            String result = "";
            result += currNode.getData() + " --> ";
            currNode = currNode.getNext();
            while (head != currNode) {
                result += currNode.getData() + " --> ";
                currNode = currNode.getNext();
            }
            return result + head.getData();
        }
    }
}
