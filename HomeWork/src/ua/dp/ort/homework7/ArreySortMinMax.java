package ua.dp.ort.homework7;

import java.io.IOException;
import java.util.Scanner;

public class ArreySortMinMax {
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int[] userNumbers = new int[20];
		for (int counter = 0; counter < userNumbers.length; counter++) {
			System.out.print("Please input " + (counter + 1) + " number -> ");
			String input = scanner.nextLine();

			int userInput = Integer.parseInt(input);
			userNumbers[counter] = userInput;
		}
		scanner.close();
		int sort = userNumbers[0];

		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (sort = 0; sort < userNumbers.length - 1; sort++) {
				if (userNumbers[sort] > userNumbers[sort + 1]) {
					temp = userNumbers[sort];
					userNumbers[sort] = userNumbers[sort + 1];
					userNumbers[sort + 1] = temp;
					sorted = false;
				}
			}
		}

		int max = userNumbers[0];
		int maxA = 0;
		int min = userNumbers[0];
		int minA = userNumbers[0];

		for (int i = 1; i < userNumbers.length; i++) {
			if (userNumbers[i] > max) {
				max = userNumbers[i];
				maxA = i;
			}
			if (userNumbers[i] < min) {
				min = userNumbers[i];
				minA = i;
			}

		}
		userNumbers[minA] = max;
		userNumbers[maxA] = min;

		for (int i = 0; i < userNumbers.length; i++) {
			System.out.println("i = " + i + " userNumbers[" + i + "]=" + userNumbers[i]);
		}
	}

}
