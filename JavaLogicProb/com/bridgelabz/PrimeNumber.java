package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	 System.out.println("Enter A Number");
	 Scanner scanner = new Scanner(System.in);
	 int Number = scanner.nextInt();
	 
	 getPrimeNumber(Number);
	 scanner.close();
	}

	private static void getPrimeNumber(int Number) {
		
		int temp=0;
		
		for (int i=2; i<=Number-1;i++) {
			
		 if (Number%i==0)
	 {
	temp=temp+1;
	 
	}
		}
	 if(temp>0) {
		 System.out.println("It Is Not Prime Number");
	 }
	 else {
		 System.out.println("It Is Prime Number");

	 }

}
	}
