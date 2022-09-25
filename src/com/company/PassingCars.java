package com.company;

public class PassingCars {

    public int solution(int[] A){
        int sE = 0;
        long s = 0;
        for (int j : A) {
            if (j == 0) sE++;
            if (j == 1) s += sE;
        }
        if (s>1000000000) return -1;
        return (int)s;
    }

    public static void main(String[] args) {
        PassingCars passingCars = new PassingCars();
        int[] A = new int[]{0,1,0,1,1};
        System.out.println(passingCars.solution(A));
    }
}
