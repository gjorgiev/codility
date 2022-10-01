package com.company;

public class Task1 {

    public int solution(int A, int B){
        int count = 0;
        int p = A * B;
        while(p > 0){
            if (p % 2 != 0)
                count++;
            p /= 2;
        }
        return count;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.solution(3, 7));
    }
}
