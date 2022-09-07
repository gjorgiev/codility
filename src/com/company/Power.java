package com.company;

public class Power {

    public int power(int x, int n){
        if (n == 0)
            return 1;
        else if (x == 1)
            return x;
        else
            return x * power(x, n-1);
    }

    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.power(3, 3));
    }
}
