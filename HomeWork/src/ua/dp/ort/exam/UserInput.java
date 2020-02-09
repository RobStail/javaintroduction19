package ua.dp.ort.exam;

import java.util.Scanner;

public class UserInput {

	public static int input(Scanner scanner) {
		String inputUser = scanner.nextLine();

		return Integer.parseInt(inputUser);
	}

	public static char inputSymboleName(Scanner scanner) {
		String inputUser = scanner.nextLine();

		return inputUser.charAt(0);
	}
}
