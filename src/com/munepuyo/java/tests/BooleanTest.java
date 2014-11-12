package com.munepuyo.java.tests;

public class Base64Test {

	public static void main(String[] args) {
		testA();
	}

	public static void testA() {
		boolean a = false;
		boolean b = ! a;

		a = true;

		System.out.println(a); //true
		System.out.println(b); //true
		System.out.println(a); //true
		System.out.println(b); //true
	}
}

