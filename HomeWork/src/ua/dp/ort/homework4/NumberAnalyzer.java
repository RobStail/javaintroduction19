package ua.dp.ort.homework4;

import java.util.Scanner;

public class NumberAnalyzer {

	public static void main(String[] args) {
//		2) �������� ��������� - ���������� �����.
//	   ��������� ������ ��������� ������������ ������� ��� �����.
//	   � �������� � ������� ���������� � ������, ����:
//	   - ����� � ����� ����� �?
//	   - ����� � �� ����� ����� �?
//	   - ����� � ������ �?
//	   - ����� � ������ ��� ����� �?
//	   - ����� � ������ �?
//	   - ����� � ������ ��� ����� �?

		Scanner scanner = new Scanner(System.in);
		String namber1 = scanner.nextLine();
		String namber2 = scanner.nextLine();

		int a = Integer.parseInt(namber1);
		int b = Integer.parseInt(namber2);

		if (a == b) {
			System.out.println("a = b");
		}
		if (a != b) {
			System.out.println("a != b");
			if (a >= b) {
				System.out.println("a >= b");
				if (a > b) {
					System.out.println("a > b");
				}

			}
			if (a <= b) {
				System.out.println("a <= b");

				if (a < b) {
					System.out.println("a < b");
				}
			}
		}
	}
}