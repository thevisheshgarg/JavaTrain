/**
 * "cat"
 * "bat"
 * "rat"
 * "computer" 
 * in an array 
 * and display the contents in array in ascending order.
 * 
 * @author vishe
 */

package com.exercise;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"cat","bat","rat","computer"};
		Arrays.sort(arr);
		for (String temp: arr) {
			System.out.print(temp+" ");
		}
	}

}
