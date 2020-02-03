package ua.dp.ort.homework7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomeTasck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] userNumbers = new int[20];

		for (int counter = 0; counter < 20; counter++) {
			System.out.print("Please input " + (counter + 1) + " number  >");

			String userInput = scanner.nextLine();
			int userNumber = Integer.parseInt(userInput);
			userNumbers[counter] = userNumber;

		}
		scanner.close();

		int[] negativeNumbers = new int[20];
		int negativeCounter = 0;

		int[] positiveNumbers = new int[20];
		int positiveCounter = 0;

		for (int counter = 0; counter < userNumbers.length; counter++) {
			if (userNumbers[counter] < 0) {
				negativeNumbers[negativeCounter++] = userNumbers[counter];

			} else {
				positiveNumbers[positiveCounter++] = userNumbers[counter];
			}
		}
		System.out.println(Arrays.toString(negativeNumbers));
		System.out.println(Arrays.toString(positiveNumbers));
	}
}
