package ua.dp.ort.homework4;

import java.util.Scanner;

public class SquareRectangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();

		double length = Double.parseDouble(a);
		double height = Double.parseDouble(b);

		double square = length * height;

		System.out.println("Rectangle area: " + square + " meters");

	}

}
