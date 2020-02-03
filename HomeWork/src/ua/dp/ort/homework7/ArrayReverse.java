package ua.dp.ort.homework7;

import java.io.IOException;
import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int[] userNumbers = new int[5];
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
		for (int c = 0; c < userNumbers.length; c++) {
			System.out.print(userNumbers[c] + " ");
			

		} 
		System.out.println("");
		
		int i = 0;
		int j = userNumbers.length - 1;
		int tmp;
		while (j > i) {
			tmp = userNumbers[j];
			userNumbers[j] = userNumbers[i];
			userNumbers[i] = tmp;
			j--;
			i++;
		}

		for (int k = 0; k < userNumbers.length; k++) {
			System.out.print(userNumbers[k] + " ");
		}
	}
}