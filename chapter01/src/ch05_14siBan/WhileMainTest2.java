package ch05_14siBan;

import java.util.Scanner;

public class WhileMainTest2 {

	public static void main(String[] args) {
		
		// ����� ��� ���� ��ĳ�ʸ� ����ؼ� �ڵ带 ������ �ּ���.
		System.out.println("�� �Է� : ");
		Scanner scanner = new Scanner(System.in);
		final int LIMIT_VALUE = scanner.nextInt();
		// final int�� ������ ����(�ٸ� ������ ����������), �̸��� �빮��
		
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VALUE) {
			
			sum += num;
			num++;
		}
		
		System.out.println("����� : " + sum);
	}

}
