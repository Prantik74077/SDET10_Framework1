package com.practicejava;

public class Test28 
{
	 public static  void fiboseries(int count)
	 {
		int num1=0;
		System.out.println(num1);
		int num2=1;
		System.out.println(num2);
		while(count>2)
		{
		int num3=num1+num2;
		System.out.println(num3);
		num1=num2;
		num2=num3;
		count--;
		}
	 }
		public static void main(String[] args) 
		{
			fiboseries(15);
		}
	 }

