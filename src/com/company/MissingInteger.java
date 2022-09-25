package com.company;

import java.util.*;

public class MissingInteger {

    public int solution(int[] A){
        Arrays.sort(A);
        if (A[A.length-1] <= 0) return 1;
        boolean iso = false;
        for (int j : A) {
            if (j == 1) {
                iso = true;
                break;
            }
        }
        if (!iso) return 1;
        for (int i = 0; i < A.length - 1; i++){
            if (A[i] > 0 && A[i+1] - A[i] > 1) return A[i] + 1;
        }
        return A[A.length-1] + 1;
    }

    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        int[] A = new int[]{1, 3, 6, 4, 2};
        System.out.println(missingInteger.solution(A));
    }
}
