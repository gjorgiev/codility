package com.company;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A){
        if (A.length == 0)
            return 0;
        Arrays.sort(A);

        int[] products = new int[]{
                A[0] * A[1] * A[2],
                A[0] * A[1] * A[A.length - 1],
                A[0] * A[A.length - 1] * A[A.length - 2],
                A[A.length - 1] * A[A.length - 2] * A[A.length - 3],
                A[A.length - 1] * A[A.length - 2] * A[0],
                A[A.length - 1] * A[0] * A[1]
        };
        int max = Integer.MIN_VALUE;
        for(int p : products)
            if (p > max)
                max = p;
        return max;
    }

    public static void main(String[] args) {
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        System.out.println(maxProductOfThree.solution(new int[]{-5,5,-5,4}));
    }

}
