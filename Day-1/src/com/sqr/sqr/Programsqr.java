package com.sqr.sqr;

public class Programsqr {
	static int sumOfSquares(int num)
	{
		
		int square=0;
		while(num>0)
		{
			int t=num%10;
			if(num%2==0)
			{
				square= square+t*t;
			}
		num=num/10;
		}
		return square;
	}
}
