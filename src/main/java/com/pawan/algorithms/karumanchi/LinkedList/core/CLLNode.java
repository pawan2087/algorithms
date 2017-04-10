package com.pawan.algorithms.karumanchi.LinkedList.core;

/**
 * Created by Pawan on 10/04/17.
 */
public class CLLNode {
    private int data;
    private CLLNode next = this;

    public CLLNode(int data) {
        this.data = data;
    }

    public void setData(int data) { this.data = data; }

    public int getData() { return this.data; }

    public void setNext(CLLNode next) { this.next = next; }

    public CLLNode getNext() { return this.next; }
}
