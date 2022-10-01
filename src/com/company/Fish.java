package com.company;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B){
        Stack<Integer> ds = new Stack<>();
        int count = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 1)
                ds.push(A[i]);
            else {
                while(!ds.isEmpty()){
                    if (ds.peek() > A[i]) {
                        count++;
                        break;
                    }
                    else if (ds.peek() < A[i]){
                        ds.pop();
                        count++;
                    }
                }
            }
        }
        return A.length - count;
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        System.out.println(fish.solution(new int[]{4,3,2,1,5}, new int[]{0,1,0,0,0}));
    }
}
