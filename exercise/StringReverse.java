package com.exercise;

/**
 * i/p: "Hyderabad"
 * o/p: "dabaredyH"
 * 
 * @author vise
 */


public class StringReverse {
	//main method
	public static void main(String[] args) {
		String input = "Hyderabad";
		StringBuilder reversed = new StringBuilder(input); //converting to StringBuilder
        reversed.reverse(); //method to reverse the string
        System.out.println(reversed);
	}
}
