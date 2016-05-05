package com.main;

public class ReplaceString {

	public static void main(String[] args)
	{
		String str = "I love math";
		System.out.println("Original string: "+str);
		String newStr = str.replace(str.substring(7), "Science");
		System.out.println("Replaced String: "+newStr);
		
	}
}
