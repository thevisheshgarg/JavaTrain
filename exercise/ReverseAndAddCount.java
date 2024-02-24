/**
 * i/p: a b c d e f
 * o/p: f1 e2 d3 c4 b5 a6
 * 
 * @author vishe
 */

package com.exercise;

public class ReverseAndAddCount {
	public static void main(String [] args) {
		String str = "a b c d e f";
		StringBuilder reversed = new StringBuilder(str);
		reversed.reverse();
		for(int i=0;i<reversed.length();i=i+2) {
			System.out.print(reversed.charAt(i));
			System.out.print((i+1)/2+1+" ");
		}
	}
}
