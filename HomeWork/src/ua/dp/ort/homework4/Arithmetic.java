package ua.dp.ort.homework4;

public class Arithmetic {

	public static void main(String[] args) {
//		1) Дано 2 числа 

	// сумму
		int a = 5;
		int b = 10;
		
		int c = a + b;
		System.out.println(c);
	
	// разность
		int d = b - a;
		int d1 = a - b;
		
		System.out.println(d);
		System.out.println(d1);

	// произведение
		int i = a * b;
		System.out.println(i);
	
	// частное
		float g0 = (float) a / b;
		int g1 = b / a;
		System.out.println(g0);
		System.out.println(g1);
		
		
	//	2) Возвести число 5 в степень 5, с помощью 

		double number = 5; 
		System.out.println(number * number * number* number *number);
		System.out.println(Math.pow(number, number));
		
	//	3) Дана функция y = 2x + 5;
		 
		int x = 2;
		int y1 = (2 * x) + 5;
		System.out.println(y1);
		
		double x1 = 9.5;
		double y2 = (2 * x) + 5;
		System.out.println(y2);
		
	//	4) Даны стороны прямоугольника
		double x5 = 4.5;
		double y5 = 3.1;
		
		double rectangle = x5 * y5;
		System.out.println("Площадь прямоугольника: " + rectangle + " метров квадатных.");
		
		
	//	5) Есть 11 яблок, эти яблоки раздали 3м детям так чтобы всем досталось одинаковое количество целых яблок.
		int apple = 11;
		int children = 3;
    int quantity = apple / children;
    int balance = apple % children;
    System.out.println("Каждый ребенок получит по: " + Math.round(quantity) + " яблока!");
    System.out.println("И останется: " + balance + " яблока!");
	}

}
