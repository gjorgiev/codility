package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class OddOccurrencesInArray {

    public int solution(int[] A){
        // convert int[] to ArrayList<Integer>
        List<Integer> list = IntStream.of(A).boxed().toList();
        // let's keep the found items in a HashMap with corresponding index
        HashMap<Integer, Integer> itemsCount = new HashMap<>();
        for (Integer key : list) {
            if (!itemsCount.containsKey(key)) {
                itemsCount.put(key, 1);
            } else {
                Integer value = itemsCount.get(key);
                itemsCount.replace(key, value + 1);
            }
        }
        for (Integer key : list){
            Integer item = itemsCount.get(key);
            if (item % 2 == 1)
                return key;
        }
        return 0;
    }

    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int[] A = new int[]{9, 3, 9, 3, 9, 7, 9};
        System.out.println(oddOccurrencesInArray.solution(A));
    }
}
