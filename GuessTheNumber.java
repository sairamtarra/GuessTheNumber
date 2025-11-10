package com.logicalstatements.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ran = r.nextInt(10);
		int chances = 3;
		System.out.println("*********Guess the number***********");

		while (chances > 0) {
			System.out.println("Enter your number:");
			int userGuess = sc.nextInt();
			if (userGuess == ran) {
				System.out.println("You Win");
				
				break;
			} else {
				chances--;
				if (chances == 2)
					System.out.println("You have 2 more Chances");
				else if (chances == 1)
					System.out.println("You have 1 chance left");
				else
					System.out.println("You Lost!");
			}
		}

		sc.close();

	}

}
