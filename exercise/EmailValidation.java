//i/p: vasu34k@gmail.com
//o/p: valid emailid
//
//i/p: bob34kgmail.com
//o/p:Invalid emailid

/**
 * @author vishe
 */

package com.exercise;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "visheshgarg5872@gmail.com";
		if (!email.isEmpty() && email.contains("@") && email.indexOf('.') > email.indexOf('@')) {
			System.out.println("Valid email id");
		} else {
			System.out.println("Invalid email id");
		}
	}

}

