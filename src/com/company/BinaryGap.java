package com.company;

public class BinaryGap {

    public int solution(int n){
        int maxGap = 0;
        int gap = 0;
        boolean start = false;
        while(n > 0){
            if (n % 2 > 0){
                if (gap > maxGap)
                    maxGap = gap;
                gap = 0;
                start = true;
            } else if (start){
                gap++;
            }
            n /= 2;
        }
        return maxGap;
    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.solution(1041));
    }
}
