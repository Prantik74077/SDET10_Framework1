package com.practicejava;

import org.testng.annotations.Test;

public class Test9 
{
	@Test
	   public void reverse1()
	   {
		   String s="Reverse"; 
		   System.out.println(s);
		   System.out.println("length of given string="+s.length());
		   char[] ch = s.toCharArray();
		   
		   String rev="";
		   for(int i=0;i<ch.length;i++)
		   {
			   rev=ch[i]+rev;
			   
		   }
		   System.out.println(rev);
		  
		   System.out.println();
		   
		   /*for(int i=ch.length-1;i>0;i--).
		   {
			   rev=rev+ch[i];
			   
		   }
		   System.out.print(rev);*/
}
}
