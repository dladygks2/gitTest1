package ch05;

public class ForMainTest3 {

	public static void main(String[] args) {
		// int num=2;

		// num ���� �ݺ�: 2���� 9����
		for (int num = 2; num < 10; num++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + (num * i));
			}
			System.out.println();
		}
		// i ���� �ݺ�: 1���� 9����

	}// end of main

}// end of class
