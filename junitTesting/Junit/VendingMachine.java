package Junit;

import java.util.Scanner;

public class VendingMachine {
	private static void countNotes(int amount) {
		int notes[] = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
		int noteFrequency[] = new int[9];
		
		for(int i=0; i<9; i++) {
			if(amount >= notes[i]) {
				noteFrequency[i] = amount/notes[i];
				amount = amount - noteFrequency[i] * notes[i];
				}
		   }
			System.out.println("Currency Count ");
			for(int i=0; i<9; i++) {
				if(noteFrequency[i] != 0) {
					System.out.println(notes[i]+"  : "+noteFrequency[i]);
					}
				}
			}
		

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the amount :");
			int amount = scanner.nextInt();
			
			countNotes(amount);
scanner.close();
		}

	}

