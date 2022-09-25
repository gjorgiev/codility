package com.company;

public class MinAvgTwoSlice {

    public int solution(int[] A){
        float min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < A.length - 2; i++){
            float v1 = (float)(A[i] + A[i + 1] + A[i + 2]) / 3;
            float v2 = (float)(A[i] + A[i + 1]) / 2;
            if (min > v1 || min > v2) {
                min = Math.min(v1, v2);
                idx = i;
            }
        }
        if(min > (A[A.length - 1] + A[A.length - 2])/2)
            return A.length-2;
        return idx;
    }

    public static void main(String[] args) {
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        int[] A = new int[]{4,2,2,5,1,5,8};
        System.out.println(minAvgTwoSlice.solution(A));
    }
}
