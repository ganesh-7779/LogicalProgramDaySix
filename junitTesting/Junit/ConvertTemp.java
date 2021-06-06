package Junit;
import java.util.Scanner;

import util.Temp;

public class ConvertTemp {
public static void main(String[] args) {
	//	Temperature t=new Temperature();
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter choice 1)Convert to degF 2)Convert to degC");
		choice=sc.nextInt();
		System.out.println("Enter temperature");
		double temp=sc.nextInt();
		sc.close();
		System.out.println(Temperture.tempConversion(choice,temp));

	}

}
