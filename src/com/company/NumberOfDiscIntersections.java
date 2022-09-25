package com.company;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public int solution(int[] A){
        int N = A.length;
        int[] leftEdges = new int[N];
        int[] rightEdges = new int[N];
        for (int i = 0; i < N; i++) {
            leftEdges[i] = i - A[i];
            rightEdges[i] = i + A[i];
        }
        Arrays.sort(leftEdges);
        Arrays.sort(rightEdges);

        int intersections = 0;
        int rightIdx = 0;

        for (int leftIdx = 0; leftIdx < N; leftIdx++){
            while (rightEdges[rightIdx] < leftEdges[leftIdx])
                rightIdx++;
            intersections += leftIdx - rightIdx;
            if (intersections > 10000000){
                return -1;
            }
        }
        return intersections;
    }

    public static void main(String[] args) {
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        System.out.println(numberOfDiscIntersections.solution(new int[]{1,5,2,1,4,0}));
    }
}
