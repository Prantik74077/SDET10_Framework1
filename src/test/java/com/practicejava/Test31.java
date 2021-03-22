package com.practicejava;

import org.testng.annotations.Test;

public class Test31 
{
    @Test
    public void lowertoupper()
    {
    	String s="Indiaindia";          //expected ==>IndIaIndIa
		System.out.println("s="+s);
		char [] ch=s.toCharArray();
		String out="";
		for (int j=0;j<ch.length ;j++ )
		{
			if(ch[j]=='i')
			{
			out=out+(char)(ch[j]-32);
			}
			else
			{
				out=out+ch[j];
			}		
		}
		System.out.print("out="+out);
		System.out.println();
    }
    
    
    @Test
    public void lowertoupperr()
    {
    	String s="Indiaindia";          //expected ==>IndIaIndIa
		String res="";
		for (int j=0;j<s.length() ;j++ )
		{
			if(s.charAt(j)=='i')
			{
			    //String s1=s.charAt(j)+"";
			    //res=res+s1.toUpperCase();
				char ch=(char)(s.charAt(j)-32);
				res=res+ch;
			}
			else
			{
				res=res+s.charAt(j);
			}		
		}
		System.out.print("res="+res);
		System.out.println();
    }
    
}
