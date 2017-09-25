package com.pawan.algorithms.dp.done;

/**
 * Created by pawan.s on 9/19/2017.
 */
public class MinCostPath {
    public static void main(String[] args) {
        int m=3, n=3;
        int pos_i = 2, pos_j = 2;
        int[][] c = {{1,2,3},{4,8,2},{1,5,3}};
        System.out.format("Minimum cost for path c[%d][%d] = %d", pos_i, pos_j, minCostPath(c, 3, 3, pos_i, pos_j));
    }

    static int minCostPath(int[][] c, int m, int n, int pos_i, int pos_j) {
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 && j==0) { dp[i][j] = c[i][j]; }
                else if(i==0) { dp[i][j] = c[i][j] + dp[i][j-1]; }
                else if(j==0) { dp[i][j] = c[i][j] + dp[i-1][j]; }
                else {
                    dp[i][j] = c[i][j] + min(dp[i][j-1], dp[i-1][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[pos_i][pos_j];
    }

    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b,c));
    }
}
