package com.main;

public class InsertStringInBetween 
{
	public static void main(String[] args) 
	{
		String str = "String is immutable";
		String strFinal = "";
		String[] words = str.split(" ");
		int counter = 9;
		for(String ss: words)
		{
			strFinal = strFinal + String.format("%%%S%H ", ss, counter++);
		}
		strFinal = strFinal.trim();
		System.out.println(strFinal);
	}
}
