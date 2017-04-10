package com.pawan.algorithms.karumanchi.LinkedList.core;

/**
 * Created by Pawan on 10/04/17.
 */
public class DLLNode {
    private int data;
    private DLLNode next = null;
    private DLLNode prev = null;

    public DLLNode(int data) {
        this.data = data;
    }

    public void setData(int data) { this.data = data; }

    public int getData() { return this.data; }

    public void setNext(DLLNode next) { this.next = next; }
    public void setPrev(DLLNode next) { this.prev = prev; }

    public DLLNode getNext() { return this.next; }
    public DLLNode getPrev() { return this.prev; }
}
