/*
 * assume there is an array with 6 elementsie {bat,rat,cat,mat,TV,Laptop}.
 * Deisgn a hashmap whose values are same as array element  value and whose keys are index no in hashmap.
 */

/**
 * @author vishe
 */

package com.edu.exercise;

import java.util.Hashtable;

public class HashMapToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"bat", "rat", "cat", "mat", "TV", "laptop"};
        Hashtable<Integer, String> table = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            table.put(i, arr[i]);
        }
        System.out.println(table);
		
	}

}
