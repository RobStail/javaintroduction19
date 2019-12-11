package ua.dp.ort.homework4;

import java.util.Scanner;

public class SquareRectangle {

	public static void main(String[] args) {
//		1) Написать программу которая позволяет вычислить площадь прямоугольника.
//	   Программа должна позволять пользователю вводить значение сторон прямоугольника с клавиатуры.
//	   Результат вычислений должен выводиться в консоль.
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();

		double length = Double.parseDouble(a);
		double height = Double.parseDouble(b);

		double square = length * height;

		System.out.println("Площадь прямоугольника: " + square + " метров");

	}

}
