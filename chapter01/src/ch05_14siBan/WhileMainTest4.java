package ch05_14siBan;

import java.util.Scanner;

public class WhileMainTest4 {
	// main function
	public static void main(String[] args) {
		
		// ����ڰ� 0�� �Է��ϸ� ���α׷��� ������Ѷ�
		// ����ڰ� �Է��� ���� ��� �����ϴ� ���α׷����� ������Ѷ�.
		
		// do - while �� ���
		// ��ĳ�ʸ� ����ؼ� ������� �Է°��� �޾Ƽ� ���� ������ ���ּ���.
		// ������ ����� ȭ�鿡 ����ϴ� ���α׷��� ������ּ���.
		
		System.out.println("�Է� : ");
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int input;
		
		do { 			input = scanner.nextInt();
			sum += input;
			
		} while (input != 0);
		
		System.out.println("���� ��� : " + sum);
		
		
//		for(int i = 0; i <3 ; i++) {
//			System.out.println("�Է� : ");
//			input = scanner.nextInt();
//			sum+= input;
//		}
//		
		
		
	}	// end of main

} 	// end of class
