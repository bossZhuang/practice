package com.hu.practice.algorithm;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleSortingMain {
    public static void main(String[] args) {
        System.out.println("简单算法排序");
        List<Integer> list = Stream.of(1, 2, 32, 23, 321, 45, 8, 90, 227, 99).collect(Collectors.toList());
        SimpleSorting simpleSorting = new SimpleSorting();
        simpleSorting.bubbling(list);
        for (Integer i :list) {
            System.out.print(i + ",");
        }
    }



}
