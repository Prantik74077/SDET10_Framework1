package com.practicejava;

import org.testng.annotations.Test;

public class Test27 
{
	 @Test
	 public void palindrome()
	 {
		    int number=151;
			int temp=number;
			int reverse=0;
			while (temp!=0)
			{
		        int last=temp%10;
				reverse=reverse*10+last;
				temp=temp/10;
			}
			if (reverse==number)
			{
					System.out.println("It is a palindrome number");
			}
			else
			{
		            System.out.println("It is not a palindrome number");
			}
	 }
}
