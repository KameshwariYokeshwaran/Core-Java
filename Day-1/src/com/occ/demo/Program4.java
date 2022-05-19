package com.occ.demo;

import java.util.Scanner;

public class Program4{
	
	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1=scn.nextInt();
		
		System.out.println(Sevenocc.countseven(num1));
		
	}
	

}
