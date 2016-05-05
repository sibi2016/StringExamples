package com.main;

public class ReverseWord{
	
	public static void main(String[] args)
	{
		String str = "String is immutable";
		String[] words = str.split(" ");
		
		for(String ss: words)
		{
			int length = ss.length();
			char[] array = ss.toCharArray();
			
			for (int i = (length-1) ; i>=0;i--)
			{
				System.out.print(array[i]);
			}
			System.out.print(" ");
		}
		
	}

}
