package ua.dp.ort.homework6;

import java.util.Scanner;

public class GasStatione {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userŅonsumer;
		double volumeTank = 0;
		double milliliters = 0;
		double client = 0;

		while (true) {
			System.out.println("Input volume Tank :");
			userŅonsumer = scanner.nextLine();
			double uncheckedvolumeTank = Double.parseDouble(userŅonsumer);
			if (uncheckedvolumeTank < 1000) {
				System.out.println("Your input is not corect");
				continue;
			} else {
				volumeTank = uncheckedvolumeTank;
				break;
			}
		}

		while (true) {
			System.out.println("Input quantity uploads milliliters: ");

			userŅonsumer = scanner.nextLine();
			double uncheckedmilliliters = Double.parseDouble(userŅonsumer);
			if (uncheckedmilliliters <= 0) {
				System.out.println("Your input is not corect");
				break;
			}

			else {
				milliliters = uncheckedmilliliters;
				break;
			}
		}
		while (true) {
			System.out.println("Input desired volume amount of liters: ");
			userŅonsumer = scanner.nextLine();
			double uncheckedclient = Double.parseDouble(userŅonsumer);
			if (uncheckedclient <= 0) {
				System.out.println("Your input is not corect");
				break;
			} else {
				client = uncheckedclient * 1000;
				break;
			}
		}
		while (true) {

			System.out.println("Volume fuel left: " + (volumeTank - client) + " milliliters");
			System.out.println("Diesel fill dose: " + client / milliliters + " portion(s).");
			break;
		}

	}
}