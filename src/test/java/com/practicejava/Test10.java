package com.practicejava;

import org.testng.annotations.Test;

public class Test10 
{
	@Test
	   public void reverse1()
	   {
		   String s="india"; 
		   System.out.println(s);
		   
		   String s1="";
		   int length = s.compareTo(s1);
		   System.out.println(length);
		   
		   int length2 = s1.compareTo(s);   //"null in s1"-(total no  of characters in s)  ==>-7
		   System.out.println(length2);
		   
		   String s2="xyz";
		   System.out.println(s.compareTo(s2));
		   
		   String s3="i";
		   System.out.println(s.compareTo(s3));
		   
		   String s4="a";
		   System.out.println(s.compareTo(s4));
		  
		   System.out.println(s3.compareTo(s));
		   
		       
}
}