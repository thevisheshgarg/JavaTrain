/*
 * Assume there is a hashtable with below values.
 * Srinivas,srinivas,laptop,Laptop,Edu,Tech.Design code which shld display index of duplicate values(pls ignore case).
 */

package com.edu.exercise;

import java.util.*;

public class HashTableDuplicates {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Srinivas");
        ht.put(2, "srinivas");
        ht.put(3, "laptop");
        ht.put(4, "Laptop");
        ht.put(5, "Edu");
        ht.put(6, "Tech");

        Set<Integer> setOfKeys = ht.keySet();

        for (Integer key1 : setOfKeys) {
            for (Integer key2 : setOfKeys) {
                if (ht.get(key1).toLowerCase().equals(ht.get(key2).toLowerCase()) && key1 != key2) {
                    System.out.println(key1);
                }
            }
        }
    }
}