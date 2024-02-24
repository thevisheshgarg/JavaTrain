/**
 * 
 * i/p:String a = "Computer"
 * o/p: r e t u p m o C
 * 
 * @author vishe
 */

package com.exercise;

public class ReverseAddSpace {
	public static void main (String [] args) {
		String a = "Computer";
		for(int i = 1;i<=a.length();i++) {
			System.out.print(a.charAt(a.length()-i)+" ");
		}
	}
	
}
