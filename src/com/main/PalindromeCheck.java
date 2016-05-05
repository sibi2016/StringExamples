package com.main;
import java.util.Scanner;

public class PalindromeCheck {
	
	public static void main(String[] args)
	{
		System.out.println("Enter a word to check for Palindrome ");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		sc.close();
		//System.out.print(original);
		int length = original.length();
		
		String reverse = "";
		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
		}
	    if(reverse.equals(original))
	    {
	    	System.out.println("This word is a Palindrome.");
	    }
	    else
	    {
	    	System.out.println("This word is not a Palindrome.");
	    }
	}

}
