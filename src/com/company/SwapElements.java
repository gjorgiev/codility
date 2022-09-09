package com.company;

import java.util.Arrays;

public class SwapElements {

    private int[] counting(int[] A, int M){
        int[] count = new int[M + 1];
        for (int j : A) count[j] += 1;
        return count;
    }

    public boolean checkSwap(int[] A, int[] B, int M){
        int N = A.length;
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int d = sumB - sumA;

        if (d % 2 == 1)
            return false;

        d /= 2;
        int[] count = counting(A, M);
        for(int i = 0; i < N; i++)
            if (0 <= B[i] - d && B[i] - d <= M && count[B[i] - d] > 0)
                return true;
        return false;
    }

    public static void main(String[] args) {
        SwapElements swapElements = new SwapElements();
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{1, 2, 4, 5};
        System.out.println(swapElements.checkSwap(A, B, 5));
    }
}
