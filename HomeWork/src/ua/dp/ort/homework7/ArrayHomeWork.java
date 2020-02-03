package ua.dp.ort.homework7;

import java.util.Scanner;

public class ArrayHomeWork {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] userInputNumbers = new int[20];
		for (int counter = 0; counter < 20; counter++) {
			System.out.print("Please input " + (counter + 1) + " number -> ");
			String input = scanner.nextLine();

			int userInput = Integer.parseInt(input);
			userInputNumbers[counter] = userInput;
		}
		scanner.close();

		int sum = 0;
		int positiveNumber = 0;
		int result = 0;

		for (int counter = 0; counter < userInputNumbers.length; counter++) {
			if (userInputNumbers[counter] % 2 == 0 && userInputNumbers[counter] >= 0) {
				sum += userInputNumbers[counter];
				positiveNumber++;
			}

		}
		System.out.println("");
		System.out.println("Sum positive even elements: " + sum);
		System.out.println("Arithmetic mean of positive array elements: " + sum / positiveNumber);

	}

}
//+1) В массиве, содержащем положительные и отрицательные целые числа, вычислить сумму четных положительных элементов.
//+2) Найти среднее арифметическое положительных элементов массива