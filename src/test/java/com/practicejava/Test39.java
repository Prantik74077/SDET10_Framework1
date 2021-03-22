package com.practicejava;

import org.testng.annotations.Test;

public class Test39 
{
	@Test
	public void array()    //output  ==>{2,4,6,4,5}
	{
	    int []a= {1,2,3};
	    int []b= {1,2,3,4,5};
	    
	    if (a.length >=b.length)
	    {
	        int[] c = new int[a.length];

	        for(int i=0; i<c.length; i++)
	        {
	        	 if (i < b.length)
	        	 {
	                 c[i] = a[i] + b[i];
	        	 }
	             else
	             {
	                 c[i] = a[i];
	             }
	            System.out.print(c[i]+" ");
	        }
	    }
	    else
	    {
	        int[]c = new int[b.length];

	        for(int i=0; i<c.length; i++)
	        {
	        	 if (i < a.length)
	        	 {
	                 c[i] = a[i] + b[i];
	        	 }
	             else
	             {
	                 c[i] = b[i];
	             } 
	            System.out.print(c[i]+" ");
	        }  
	    }
	}
}
