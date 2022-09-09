package com.company;

public class FrogRiverOne {

    public int solution(int X, int[] A){
        int[] B = new int[X];
        int sum = 0;

        for (int i = 0; i < A.length; i++){
            if (B[A[i] - 1] == 0 && A[i] <= X){
                sum++;
                B[A[i]-1] = 1;
            }
            if (sum == X) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int[] A = new int[]{1,3,1,4,2,3,5,4};
        System.out.println(frogRiverOne.solution(5, A));
    }
}
