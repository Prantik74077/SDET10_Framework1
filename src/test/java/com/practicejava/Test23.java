package com.practicejava;

import org.testng.annotations.Test;

public class Test23 
{
	@Test
	public void segregateandadd()
	{
		String s="abc@123";
		char [] ch=s.toCharArray();
		int sum=0;
		
		for (int i=0;i<ch.length;i++)
	    {
			if(ch[i]>=48 && ch[i]<=57)
            {
	           int num = ch[i]-48;
	           sum=sum+num;
            }
	    }
		System.out.println(sum);
	 }
}
	

