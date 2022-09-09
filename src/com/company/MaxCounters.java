package com.company;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A){
        int[] result = new int[N];
        int max = 0;
        int base = 0;

        for (int k : A) {
            if (k <= N) {
                // increase
                result[k - 1] = Math.max(base, result[k - 1]) + 1;
                max = Math.max(result[k - 1], max);
            } else {
                // max counter
                base = max;
            }
        }

        for (int i = 0; i < result.length; i++)
            if (result[i] < base)
                result[i] = base;

        return result;
    }

    public int[] solutionMatrix(int N, int[] A){

        int[][] matrix = new int[A.length][N];
        int max = 0;
        int[] result = Arrays.copyOf(matrix[0], N);

        for (int i = 0; i < A.length; i++){
            if (A[i] <= N){
                // increase
                matrix[i] = Arrays.copyOf(result, N);
                matrix[i][A[i]-1] = result[A[i]-1] + 1;
                max = Math.max(matrix[i][A[i]-1], max);
            } else {
                // max counter
                for (int j = 0; j < N; j++)
                    matrix[i][j] = max;
            }
            result = Arrays.copyOf(matrix[i], N);
        }
        /*for (int[] row : matrix)
            System.out.println(Arrays.toString(row));*/
        return matrix[A.length-1];
    }

    public static void main(String[] args) {
        MaxCounters maxCounters = new MaxCounters();
        int[] A = new int[]{3,4,4,6,1,4,4};
        System.out.println(Arrays.toString(maxCounters.solution(5, A)));
    }
}
