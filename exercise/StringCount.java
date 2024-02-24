package com.exercise;

/**
 * i/p: "aksajd5676@$%^"
 * o/p: No. of numbers:4
		No. of Alphabets:6
		Total Size:14
 * 
 * @author vishe
 *
 */

public class StringCount {
	//main method
	public static void main(String[]agrs) {
		String temp = "aksajd5676@$%^";
		int numCount =  0;
		int letterCount = 0;
		for (char ch: temp.toCharArray()) { //foreach loop&converting string to charArray
			if(Character.isLetter(ch)) { //using inbuild char method to check isLetter
				letterCount++; //increment letterCount
			} else if (Character.isDigit(ch)) { //using inbuild char method to check isDigit
				numCount++; //increment numCount
			}
		}
		System.out.println("No. of numbers:"+numCount+
				"\nNo. of Alphabets:"+letterCount+
				"\nTotal Size:"+temp.length()); 
	}
}
