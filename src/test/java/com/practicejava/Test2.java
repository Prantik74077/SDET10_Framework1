package com.practicejava;

import org.testng.annotations.Test;

public class Test2 
{
	@Test
    public void sortinginDescendingorder()
	{
		   int ar[]= {10,50,30,20};
		   System.out.println("ar.length= "+ar.length);
		   for(int i=0;i<ar.length;i++)
		   {
			   for(int j=i+1;j<ar.length;j++)
			   {
				   if(ar[i]<ar[j])   //Descending
				   {
				   int temp=ar[i];
				   ar[i]=ar[j];
				   ar[j]=temp;
				   }	   
		       }
			   System.out.print(ar[i]+" ");	   
	       }
		   System.out.println();
		   System.out.println("max="+ar[0]);
		   System.out.println("2nd max="+ar[1]);
		   System.out.println("min="+ar[ar.length-1]);
		   System.out.println("2nd min="+ar[ar.length-2]);
	   }
}
