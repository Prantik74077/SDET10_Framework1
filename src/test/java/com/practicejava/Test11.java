package com.practicejava;

import org.testng.annotations.Test;

public class Test11 
{
	@Test
	   public void split()
	   {
		    String s="Reverse";
		    String[] s1 = s.split("e");
		    
		    for(String ob:s1)
		    {
		    	System.out.println(ob);
		    }
		    
		    String s2="My name is Prantik";
		    String[] s3 = s2.split(" ");
		    
		    for(String ob:s3)
		    {
		    	System.out.println(ob);
		    }
		    
		    for(int i=0;i<s3.length;i++)
		    {
		    	
		    }
	   }

}
