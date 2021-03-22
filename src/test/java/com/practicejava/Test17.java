package com.practicejava;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Test17 
{
	 @Test
	 public void switchwords()
	 {
	     int ar[]= {1,3,5,4,6,2,1,4};   //output ==>  when addition 7 comes then for an example print (4,3) but not duplicate
	     
	     HashSet<Integer> set=new HashSet<Integer>();
	     
	     for(int i=0;i<ar.length;i++)  //remove duplicate from given array
	     {
	    	 set.add(ar[i]);
	     }
	     
	     int ar1[]=new int[set.size()];
	     
	     int count=0;
	     for(Integer value:set)
	     {
	    	 ar1[count]=value;
	    	 count++;
	     }
	     
	     for(int i=0;i<ar1.length-1;i++)
	     {
	        for(int j=i+1;j<ar1.length;j++)
	        {
	            if((ar1[i]+ar[j])==7)
	            {
	        	    System.out.println(ar1[i]+" "+ar[j]);
	        	}
	        }
	        	 
	     }
	 }
}
