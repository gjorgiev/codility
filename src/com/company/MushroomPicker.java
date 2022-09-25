package com.company;

public class MushroomPicker {

    private int[] prefixSums(int[] A){
        int[] P = new int[A.length + 1];
        for (int k = 1; k < A.length + 1; k++){
            P[k] = P[k-1] + A[k-1];
        }
        return P;
    }

    private int countTotal(int[] P, int x, int y){
        return P[y + 1] - P[x];
    }

    public int mushrooms(int[] A, int k, int m){
        int result = 0;
        int[] pref = prefixSums(A);
        int leftPos, rightPos;

        for (int p = 0; p < Math.min(m, k) + 1; p++){
            leftPos = k - p;
            rightPos = Math.min(A.length - 1, Math.max(k, k + m - 2 * p));
            result = Math.max(result, countTotal(pref, leftPos, rightPos));
        }
        for (int p = 0; p < Math.min(m + 1, A.length - k); p++){
            rightPos = k + p;
            leftPos = Math.max(0, Math.min(k, k - (m - 2 * p)));
            result = Math.max(result, countTotal(pref, leftPos, rightPos));
        }

        return result;
    }

    public static void main(String[] args) {
        MushroomPicker mushroomPicker = new MushroomPicker();
        int[] A = new int[]{2,3,7,5,1,3,9};
        System.out.println(mushroomPicker.mushrooms(A, 4, 6));
    }
}
