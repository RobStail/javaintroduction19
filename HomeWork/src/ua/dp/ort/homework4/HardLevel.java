package ua.dp.ort.homework4;

public class HardLevel {
	public static void main(String[] args) {
	//8) есть 6ти значное число, которое может быть любым от 100000 до 999999
	//разработать алгоритм, с использованием только арифметических операций,
	//который бы позволял при любом указанном 6ти значном числе 
	//вычислять сумму всех его чисел.

	int i = 338294;
	int sum = 0;
	int curentDidget;
	curentDidget = i % 10;
	sum += curentDidget;
	i /= 10;
	curentDidget = i % 10;
	sum += curentDidget;
	i /= 10;
	curentDidget = i % 10;
	sum += curentDidget;
	i /= 10;
	curentDidget = i % 10;
	sum += curentDidget;
	i /= 10;
	curentDidget = i % 10;
	sum += curentDidget;
	i /= 10;
	curentDidget = i % 10;
	sum += curentDidget;
	System.out.println(sum);
}
}
