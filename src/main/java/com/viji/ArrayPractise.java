package com.viji;

public class ArrayPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 12;
		a[2] = 13;
		a[3] = 14;
		a[4] = 15;
//	For Integers Array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
//For Character Array
		char[] names = { 'v', 'i', 'j', 'i' };
		for (int i = 0; i < names.length; i++) {
			System.out.println("Print all the characters in the list names " + names[i]);
		}
//For String Array
		String[] person_name = { "viji", "Selva", "Manickam", "Chitra" };
		for (int i = 0; i < person_name.length; i++) {
			System.out.println(person_name[i]);
		} 

	}

}
