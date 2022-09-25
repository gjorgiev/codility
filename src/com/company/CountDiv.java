package com.company;

public class CountDiv {

    public int solution(int A, int B, int K){
        int c = (B/K) - (A/K);
        if (A%K == 0) c++;
        return c;
    }

    public int solutionSlow(int A, int B, int K){
        int count = 0;
        for (int i = A; i <= B; i++){
            if (i % K == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDiv countDiv = new CountDiv();
        System.out.println(countDiv.solution(6, 11, 2));
    }
}
