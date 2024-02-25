/*
 * Program to find duplicate numbers in an array if it contains multiple duplicates?
 */

/**
 * @author vishe
 */

package com.exercise;

import java.util.*;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3, 3, 5, 8};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("Duplicate elements in the array are:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

