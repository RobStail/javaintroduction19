package ua.dp.ort.homework4;

public class Arithmetic {

	public static void main(String[] args) {
//		1) ���� 2 ����� 

	// �����
		int a = 5;
		int b = 10;
		
		int c = a + b;
		System.out.println(c);
	
	// ��������
		int d = b - a;
		int d1 = a - b;
		
		System.out.println(d);
		System.out.println(d1);

	// ������������
		int i = a * b;
		System.out.println(i);
	
	// �������
		float g0 = (float) a / b;
		int g1 = b / a;
		System.out.println(g0);
		System.out.println(g1);
		
		
	//	2) �������� ����� 5 � ������� 5, � ������� 

		double number = 5; 
		System.out.println(number * number * number* number *number);
		System.out.println(Math.pow(number, number));
		
	//	3) ���� ������� y = 2x + 5;
		 
		int x = 2;
		int y1 = (2 * x) + 5;
		System.out.println(y1);
		
		double x1 = 9.5;
		double y2 = (2 * x) + 5;
		System.out.println(y2);
		
	//	4) ���� ������� ��������������
		double x5 = 4.5;
		double y5 = 3.1;
		
		double rectangle = x5 * y5;
		System.out.println("������� ��������������: " + rectangle + " ������ ���������.");
		
		
	//	5) ���� 11 �����, ��� ������ ������� 3� ����� ��� ����� ���� ��������� ���������� ���������� ����� �����.
		int apple = 11;
		int children = 3;
    int quantity = apple / children;
    int balance = apple % children;
    System.out.println("������ ������� ������� ��: " + Math.round(quantity) + " ������!");
    System.out.println("� ���������: " + balance + " ������!");
	}

}
