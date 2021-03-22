package com.practicejava;

import org.testng.annotations.Test;

public class Test26 
{
   @Test
   public void removespace()
   {
	   String s="welcome to india";
	   String[] s1 = s.split(" ");
	   
	   String rev="";
	   for(int i=0;i<s1.length;i++)
	   {
		   rev=rev+s1[i];
	   }
	   System.out.println(rev);	   
   }
}
