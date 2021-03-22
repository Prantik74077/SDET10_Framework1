package com.practicejava;

import org.testng.annotations.Test;

public class Test36 
{
	@Test
    public void replace()
    {
		String s1="india";           //output==>PndPa        
		System.out.println("input="+s1);
		char [] ch=s1.toCharArray();
		String out="";
		for (int i=0;i<ch.length ;i++)
		{
			while(i<ch.length)
			{
				if(ch[i]=='i')
				{
				out=out+(char)(ch[i]-25);
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

	
	@Test
    public void replace2()
    {
		String s1="india";           //output==>PndPa        
		System.out.println("input="+s1);
		String s2 = s1.replace('i','P');
		System.out.println("out="+s2);
     }
}