package ch02_14siBan;

public class TypeConversion {

	// ���� �Լ� (�ڵ��� ������)
	public static void main(String[] args) {
		// ������ �� ��ȯ
		// int �ڷ����� double�� �����ϰų� 
		// double �ڷ����� int�� �����ϴ� ���� ���մϴ�. double���� �Ǽ����� ����.
		int iNum1 = 100;
		System.out.println(iNum1);
		
		// �ڵ� ����ȯ : �������� ū�ſ� ���� ������ �׳� �ڵ����� �Ѿ
		double dNum1 = iNum1;
		System.out.println(dNum1);

		
		// ���� ����ȯ : �ݴ� ��Ȳ�̶� ������ ����ؾ���
		double dNumber = 1.12345;
//		int iNumber = dNumber;
		
		// int = 4bytes// double = 8bytes iNumber ũ�Ⱑ dNumber ���� �۾Ƽ� ���� ���Ѵ�.
		
		
		// �����ڰ� '�����Ϸ��� �������ϱ� �׳� ������ �־�.' ���� ����ȯ = (int) 
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
			
		// ����
		double aValue;
		int bValue;
		
		aValue = 0.5;
		bValue = (int)10.1;
		// 10.1�� int�� �ٲ㼭 �־���Ѵ�. �Ҽ����� ������. �������̴ϱ�
		
		System.out.println(bValue);
		
	}// end of main

}// end of class
