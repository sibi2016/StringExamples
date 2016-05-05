package com.main;

public class HashEquals {

	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer("Hello");
		StringBuffer str2 = str1.append("Sibi");
		
		System.out.println(str1.hashCode());

		System.out.println(str2.hashCode());
	}
}

