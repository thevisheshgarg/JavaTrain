/**
 * add values from 239 till 699 using for loop.
	example:
	2 till 8
 
	2+3+4+5+6+7+8=?
	
	@author vishe
 */

package com.exercise;

public class AddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 239;
		int end = 699;
		int sum = 0;
		do {
			sum+=start;
			start++;
		} while(start<=end);
		System.out.println(sum);
	}

}
