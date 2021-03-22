package com.practicejava;

import org.testng.annotations.Test;

public class Test25 
{
    @Test
    public void listlengthfwords()
    {
    	String s="welcome to india";
    	String[] s1 = s.split(" ");
    	String var=s1[0];
    	int count = s1[0].length();
    	
    	for(int i=1;i<s1.length;i++)
    	{
    		if(s1[i].length()<var.length())    //if I want to take the max length word then change the sign to >
    		{
    			count=s1[i].length();
    			var=s1[i];
    		}
    	}
    	System.out.println(var);
    	System.out.println(count);
    }
}
