package com.practicejava;

import org.testng.annotations.Test;

public class Test37 
{
	    @Test
	    public void additionafterparseInt()
	    {
			String s1="123";
			String s2="100";    //output==>223
	        int num1 = Integer.parseInt(s1);
	        int num2 = Integer.parseInt(s2);
	        System.out.println("addition="+(num1+num2));
	    }
    }
