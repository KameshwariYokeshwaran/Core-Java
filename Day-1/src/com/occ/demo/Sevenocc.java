package com.occ.demo;

public class Sevenocc{
	public static int countseven(int number)
	{
		int num=7, sum=0;
		
		while(number>0)
		{
			int n1=number%10;
			if(n1==num) 
			{
				sum++;
				number=number/10;
			}
			else
			{
				number=number/10;
			}
		}
	
	return sum;
	} 
	
	
	
	
}