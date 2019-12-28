package ua.dp.ort.homework5;

import java.util.Scanner;

public class DrinkMachine {
	public static final int COFE = 1;
	public static final int SODA = 2;
	public static final int COCA_COLA = 3;
	public static final int PEPSI = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String userInput;
		int result;

		int costCofe = 5;
		int costSoda = 3;
		int costCoca = 10;
		int costPepsi = 10;

		String cofe = "Cofe";
		String soda = "Soda";
		String coca = "Coca-Cola";
		String pepsi = "Pepsi";

		System.out.println("Drinks to choose from: ");
		System.out.println("1. Cofe: cost 5");
		System.out.println("2. Soda: cost 3");
		System.out.println("3. Coca-Cola: cost 10");
		System.out.println("4. Pepsi: cost 10");

		System.out.println("Input your money > ");
		userInput = scanner.nextLine();
		double userMoney = Double.parseDouble(userInput);

		if (userMoney >= 10) {
			System.out.println("Input product: \n 1. Cofe \n 2.Soda \n 3.Coca-Cola \n 4.Pepsi");
			userInput = scanner.nextLine();
			int costChoice = Integer.parseInt(userInput);

			if (costChoice == COFE) {
				result = (int) (userMoney - costCofe);
				System.out.println("Your choice cofe , your change: " + result);
			}
			if (costChoice == SODA) {
				result = (int) (userMoney - costSoda);
				System.out.println("Your choice soda , your change: " + result);
			}
			if (costChoice == COCA_COLA) {
				result = (int) (userMoney - costCoca);
				System.out.println("Your choice Coca-Cola , your change: " + result);
			}
			if (costChoice == PEPSI) {
				result = (int) (userMoney - costPepsi);
				System.out.println("Your choice Pepsi , your change: " + result);
			}

		}
		if (userMoney >= 5 && userMoney < 10) {
			System.out.println("Input product: \n 1. Cofe \n 2.Soda");
			userInput = scanner.nextLine();
			int costChoice = Integer.parseInt(userInput);

			if (costChoice == COFE) {
				result = (int) (userMoney - costCofe);
				System.out.println("Your choice cofe , your change: " + result);
			}
			if (costChoice == SODA) {
				result = (int) (userMoney - costSoda);
				System.out.println("Your choice soda , your change: " + result);
			}

		}
		if (userMoney >= 3 && userMoney < 5) {
			System.out.println("Input product: \n 2.Soda");
			userInput = scanner.nextLine();
			int costChoice = Integer.parseInt(userInput);

			if (costChoice == SODA) {
				result = (int) (userMoney - costSoda);
				System.out.println("Your choice soda , your change: " + result);
			}

		}
		if (userMoney < 3) {
			System.out.println("I`m sorry, you don’t have enough money" );
		}

		scanner.close();
	}

}

