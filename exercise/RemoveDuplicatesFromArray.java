/*
 * Write a Java program to remove duplicate elements from a given array and return the updated array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array.
 */

/**
 * @author vishe
 */

package com.exercise;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        int[] modifiedArr = removeDuplicatesInArray(arr);
        System.out.println("New length :" + modifiedArr.length);
        System.out.println("Modified array:");
        for (int num : modifiedArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicatesInArray(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        Arrays.sort(arr);

        int[] uniqueArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                uniqueArr[index++] = arr[i];
            }
        }

        return Arrays.copyOfRange(uniqueArr, 0, index);
    }
}