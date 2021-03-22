package com.practicejava;

import org.testng.annotations.Test;

public class Test4 
{
	@Test
	   public void sum()
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
		   int sum=0;
		   for(int i=0;i<3;i++)   //or i<=2
		   {
			   sum=sum+ar[i];
		   }
		   System.out.println();
		   System.out.println("sum of first three min no="+sum);
	   }
	}