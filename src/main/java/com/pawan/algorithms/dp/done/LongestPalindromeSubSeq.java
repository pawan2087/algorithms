package com.pawan.algorithms.dp.done;

/**
 * Created by pawan.s on 9/25/2017.
 */
public class LongestPalindromeSubSeq {

    public static void main(String[] args) {
        String str = "BBABCBCAB";
        //System.out.format("Longest Palindrome seq = %d\n", maxPalindromeSubSeq(str.toCharArray(), 0, str.length()-1));
        System.out.format("Longest Palindrome seq = %d\n", maxPalindromeSubSeqDP(str.toCharArray(), str.length()));

    }

    static int maxPalindromeSubSeq(char[] x, int l, int r) {
        if(l==r) {
            return 1;
        }

        if(x[l] == x[r]) {
            return 2 + maxPalindromeSubSeq(x, l+1, r-1);
        } else {
            return Math.max(maxPalindromeSubSeq(x, l, r-1), maxPalindromeSubSeq(x, l+1, r));
        }
    }

    static int maxPalindromeSubSeqDP(char[] x, int n) {
        int ss;
        int l[][] = new int[n][n];
        for(int i=0; i<n; i++) {
            l[i][i] = 1;
        }

        for(ss=2; ss<=n; ss++) {
            for(int i=0;i<n-ss+1;i++) {
                int j = i + ss -1;
                if(x[i]==x[j] && ss==2) {
                    l[i][j] = 2;
                } else if(x[i]==x[j]) {
                    l[i][j] = l[i+1][j-1] + 2;
                } else {
                    l[i][j] = Math.max(l[i][j-1], l[i+1][j]);
                }
            }
        }

        return l[0][n-1];
    }
}
