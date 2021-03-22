package com.practicejava;

import org.testng.annotations.Test;

public class Test38 
{
	@Test
	public void multiplication()
	{
		int n=2234;
		int temp=n; 
		int count=0;                 //Output==>24,12,8,6
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		for(int i=1;i<=count;i++)
		{
			int multi=1;
			temp=n;
			for(int j=1;j<=count;j++)
			{
				int digit=temp%10;
				if(i!=j)
				{
					multi=multi*digit;
				}
				temp=temp/10;
			}
			System.out.print(multi+" ");
		}
		
	}
}


