package ua.dp.ort.homework5;

import java.util.Scanner;

public class DrinkMachine {
	public static final int COFFEE = 1;
	public static final int SODA = 2;
	public static final int COCA_COLA = 3;
	public static final int PEPSI = 4;

	public static final int COFFEE_PRICE = 5;
	public static final int SODA_PRICE = 3;
	public static final int COCA_COLA_PRICE = 10;
	public static final int PEPSI_PRICE = 10;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String userInput;
		int result;
		int costChoice = 0;

		String coffee = "Coffee";
		String soda = "Soda";
		String coca = "Coca-Cola";
		String pepsi = "Pepsi";

		System.out.println("Drinks to choose from: ");
		System.out.println("1. Coffee: cost " + COFFEE_PRICE);
		System.out.println("2. Soda: cost " + SODA_PRICE);
		System.out.println("3. Coca-Cola: cost " + COCA_COLA_PRICE);
		System.out.println("4. Pepsi: cost " + PEPSI_PRICE);

		System.out.println("Input your money > ");
		userInput = scanner.nextLine();
		double userMoney = Double.parseDouble(userInput);

		if (userMoney >= 10) {
			System.out.println("Input product: \n 1. Coffee \n 2.Soda \n 3.Coca-Cola \n 4.Pepsi");
			userInput = scanner.nextLine();
			costChoice = Integer.parseInt(userInput);
		
		if (costChoice == COFFEE) {
			result = (int) (userMoney - COFFEE_PRICE);
			userInput = scanner.nextLine();
			System.out.println("Your choice coffee , your change: " + result);
		}
		if (costChoice == SODA) {
			result = (int) (userMoney - SODA_PRICE);
			System.out.println("Your choice soda , your change: " + result);
		}
		if (costChoice == COCA_COLA) {
			result = (int) (userMoney - COCA_COLA_PRICE);
			System.out.println("Your choice Coca-Cola , your change: " + result);
		}
		if (costChoice == PEPSI) {
			result = (int) (userMoney - PEPSI_PRICE);
			System.out.println("Your choice Pepsi , your change: " + result);
		}
		}
		else if (userMoney >= 5 && userMoney < 10) {
			System.out.println("Input product: \n 1. Cofe \n 2.Soda");
			userInput = scanner.nextLine();
			costChoice = Integer.parseInt(userInput);
		
		 if (costChoice == COFFEE) {
			result = (int) (userMoney - COFFEE_PRICE);
			System.out.println("Your choice coffee , your change: " + result);
		}
		if (costChoice == SODA) {
			result = (int) (userMoney - SODA_PRICE);
			System.out.println("Your choice soda , your change: " + result);
		}
		}
		else if (userMoney >= 3 && userMoney < 5) {
			System.out.println("Input product: \n 2.Soda");
			userInput = scanner.nextLine();
			costChoice = Integer.parseInt(userInput);
		
		if (costChoice == SODA) {
			result = (int) (userMoney - SODA_PRICE);
			System.out.println("Your choice soda , your change: " + result);
		}
	}
		else {
			System.out.println("I`m sorry, you don’t have enough money");
		}

		scanner.close();
	}

}
