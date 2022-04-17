package com.company;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Set<Integer> numbers2 = new TreeSet<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0 & numbers.get(i) % 2 == 0) {
                numbers2.add(numbers.get(i));
            }

        }
        System.out.println(numbers2);
    }
}