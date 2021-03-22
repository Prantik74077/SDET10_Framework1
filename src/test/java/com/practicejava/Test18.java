package com.practicejava;

import org.testng.annotations.Test;

public class Test18 
{
     @Test
     public void keyvalues()
     {
    	 int ar[]= {10,20,30,40,50};
    	 int key=1;
    	 for(int i=0;i<key;i++)
    	 {
    		 for(int j=0;j<ar.length-1;j++)
    		 {
    			 int temp=ar[j];
    			 ar[j]=ar[j+1];
    			 ar[j+1]=temp;	 
    		 }	 
    	 }
    	 for (int i = 0; i<ar.length; i++) 
    	 {
    		 System.out.print(ar[i]+" ");
		 }	 
     }
}

