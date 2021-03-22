package com.practicejava;

import org.testng.annotations.Test;

public class Test13 
{
	@Test
	public void reversethewordsinagivenString()
	{
		String s="My name is Prantik";
		System.out.println(s.trim());
		String rev="";
	    String[] s1 = s.split(" ");
	    System.out.println(s1.length);
	    
	    for(int i=s1.length-1;i>=0;i--)
	    {
	    	rev=rev+" "+s1[i];
	    }
	    System.out.println(rev);
	    
    }
}