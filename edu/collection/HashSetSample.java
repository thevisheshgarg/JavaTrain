package com.edu.collection;

import java.util.HashSet;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set1 = new HashSet();
		set1.add(new Integer(90));
		set1.add("Vishesh");
		set1.add(new Integer(50));
		set1.add(new Integer(789));
		System.out.println(set1);
		HashSet set2 = new HashSet();
		set2.add(new Integer(90));
		set2.add("Vishesh");
		System.out.println(set2);
		System.out.println(set1.retainAll(set2));
		System.out.println(set1);
		System.out.println(set2);
		
	}

}
