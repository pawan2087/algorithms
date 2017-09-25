package com.pawan.algorithms.dp.done;

/**
 * Created by pawan.s on 9/12/2017.
 */
public class editDistance {
    public static void main(String[] args) {
        //String str1="abcdefghijklmnopqrstuvwxyz";
        //String str2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str1="abcdefg";
        String str2="ABCDEFG";
        long startMillis = System.currentTimeMillis();
        int minDist = minEdits(str1, str2, str1.length(), str2.length());
        long timeTaken = System.currentTimeMillis() - startMillis;
        System.out.format("Minumum Edits = %d, timetaken=%d\n", minDist, timeTaken);
    }

    static int minEdits(String s1, String s2, int m, int n) {
        if(m == 0) { return n; }
        if(n == 0) { return m; }

        if(s1.charAt(m-1) == s2.charAt(n-1)) {
            return minEdits(s1,s2,m-1,n-1);
        }

        return 1 + min(minEdits(s1, s2, m, n-1),
                minEdits(s1, s2, m-1, n),
                minEdits(s1, s2, m-1, n-1));
    }

    //static int minEditsDP(String s1, String s2, int m, int n) {
    //    int dp[][] = new int[m+1][n+1];

    //}

    static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b,c));
    }
}
