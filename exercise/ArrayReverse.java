/**
 * Display 'a','b','c','d' in reverse order using Arrays.
 * 
 * @author vishe
 */

package com.exercise;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {
	
	static void reverse(Character a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character [] arr = {'a','b','c','d'};
		ArrayReverse.reverse(arr);
	}

}
