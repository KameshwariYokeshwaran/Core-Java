package com.sqr.sqr;

import java.util.Scanner;
	public class Sqr {
	private static String n;

	public static void main(String[] args)
	{
		Scanner Scn =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=Scn.nextInt();
		int a=Programsqr.sumOfSquares(num);
		System.out.println("Sum of square of Even number is :"+a);
	}

}
