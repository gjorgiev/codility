package com.company;

import java.util.Arrays;

public class Triangular {

    public int solution(int[] A){
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] > A[i+2] - A[i+1])
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        System.out.println(triangular.solution(new int[]{10,2,5,1,8,20}));
    }
}
