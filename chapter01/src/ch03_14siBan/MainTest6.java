package ch03_14siBan;

import java.util.Scanner;

public class MainTest6 {
	// main function
	public static void main(String[] args) {
	
		// ���� ������
		// ���ǽ� ? ���1(True�� ���) : ���2(False�� ���);
		
		int Num1 = (5 > 3) ? 10 : 20;
		System.out.println(Num1);
		
		int Num2 = (5 < 3) ? 10 : 20;
		System.out.println(Num2);
		
		//JDK�� ������� ������ �̿��� ���ô�.
		int max;
		System.out.println("�Է� ���� �� ���� ū ���� ����ϼ���.");
		
		// ���� �����?? ��� JDK���� ������°�
		// Ctrl + Shif + 'O' : �̰� ���� ���� 3��° �� ����. import �ؼ� �� �� �ֱ���.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է� 1: ");
		int x = scanner.nextInt();
		System.out.println("�Է� 2: ");
		int y = scanner.nextInt();
		
		// ���� ������ ��
		max = (x>y)?  x : y;
		// ��� ���
		System.out.println("ū ���ڴ� " + max + "�Դϴ�.");
		
		
		
		
		

	}	// end of main

} // end of class
