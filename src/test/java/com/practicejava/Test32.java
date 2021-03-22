package com.practicejava;

import org.testng.annotations.Test;

public class Test32 
{
    @Test
    public void reverseonlywords()
    {
    	String s1="welcome to tyss";
    	
		System.out.println("Input String is  =" +s1);
		char [] ch=s1.toCharArray();
		String out="";
		for (int i=0;i<ch.length;i++)
		{
		 String temp="";
         while (i<ch.length && ch[i]!=' ')
         {
			 temp=ch[i]+temp;
			 i++;
         }
		 out=out+temp+" ";
		}
        System.out.println("Output String is =" +out);
    }
    
    @Test
    public void reverseonlywordss()
    {
    	String s="welcome to tyss";
    	String[] str = s.split(" ");
		
		for (int i=0;i<str.length;i++)
		{
         String s1=str[i];
         String rev="";
         /*for(int j=s1.length()-1;j>=0;j--)
         {
        	 rev=rev+s1.charAt(j);  ==>both same
         }*/
         for(int j=0;j<s1.length();j++)
         {
        	 rev=s1.charAt(j)+rev;
         }
         System.out.print(rev+" ");
		}   
		System.out.println();
    }
}
