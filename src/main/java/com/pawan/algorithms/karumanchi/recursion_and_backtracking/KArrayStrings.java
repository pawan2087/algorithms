package com.pawan.algorithms.karumanchi.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pawan on 10/04/17.
 */
public class KArrayStrings {
    private static int[] arr = null;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] paramas = br.readLine().split(" ");
        int n = Integer.parseInt(paramas[0]);
        int k = Integer.parseInt(paramas[1]);
        arr = new int[n];
        kArray(n,k);
    }

    private static void kArray(int n, int k) {
        if(n<1) {
            printArray();
        } else {
            for(int i=0;i<k;i++) {
                arr[n-1] = i;
                kArray(n-1, k);
            }
        }
    }

    private static void printArray() {
        for(int i: arr) {
            System.out.format("%d ",i);
        }
        System.out.println();
    }
}
