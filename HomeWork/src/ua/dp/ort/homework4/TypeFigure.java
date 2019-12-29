package ua.dp.ort.homework4;

import java.util.Scanner;

public class TypeFigure {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input first number: ");
		String s = scanner.nextLine();
		System.out.println("Input second number: ");
		String d = scanner.nextLine();

		double length = Double.parseDouble(s);
		double height = Double.parseDouble(d);
String figure = "It`s a figure: "; 
		if (length == height) {
			figure = figure + "square!";
		}
		else if (length != height) {
			figure = figure + "rectangle!";
		}
		System.out.println(figure);
		scanner.close();
	}

}
