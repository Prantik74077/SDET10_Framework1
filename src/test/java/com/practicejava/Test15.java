package com.practicejava;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Test15 
{
	 @Test
	    public void occurance()
	    {
	    	String s1="welcome to ty welcome to bangalore";
			System.out.println("input="+s1);
			
			int count1=0;
			String[] s2 = s1.split(" ");
			
			LinkedHashSet<String> set=new LinkedHashSet<String>();   //get only unique characters
			
			for (int i=0;i<s2.length;i++)
		    {
				set.add(s2[i]);
		    }
			for(String str:set)
			{
				int count=0;
				for(int i=0;i<s2.length;i++)
				{
					if(str.equals(s2[i]))
					{
						count++;
					}
				}
				
				//System.out.println(str+" "+count);  //occurance
				
				/*if(count>1)
				{
					System.out.println(str+" "+count);  // words which is repeatating 
				}*/
				
				
				if(count>1)
				{
					count1++;
				}
				
			}
			System.out.println("total no of duplicate words="+count1);
	    }
	}

