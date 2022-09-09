package com.company;

public class PermCheck {

    private int[] counting(int[] A){
        int[] count = new int[A.length + 1];
        for (int j : A)
            if (j <= A.length)
                count[j] += 1;
            else
                return new int[]{};
        return count;
    }

    public int solution(int[] A){
        int N = A.length;
        int[] count = counting(A);

        if (count.length == 0)
            return 0;

        for (int i = 0; i < N; i++){
            if (count[i+1] != 1)
                return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        int[] A = new int[]{4,1,3,2};
        System.out.println(permCheck.solution(A));
    }
}
