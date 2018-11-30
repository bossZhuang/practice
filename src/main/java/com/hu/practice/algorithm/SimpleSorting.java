package com.hu.practice.algorithm;

import java.util.List;

public class SimpleSorting {

    public List<Integer> bubbling(List<Integer> list) {
        System.out.println("冒泡排序");
        for (int j = 0; j < list.size() - 1; j++) {
            for (int i=0;i < list.size() - 1; i++){
                if (list.get(i) > list.get(i + 1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i+1, temp);
                }
            }
        }
        return list;
    }
}
