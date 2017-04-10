package com.pawan.algorithms.karumanchi.LinkedList.core;

/**
 * Created by Pawan on 10/04/17.
 */
public class LLNode {
    private int data;
    private LLNode next = null;

    public LLNode(int data) {
        this.data = data;
    }

    public void setData(int data) { this.data = data; }

    public int getData() { return this.data; }

    public void setNext(LLNode next) { this.next = next; }

    public LLNode getNext() { return this.next; }
}
