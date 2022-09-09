package com.company;

public class FrogJmp {

    public int solution(int X, int Y, int D){
        if ((Y - X) % D == 0)
            return (Y - X) / D;
        else
            return (Y - X) / D + 1;
    }

    public static void main(String[] args) {
        FrogJmp frogJmp = new FrogJmp();
        System.out.println(frogJmp.solution(10, 85, 30));
    }
}
