package com.practicejava;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Test20 
{
	@Test
	public void reverseduplicateword()
	{
	     String s="welcome to india welcome to mandya";
	     String[] s1 = s.split(" ");
	     
	     LinkedHashSet<String> set=new LinkedHashSet<String>();
	     for(int i=0;i<s1.length;i++)
	     {
	    	 set.add(s1[i]);
	     }
	     
	     for(String value:set)
	     {
	    	 System.out.print(value+" ");
	     }
	     
	}
}
