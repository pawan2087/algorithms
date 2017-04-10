package com.pawan.algorithms.karumanchi.LinkedList.SLL;

import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pawan on 10/04/17.
 */
public class ExamineSLL {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nodes = br.readLine().split(" ");
        SinglyLinkedList sll = new SinglyLinkedList();
        for (String n: nodes) {
            sll.addNode(new LLNode(Integer.parseInt(n)));
        }

        System.out.println(sll.toString());
        flashOptionsToUser();
        int selection = 0;
        while(5 !=(selection=Integer.parseInt(br.readLine()))) {
            System.out.println("enter node value");
            int data = Integer.parseInt(br.readLine());
            switch (selection) {
                case 1:
                    sll.insertNodeInFront(new LLNode(data));
                    break;
                case 2:
                    sll.addNode(new LLNode(data));
                    break;
                case 3:
                    break;
                case 4:
                    LLNode node = sll.findMidNode();
                    System.out.println(node.getData());
                    break;
                default:
            }
            System.out.println(sll.toString());
        }
    }

    private static void flashOptionsToUser() {
        StringBuilder sb = new StringBuilder();
        sb.append("1. insert in begining of list\n");
        sb.append("2. insert in end of list\n");
        sb.append("3. insert in middle of list\n");
        sb.append("4. find middle of list\n");
        sb.append("5. exit\n");
        System.out.println(sb.toString());
    }
}
