package com.practicejava;

import org.testng.annotations.Test;

public class Test21 
{
	@Test
	public void reverseduplicateword()
	{
		String s="123";
		int sum=0;
		int num = Integer.parseInt(s);
		while(num!=0)    //(num>0)==>same
		{
			int n=num%10;
			sum=sum+n;
			num=num/10;	
		}
		System.out.println(sum);
	}
}

