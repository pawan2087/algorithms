package com.pawan.algorithms.dp.done;

/**
 * Created by pawan.s on 9/11/2017.
 */
import java.util.*;
import java.io.*;

public class Fibonaci {
    int MAX = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.format("Fibonaci(%d) = %d", n, fib(n));
    }

    static long fib(int n) {
        long[] fib = new long[100];
        fib[0] = 0; fib[1] = 1;
        for(int i=2; i<=n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}
