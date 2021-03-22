package com.practicejava;

import org.testng.annotations.Test;

public class Test22 
{
	@Test
	public void segregate()
	{
		String s="123@XYZabc456$x42";
		char [] ch=s.toCharArray();
		
		String ualpha="";
		String lalpha="";
		String num="";
		String spl="";
		
		for (int i=0;i<ch.length;i++)
	    {
	    if (ch[i]>='A' && ch[i]<='Z')
		{
           ualpha=ualpha+ch[i]; 
		}
		else if (ch[i]>='a' && ch[i]<='z')
		{
			lalpha=lalpha+ch[i];
		}
		else if (ch[i]>=48 && ch[i]<=57)	
		{
           num=num+ch[i];
		}
		else
		{
			spl=spl+ch[i];
		}
		
	}
		System.out.println("Uppercasealphabets="+ualpha); 
        System.out.println("Lowercasealphabets="+lalpha);
		System.out.println("Numbers="+num); 
		System.out.println("Specialcharacters="+spl);
	}
}
