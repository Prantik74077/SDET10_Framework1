package com.practicejava;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Test40 
{
      @	Test
      public void printoddandprintseventeeninwords()
      {
    	  int [] ar= {11,12,13,14,15,16,17,18,19,20};
    	  ArrayList<Integer> list=new ArrayList<Integer>();
    	  for(int i=0;i<ar.length;i++)
    	  {
    		    list.add(ar[i]);
    		
    		    if(list.get(i)==17)
    		    {
    			  System.out.println("seventeen");
    		    }
    		    else if(list.get(i)%2!=0)
    		    {
    			  System.out.println(list.get(i));
    		    }
    	  }
    	          System.out.println("======||=======");
      }
    	  
      @Test
      public void printoddnumber()
      {
    	  int n=1;
   	   while(n<=15)
   	   {
   		   if(n==7)
   		   {
   			   System.out.println("seven");
   		   }
   		   else if(n%2!=0)
   		   {
   			   System.out.println(n);
   		   }
   		        n++;  
   		}
   		      
      }
  }

