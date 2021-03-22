package com.practicejava;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Test19 
{
	@Test
	public void removeduplicate()
	{
    String s1="india";              //Remove duplicate characters in a given string
	char[] ch = s1.toCharArray();
	
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
	for(char c:ch)
	{
		set.add(c);
	}
	
	for(char d:set)
	{
		System.out.print(d);
	}
}
}
