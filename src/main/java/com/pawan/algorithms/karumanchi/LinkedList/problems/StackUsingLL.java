package com.pawan.algorithms.karumanchi.LinkedList.problems;

import com.pawan.algorithms.karumanchi.LinkedList.SLL.SinglyLinkedList;
import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pawan.s on 4/11/2017.
 */

class MyStack {
    private SinglyLinkedList sll;
    private int size;

    public MyStack() {
        this.size = 0;
        this.sll = new SinglyLinkedList();
    }

    public int getSize() { return this.size; }

    public void push(int data) {
        sll.addNode(data);
    }

    public String pop() {
        LLNode node = sll.deleteLastNode();
        if (null==node) {
            return "stack is empty";
        }
        return String.valueOf(node.getData());
    }

    /*@Override
    public String toString() {
        LLNode currNode = sll.getHead();
        String result = "----------\n";
        while(null!=currNode) {
            result += "|   " + currNode.getData() + "   |\n";
            result += "----------\n";
            currNode = currNode.getNext();
        }
        return result;
    }*/

    public void printStack() {
        printLLReverse(sll.getHead());
    }
    private void printLLReverse(LLNode head) {
        if(null==head) {
            return;
        }
        printLLReverse(head.getNext());
        System.out.print(head.getData() + " ");
    }
}

public class StackUsingLL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        flashOptionsToUser();
        MyStack stack = new MyStack();
        int selection=0;
        while(4 != (selection=Integer.parseInt(br.readLine()))) {
            switch (selection) {
                case 1:
                    stack.push(getData(br));
                    //System.out.println(stack.toString());
                    stack.printStack();
                    System.out.println();
                    break;
                case 2:
                    stack.pop();
                    //System.out.println(stack.toString());
                    stack.printStack();
                    System.out.println();
                    break;
                case 3:
                    System.out.println(stack.getSize());
                    break;
                default:
            }
        }
    }

    private static void flashOptionsToUser() {
        StringBuilder sb = new StringBuilder();
        sb.append("1. push in stack\n");
        sb.append("2. pop from stack\n");
        sb.append("3. get size of stack\n");
        sb.append("4. exit\n");
        System.out.println(sb.toString());
    }

    private static int getData(BufferedReader br) throws IOException {
        System.out.println("enter data");
        return Integer.parseInt(br.readLine());
    }
}
