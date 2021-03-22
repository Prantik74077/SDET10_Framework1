package com.practicejava;

import org.testng.annotations.Test;

public class Test7 
{
   @Test
   public void reverse1()    //without storing
   {
	   String s="Reverse"; 
	   System.out.println(s);
	   System.out.println("length of given string="+s.length());
	   //System.out.println(s.charAt(0));
	   //char[] ch = s.toCharArray();
	   //System.out.println(ch[0]);
	   
	   /*for(int i=0;i<s.length();i++)
	   {
		   System.out.println(s.charAt(i));
	   }*/
	   
	   for(int i=s.length()-1;i>=0;i--)
	   {
		   System.out.print(s.charAt(i));
		   //System.out.println(s.charAt(i));
	   }
	   System.out.println();
   }
}
