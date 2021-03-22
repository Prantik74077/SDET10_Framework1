package com.practicejava;

import org.testng.annotations.Test;

public class Test24 
{
	@Test
	public void totaladd()
	{
		String s="ABC123@$45xy67";
		int num=0;
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='0' && s.charAt(i)<='9'))
			{
				int n=s.charAt(i)-48;
				num=num*10+n;
			}
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		sum=sum+num;
		System.out.println(sum);	 
	}
}

