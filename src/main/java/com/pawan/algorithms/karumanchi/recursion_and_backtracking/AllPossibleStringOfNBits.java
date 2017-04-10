package com.pawan.algorithms.karumanchi.recursion_and_backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pawan on 10/04/17.
 */
public class AllPossibleStringOfNBits {
    private static int[] arr = null;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        binary(n);
    }

    private static void binary(int n) {
        if(n<1) {
            printArray();
        } else {
            arr[n-1] = 0;
            binary(n-1);
            arr[n-1] = 1;
            binary(n-1);
        }
    }

    private static void printArray() {
        for(int i: arr) {
            System.out.format("%d ",i);
        }
        System.out.println();
    }
}
