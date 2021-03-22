package com.practicejava;

import org.testng.annotations.Test;

public class Test1 
{
   @Test
   public void sortingAscendingorder()
   {
	   int ar[]= {10,50,30,20};
	   System.out.println("ar.length= "+ar.length);
	   
	   for(int i=0;i<ar.length;i++)
	   {
		   for(int j=i+1;j<ar.length;j++)
		   {
			   if(ar[i]>ar[j])  //Ascending
			   {
			   int temp=ar[i];
			   ar[i]=ar[j];
			   ar[j]=temp;
			   }	   
	       }
		   System.out.print(ar[i]+" ");
       }
	   System.out.println();
	   System.out.println("min="+ar[0]);
	   System.out.println("2nd min="+ar[1]);
	   System.out.println("max="+ar[ar.length-1]);
	   System.out.println("2nd max="+ar[ar.length-2]);
   }
}
