package com.practicejava;

import org.testng.annotations.Test;

public class Test16 
{
	@Test(priority=1)
    public void switchwords()
    {
   	 String s="welcome to tyss";
   	 String[] s1 = s.split(" ");
   	 
   	 for(int i=0;i<s1.length;i++)
   	 {
   		String temp=s1[0];
   		s1[0]=s1[s1.length-1];
   		s1[s1.length-1]=temp;
     }
   	 
   	 for(int i=0;i<s1.length;i++)
   	 {
   		 System.out.print(s1[i]+" ");
   	 }
   	 
   	System.out.println();
   	System.out.println("=======||===========");
    }
	
	@Test(priority=2)
    public void switchingwords()
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
			 temp=temp+ch[i];
			 i++;
         }
		 out=temp+" "+out;
		}
        System.out.println("Output String is =" +out);
        System.out.println("=========||=========");
   	 }
 }
  
	

