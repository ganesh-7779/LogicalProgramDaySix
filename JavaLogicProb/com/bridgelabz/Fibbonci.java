package com.bridgelabz;

import java.util.Scanner;

public class Fibbonci {

	public static void main(String[] args) {
		
	System.out.println("Enter number to get fibbonci series");

	Scanner scanner = new Scanner (System.in);
	int fibbonciNum=scanner.nextInt();
		
		fibbonciSeries(fibbonciNum);
		scanner.close();

	}
	private static void fibbonciSeries(int fibbonciNum) {
	
		int Num1=0;
		int Num2=1;
		int sum=0;
		
		for (int i=0; i<fibbonciNum;i++) {
			sum=Num1+Num2;
			Num1=Num2;
			Num2=sum;
			System.out.println(sum+" ");
		}
		
	}
}