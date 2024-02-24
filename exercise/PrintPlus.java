/**
 * i/p: 3
	o/p: +++
 
	i/p: 4
	o/p: ++++
	
	@author vishe
 */

package com.exercise;

public class PrintPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 3;
		if(input>0) {
			do {
				System.out.print("+");
				input--;
			}while(input>0);
		}
	}

}
