package ch05;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {

		// ����� continue
		// �����ϰ� �����ϴ� continue;
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� �Է��ϼ���");
		int num;
		int count = 0;
		final int MULTIPLE = scanner.nextInt();

		System.out.println("�������� ���� �Է��ϼ���");
		final int MAX = scanner.nextInt();

		for (num = 1; num <= MAX; num++) {// 3�� ����̸� ��� ���� ���ÿ�

			if (num % MULTIPLE == 0) {
				count++;

				continue;

			}

		} // end of for
		System.out.println("�����" + count + "�� �Դϴ�");

	}// end of main

}// end of class
