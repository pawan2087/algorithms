package com.pawan.algorithms.karumanchi.LinkedList;

import com.pawan.algorithms.karumanchi.LinkedList.CLL.CircularLinkedList;
import com.pawan.algorithms.karumanchi.LinkedList.SLL.SinglyLinkedList;
import com.pawan.algorithms.karumanchi.LinkedList.core.LLNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pawan.s on 4/11/2017.
 */
public class ListUtil {

    public static void makeList(SinglyLinkedList sll) throws IOException {
        System.out.println("enter values for list");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nodes = br.readLine().split(" ");
        for (String n: nodes) {
            sll.addNode(Integer.parseInt(n));
        }
    }

    public static void makeCList(CircularLinkedList cll) throws IOException {
        System.out.println("enter values for list");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nodes = br.readLine().split(" ");
        for (String n: nodes) {
            cll.addNode(Integer.parseInt(n));
        }
    }

    public static int getIntFromConsole() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public static String printList(LLNode head) {
        String result = "";
        while(null!=head) {
            result += head.getData() + " --> ";
            head = head.getNext();
        }
        return result;
    }
}
