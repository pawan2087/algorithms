package com.pawan.algorithms.dp.done;

/**
 * Created by pawan.s on 9/11/2017.
 */

//Kadane's Algorithm
public class MaxContigousSum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        //int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3};

        maxContigousInArray(arr);
        maxContigousInArray2(arr);
    }

    static void maxContigousInArray(int[] arr) {
        int max_so_far=arr[0]; //max sum of all sub arrays
        int max_ending_here=arr[0];
        int start =0, end = 0;
        for(int i=1; i<arr.length; i++) {
            max_ending_here += arr[i];
            if (max_ending_here < 0) {
                max_ending_here = 0;
                start = i + 1;
            } else if(max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                end = i;
            }
        }

        System.out.format("Maximum sum = %d\n", max_so_far);
        System.out.format("start = %d end = %d\n", start, end);
    }

    static void maxContigousInArray2(int[] arr) {
        int max_so_far=arr[0]; //max sum of all sub arrays
        int max_ending_here=arr[0];
        int start =0, end = 0;
        for(int i=1; i<arr.length; i++) {
            //max_ending_here = Math.max(max_ending_here+arr[i], arr[i]);
            if( max_ending_here+arr[i] > arr[i] ) {
                max_ending_here = max_ending_here + arr[i];
            } else {
                max_ending_here = arr[i];
                start = i;
            }
            if(max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                end = i;
            }
        }

        System.out.format("Maximum sum = %d\n", max_so_far);
        System.out.format("start = %d end = %d\n", start, end);
    }
}
