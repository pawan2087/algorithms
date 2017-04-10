package com.pawan.algorithms.karumanchi.recursion_and_backtracking;

/**
 * Created by Pawan on 10/04/17.
 */
public class IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6};
        if(0<isArrayInSortedOrder(arr, arr.length-1)) { System.out.println("Sorted"); }
        else {
            System.out.println("Not Sorted");
        }
    }

    private static int isArrayInSortedOrder(int[] arr, int index) {
        if(index<2) {
            return 1;
        }else {
            return (arr[index-1]<arr[index-2])?0:isArrayInSortedOrder(arr, index-1);
        }
    }
}
