package com.company;

import java.util.Arrays;

public class CyclicRotation {

    private int[] shiftArray(int[] A, int K){
        int size = A.length;
        if (K == 0 || size == 0)
            return A;

        int[] newArr = new int[size];
        // iterate the rest and add to new list (without the last element)
        System.arraycopy(A, 0, newArr, 1, size - 1);
        // set the last element as first
        newArr[0] = A[size - 1];
        return shiftArray(newArr, K - 1);
    }

    public int[] solution(int[] A, int K){
        return shiftArray(A, K);
    }

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] A = {3,4,3,4,5,3};
        int[] result = cyclicRotation.solution(A, 3);
        System.out.println(Arrays.toString(result));
    }
}
