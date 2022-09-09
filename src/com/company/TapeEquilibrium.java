package com.company;

import java.util.Arrays;

public class TapeEquilibrium {

    public int solution(int[] A){

        int sum = Arrays.stream(A).sum();
        int minDiff = Integer.MAX_VALUE;
        int currentDiff;
        long sumFirstPart = 0;
        long sumSecondPart;

        for (int i : A) {
            sumFirstPart += i;
            sumSecondPart = sum - sumFirstPart;
            currentDiff = (int) Math.abs(sumFirstPart - sumSecondPart);
            minDiff = Math.min(currentDiff, minDiff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int[] A = new int[]{3, 1, 2, 4, 3};
        System.out.println(tapeEquilibrium.solution(A));
    }
}
