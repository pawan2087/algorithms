package com.pawan.algorithms.dp.done;

/**
 * Created by pawan.s on 9/22/2017.
 */
public class Eggdrop {
    public static void main(String[] args) {
        int n=2;
        int k=10;
        System.out.println(eggDropDP(n, k));
    }

    static int eggDrop(int n, int k) {
        if(k==1 || k==0) {
            return k;
        }

        if(n==1) {
            return k;
        }

        int min = Integer.MAX_VALUE;

        for(int i=1; i<=k; i++) {
            int attempts = Math.max(eggDrop(n-1, i-1), eggDrop(n, k-i));
            if(min > attempts) {
                min = attempts;
            }
        }

        return min + 1;
    }

    static int eggDropDP(int n, int k) {
        int d[][] = new int[n+1][k+1];

        for(int i=1; i<=n ; i++) {
            d[i][1] = 1;
            d[i][0] = 0;
        }

        for(int i=1; i<=k; i++) {
            d[1][i] = i;
        }

        for(int i=2; i<=n; i++) {
            for(int j=2; j<=k; j++) {
                d[i][j] = Integer.MAX_VALUE;
                for(int x=1; x<=j; x++) {
                    int temp = 1 + Math.max(d[i-1][x-1], d[i][j-x]);
                    if(temp < d[i][j]) {
                        d[i][j] = temp;
                    }
                }
            }
        }

        return d[n][k];
    }
}
