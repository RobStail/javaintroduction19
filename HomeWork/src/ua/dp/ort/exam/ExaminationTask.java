package ua.dp.ort.exam;

import java.util.Scanner;

public class ExaminationTask {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input symbol please > ");
		char figureSymbol = UserInput.inputSymboleName(scanner);

		System.out.println("Input length figure please > ");
		int lengthFigure = UserInput.input(scanner);

		System.out.println("Input width figure please > ");
		int widthFigure = UserInput.input(scanner);

		char[][] figurArr = new char[lengthFigure][widthFigure];

		for (int i = 0; i < figurArr.length; i++) {
			for (int j = 0; j < figurArr[i].length; j++) {
				figurArr[i][j] = figureSymbol;

				System.out.print(" " + figurArr[i][j]);
			}
			System.out.println();
		}
	}

}
