package ua.dp.ort.homework4;

public class HardLevel {
	public static void main(String[] args) {
	//8) ���� 6�� ������� �����, ������� ����� ���� ����� �� 100000 �� 999999
	//����������� ��������, � �������������� ������ �������������� ��������,
	//������� �� �������� ��� ����� ��������� 6�� ������� ����� 
	//��������� ����� ���� ��� �����.

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
