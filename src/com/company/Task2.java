package com.company;

import java.util.*;

public class Task2 {

    /*
    public int solution(int[] blocks) {

        int maxAsc = 1;
        int maxDesc = 1;
        int current = 1;

        // find max ascending
        for (int i=1; i<blocks.length; i++) {
            if (blocks[i] >= blocks[i-1])
                current++;
            else {
                if (maxAsc < current)
                    maxAsc = current;
                current = 1;
            }
        }

        if (maxAsc < current)
            maxAsc = current;

        // find max descending
        for (int i=1; i<blocks.length; i++) {
            if (blocks[i] >= blocks[i-1])
                current++;
            else {
                if (maxDesc < current)
                    maxDesc = current;
                current = 1;
            }
        }

        if (maxDesc < current)
            maxDesc = current;


        return maxAsc + maxDesc;
    }


    */

        public int solution(int[] blocks){
            int max = 0;
            int count = 0;
            for (int i = 1; i < blocks.length - 1; i++) {
                // detect hill
                if (blocks[i] >= blocks[i-1] && blocks[i] > blocks[i+1]){
                    max = Math.max(max, count + 1);
                    count = 1;
                    System.out.println(max);
                } else {
                    count++;
                }
            }
            max = Math.max(max, count + 2);
            return max;
        }

 /*
        public int solution(int[] blocks){
            LinkedList<Integer> linkedList = new LinkedList<>();
            ListIterator<Integer> li = linkedList.listIterator(0);
            while (li.hasNext()) {

                if (li.hasPrevious()) {
                    li.previous();

                }
            }
        }

        public int solution(int[] blocks){
            int max = 0;
            int count = 0;
            int j = 1;
            if (blocks.length == 0){
                return 0;
            }
            for (int i = 0; i < blocks.length; i++) {
                // special case: if we are at the first element go only right
                if (i == 0 && blocks.length > 1){
                    while (blocks[i] <= blocks[j]){
                        count++;
                        j++;
                    }
                } else
                // special case: if we are at the last element go only left
                if (i == blocks.length - 1){
                    while (blocks[i] <= blocks[i - j]){
                        count++;
                        j--;
                    }
                }
                // count for all the rest
                while (blocks[i] <= blocks[i - j] && blocks[i] <= blocks[i + j]){
                    count++;
                    j++;
                }
                max = Math.max(count + 1, max);
                j = 1;
            }
            return max;
        }
    */
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.solution(new int[] {2,4,5,6,6,7,8,2}));
    }
}
