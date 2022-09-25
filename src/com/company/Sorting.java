package com.company;

import java.util.Arrays;

public class Sorting {

    public int[] selectionSort(int[] A){
        int minimal;
        for (int i = 0; i < A.length; i++){
            minimal = i;
            for (int j = i + 1; j < A.length; j++)
                if (A[j] < A[minimal])
                    minimal = j;
            // swap A[i] with A[minimal]
            int tmp = A[i];
            A[i] = A[minimal];
            A[minimal] = tmp;
        }
        return A;
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        System.out.println(Arrays.toString(sorting.selectionSort(new int[]{4,5,3,2,5,6,4,7})));
    }
}
