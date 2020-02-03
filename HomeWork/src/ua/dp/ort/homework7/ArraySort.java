package ua.dp.ort.homework7;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {

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
		int min = userNumbers[0];
		int min2 = userNumbers[1];
		for (sort = 0; sort < userNumbers.length; sort++) {

			if (min < userNumbers[0]) {
				min = userNumbers[0];
			}
			if(userNumbers[0] == min) {
				min2 = userNumbers[1];
			}
			System.out.print(userNumbers[sort] + " ");
			System.out.println("");
		}
		System.out.println("Min number: " + min);
		System.out.println("Second min number: " + min2);
	}
}

//+3) Ќайти два наименьших (минимальных) элемента массива
//4) ѕомен€ть местами минимальный и максимальный элементы
//5) ѕереставить элементы заданного массива в обратном пор€дке, то есть произвести реверс массива.
//6) –азложить положительные и отрицательные числа по разным массивам