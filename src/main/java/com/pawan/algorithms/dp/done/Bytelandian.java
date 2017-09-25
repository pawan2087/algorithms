package com.pawan.algorithms.dp.done;

import java.util.*;

/**
 * Created by pawan.s on 9/11/2017.
 */
//http://www.spoj.com/problems/COINS/
public class Bytelandian {
    static Map<Integer, Long> dp = new HashMap<Integer, Long>();

    public static void main(String[] args) {
        int n = 18;
        System.out.format("The doller price = %d", func(n));
    }

    static long func(int n) {
        if(n<=0) {
            return 0;
        }

        if(dp.containsKey(n)) {
            return dp.get(n);
        }

        long aux = func(n/2) + func(n/3) + func(n/4);
        if(aux>n) {
            dp.put(n, aux);
        } else {
            dp.put(n, new Long(n));
        }
        return dp.get(n);
    }

}
