package com.SS.daytwo;

import java.util.Scanner;

/**
 * @author louis
 *
 */
class Main {
	public static Double UserInput(String message) {
		Scanner inputScanner = new Scanner(System.in);
		Double input = null;

		do {
			
			System.out.println(message);
			String inputString = inputScanner.nextLine();
			try {
				input = Double.parseDouble(inputString);
			} catch (NumberFormatException e) {
				System.out.println("Please Try again: ");
			}
		} while (input == null); 
		return input;
	}

	public static void main(String[] args) {
		Double num1 = UserInput("Fist Number:");
		Double num2 = UserInput("Second Number:");
		Double num3 = UserInput("Third Number:");
		Double num4 = UserInput("Fourth Number:");
		Double num5 = UserInput("Fifth Number:");

		System.out.println("Total: " + (num1 + num2 + num3 + num4 + num5));
	}

}
