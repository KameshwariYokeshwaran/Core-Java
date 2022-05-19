package com.oddnum.sum;

import java.util.Scanner;

public class Programodd {
	
	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		int a=Odd.checkSum(num);
		if(a==1)
		{
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}
		
	}
	

}
