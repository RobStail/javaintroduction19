package ua.dp.ort.homework4;

import java.util.Scanner;

public class SquareRectangle {

	public static void main(String[] args) {
//		1) �������� ��������� ������� ��������� ��������� ������� ��������������.
//	   ��������� ������ ��������� ������������ ������� �������� ������ �������������� � ����������.
//	   ��������� ���������� ������ ���������� � �������.
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();

		int length = Integer.parseInt(a);
		int height = Integer.parseInt(b);

		int square = length * height;
		
	
			System.out.println("������� ��������������: " + square + " ������");
			
	}

}
