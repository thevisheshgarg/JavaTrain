package com.edu.collection;

import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set1 = new TreeSet();
		set1.add(new Integer(8));
		set1.add(new Integer(2));
		set1.add(new Integer(90));
		set1.add(new Integer(18));
		TreeSet set2 = null;
		try {
			set2 = (TreeSet) set1.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(set1);
		System.out.println(set2);
	}

}
