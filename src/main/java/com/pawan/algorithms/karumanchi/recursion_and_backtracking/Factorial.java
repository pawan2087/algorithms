package com.pawan.algorithms.karumanchi.recursion_and_backtracking;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pawan on 09/04/17.
 */
public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line  = "";
        while(!(line = br.readLine()).isEmpty()) {
            System.out.println(factorial(Integer.parseInt(line)));
        }
    }

    private static int factorial(int n) {
        if(n==1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
