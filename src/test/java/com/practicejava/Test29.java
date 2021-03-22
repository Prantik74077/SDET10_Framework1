package com.practicejava;

public class Test29 
{
	public static void factorial(int num)
	{
		int out=1;
		for (int i=num;i>=1 ;i--)
		{
		out=out*i;
		}
		System.out.println("factorial is="+out);
	}
	public static void main(String[] args) 
	{
		factorial(5);
	}
}
