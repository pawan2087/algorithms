package com.pawan.algorithms.dp.done;

/**
 * Created by pawan.s on 9/22/2017.
 */
public class KnapSack {

    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }

    static int knapSack(int W, int[] wt, int[] val, int n) {
        int k[][] = new int[n+1][W+1];

        for(int i=0;i<=n;i++) {
            for(int w=0;w<=W;w++) {
                if(i==0 || w==0) {
                    k[i][w] = 0;
                } else if(wt[i-1] > w) {
                    k[i][w] = k[i-1][w];
                } else {
                    k[i][w] = Math.max(val[i-1] + k[i-1][w-wt[i-1]], k[i-1][w]);
                }
            }
        }

        return k[n][W];
    }
}
