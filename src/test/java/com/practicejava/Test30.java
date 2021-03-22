package com.practicejava;

import org.testng.annotations.Test;

public class Test30 
{
	@Test
	public void uppercaseonlystartingletter()
	{
		String s="welcome to india";
		System.out.println("s="+s);
		
		String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String s2 = s1[i].substring(0,1).toUpperCase()+s1[i].substring(1);
			
			System.out.print(s2+" ");
		}
		System.out.println();
	}
}
