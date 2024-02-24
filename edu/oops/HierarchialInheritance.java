package com.edu.oops;

public class HierarchialInheritance{
	public static void main (String [] args) {
		C obj = new C();
		obj.displayA();
		obj.displayC();
	}
}

class A{
	public void displayA() {
		System.out.println("A");
	}
}

class B extends A{
	public void displayB() {
		System.out.println("B");
	}
}

class C extends A{
	public void displayC() {
		System.out.println("C");
	}
}

