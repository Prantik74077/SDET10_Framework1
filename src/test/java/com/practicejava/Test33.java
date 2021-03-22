package com.practicejava;

import org.testng.annotations.Test;

public class Test33 
{
    @Test
    public void sample()
    {
    	String s="welcome to tyss";   //output==>to welcome tyss
    	System.out.println(s);
    	
    	String[] s1 = s.split(" ");
    	int count=s1.length;
    	
    	if(count%2!=0)
    	{
    		count=count-1;
    	}
    	
    	for(int i=0;i<count;i++)    //or i<s1.length-1;
    	{
    		if(i%2==0)
    		{
    			String temp=s1[i];
    			s1[i]=s1[i+1];
    			s1[i+1]=temp;
    		}
    		
    	} 
    	for(int i=0;i<s1.length;i++)
    	{
    		System.out.print(s1[i]+" ");
    	}
    }
}  
