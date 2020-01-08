package ua.dp.ort.homework6;

import java.util.Scanner;

public class GasStation {

	public static final int MINVOLUME = 1000;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String dataInput;
		double volumeTank = 0;
		double milliliters = 0;
		double client = 0;

		while (true) {
			System.out.println("Input volume Tank :");
			dataInput = scanner.nextLine();
			double uncheckedvolumeTank = Double.parseDouble(dataInput);
			if (uncheckedvolumeTank < MINVOLUME) {
				System.out.println("Your input is not corect");
				continue;
			} else {
				volumeTank = uncheckedvolumeTank;
				break;
			}
		}

		while (true) {
			System.out.println("Input quantity uploads milliliters: ");
			dataInput = scanner.nextLine();
			double uncheckedmilliliters = Double.parseDouble(dataInput);
			if (uncheckedmilliliters <= 0) {
				System.out.println("Your input is not corect");
				continue;
			} else {
				milliliters = uncheckedmilliliters;
				break;
			}
		}

		while (true) {
			System.out.println("Input desired volume amount of liters: ");
			dataInput = scanner.nextLine();
			double uncheckedclient = Double.parseDouble(dataInput);
			if (uncheckedclient <= 0) {
				System.out.println("Your input is not corect");
				continue;
			} else {
				client = uncheckedclient;
				break;
			}
		}

		System.out.println("Volume fuel left: " + (volumeTank - client) + " milliliters");
		System.out.println("Diesel fill dose: " + client * 1000 / milliliters + " portion(s).");

		scanner.close();

	}
}