package com.practicejava;

import org.testng.annotations.Test;

public class Test12 
{
	@Test
	   public void reversethewordsinagivenString()
	   {
		String s="My name is Prantik";
	    String[] s1 = s.split(" ");
	    System.out.println(s1.length);
	    
	    for(int i=s1.length-1;i>=0;i--)
	    {
	    	System.out.print(s1[i]+" ");
	    }
	    
	   }
}
