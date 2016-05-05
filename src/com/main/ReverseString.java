package com.main;

public class ReverseString {

	public static void main(String[] args)
	{
		String str1 = new String("This is cool");
		
		int length = str1.length();
		char[] array = str1.toCharArray();
		System.out.println("Original String");
		System.out.println(array);
		System.out.println();
		
		System.out.println("Reversed String");
		for(int i=(array.length-1);i>=0;i--)
		{
			System.out.print(array[i]);
		}
	}
}
