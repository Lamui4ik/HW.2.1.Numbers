package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListSort = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0 & intList.get(i) % 2 == 0) {
                intListSort.add(intList.get(i));
            }
        }
        Collections.sort(intListSort);
        intListSort.forEach(System.out::println);

        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}