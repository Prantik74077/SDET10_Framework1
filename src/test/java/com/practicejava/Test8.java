package com.practicejava;

import org.testng.annotations.Test;

public class Test8     //with storing
{
	@Test
	   public void reverse1()
	   {
		   String s="Reverse";
		   System.out.println(s);
		   String rev="";
		   for(int i=s.length()-1;i>=0;i--)
		   {
			   rev=rev+s.charAt(i);
		   }
		   System.out.print(rev);
		   System.out.println();
}
}
