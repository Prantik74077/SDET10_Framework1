package com.practicejava;

import org.testng.annotations.Test;

public class Test41 
{
   @Test
   public void printnumberandsevennwords()
   {
	   int n=1;
	   while(n<=11)
	   {
		   if(n==5)
		   {
			   System.out.println("five");
		   }
		   else if(n==7)
		   {
			   System.out.println("seven");
		   }
		   else
		   {
			   System.out.println(n);
		   }
		       n++;
	   }
   }
}
