package com.pawan.algorithms.karumanchi.LinkedList.CLL;

import com.pawan.algorithms.karumanchi.LinkedList.SLL.SinglyLinkedList;
import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pawan on 10/04/17.
 */
public class ExamineCLL {
    private static String HEADER = "Welcome to Circular Linked List. Enter your list nodes !!!";
    public static void main(String[] args) throws IOException{
        System.out.println(HEADER);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nodes = br.readLine().split(" ");
        CircularLinkedList cll = new CircularLinkedList();
        for (String n: nodes) {
            cll.addNode(Integer.parseInt(n));
        }

        System.out.println(cll.toString());
        flashOptionsToUser();
        int selection = 0;
        while(6 !=(selection=Integer.parseInt(br.readLine()))) {

            switch (selection) {
                case 1:
                    cll.addNodeInFron(getData(br));
                    break;
                case 2:
                    cll.addNode((getData(br)));
                    break;
                case 3:
                    break;
                case 5:
                    cll.deleteLastNode();
                    //LLNode node = sll.findMidNode();
                    //System.out.println(node.getData());
                    break;
                default:
            }
            System.out.println(cll.toString());
        }
    }

    private static void flashOptionsToUser() {
        StringBuilder sb = new StringBuilder();
        sb.append("1. insert in begining of list\n");
        sb.append("2. insert in end of list\n");
        sb.append("3. insert in middle of list\n");
        sb.append("4. find middle of list\n");
        sb.append("5. delete last node\n");
        sb.append("6. exit\n");
        System.out.println(sb.toString());
    }

    private static int getData(BufferedReader br) throws IOException {
        System.out.println("enter node value");
        return Integer.parseInt(br.readLine());
    }
}
