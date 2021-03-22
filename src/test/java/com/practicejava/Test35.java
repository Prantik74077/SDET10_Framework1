package com.practicejava;

import org.testng.annotations.Test;

public class Test35 
{
	@Test
    public void alernatecapital()
    {
		String s1="india";        //output==>InDiA          
		System.out.println("input="+s1);
		char [] ch=s1.toCharArray();
		String out="";
		for (int i=0;i<ch.length ;i++)
		{
			while(i<ch.length)
			{	
				if(i%2==0)
				{
				out=out+(char)(ch[i]-32);
				}
				else
				{
				out=out+ch[i];
				}
				i++;
			}
		}
		System.out.println("out="+out);
    }
}
