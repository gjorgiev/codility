package com.company;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A){

        Arrays.sort(A);

        if (A.length == 0)
            return 1;

        if (A[0] != 1)
            return 1;

        for (int i = 0; i < A.length; i++){
            if (A[i] != i + 1)
                return A[i] - 1;
        }
        return A[A.length - 1] + 1;
    }

    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        int[] A = new int[]{2, 3, 1, 5};
        System.out.println(permMissingElem.solution(A));
    }
}
