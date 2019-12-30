package ua.dp.ort.homework4;

import java.util.Scanner;

public class NumberAnalyzer {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input first number: ");
		String namber1 = scanner.nextLine();
		System.out.println("Input second number: ");
		String namber2 = scanner.nextLine();

		int a = Integer.parseInt(namber1);
		int b = Integer.parseInt(namber2);

		if (a == b) {
			System.out.println("a = b");
		}
		if (a != b) {
			System.out.println("a != b");
		}
		if (a >= b) {
			System.out.println("a >= b");
		}
		if (a > b) {
			System.out.println("a > b");
		}

		if (a <= b) {
			System.out.println("a <= b");
		}

		if (a < b) {
			System.out.println("a < b");
		}
	}
}
