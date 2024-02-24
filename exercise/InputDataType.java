/**
 * Based on the i/p,you need to display whther 
 * it is integer or float or character or string.
 * 
 * @author vishe
 */

package com.exercise;
import java.util.Scanner;

public class InputDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = scanner.nextLine();
        scanner.close();
		
		if (isInteger(input)) {
				System.out.println("Input is an integer.");
			} else if (isFloat(input)) {
				System.out.println("Input is a float.");
			} else if (isCharacter(input)) {
				System.out.println("Input is a character.");
			} else {
				System.out.println("Input is a string.");
			}
		}

		public static boolean isInteger(String input) {
			try {
				Integer.parseInt(input);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}
	
		public static boolean isFloat(String input) {
			try {
				Float.parseFloat(input);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}
	
		public static boolean isCharacter(String input) {
			return input.length() == 1;
		}

}
