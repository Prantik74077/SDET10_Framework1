package com.practicejava;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Test14 
{
    @Test
    public void occurance()
    {
    	String s1="welcome to ty";
		System.out.println("input="+s1);
		
		int count1=0;
		char [] ch=s1.toCharArray();
		int n=ch.length;
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();   //get only unique characters
		
		for (int i=0;i<n;i++)
	    {
			set.add(ch[i]);
	    }
		for(char c:set)
		{
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(c==ch[i])
				{
					count++;
				}
			}
			
			//System.out.println(c+" "+count);  //occurance
			
			/*if(count>1)
			{
				System.out.println(c+" "+count);  // chracter which is repeatating 
			}*/
			
			
			if(count>1)
			{
				count1++;
			}
			
		}
		System.out.println("total no of duplicate characters="+count1); // total no of characters repeatating
    }
}