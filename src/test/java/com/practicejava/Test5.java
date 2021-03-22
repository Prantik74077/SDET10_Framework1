package com.practicejava;

import org.testng.annotations.Test;

public class Test5    //Addition of two arrays
{
	@Test
	public void sum()
	{
    int ar1 []= {3,5,7};
    int ar2 []= {4,6,8};
    int sum []=new int[ar1.length];
    
    for(int i=0;i<ar1.length;i++)
    {
    	sum[i]=ar1[i]+ar2[i];
    	
    }
    for(int i=0;i<ar1.length;i++)
    {
    	System.out.print(sum[i]+" ");
    }
    
} 
}