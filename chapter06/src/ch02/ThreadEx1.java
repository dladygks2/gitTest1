package ch02;

import java.util.Scanner;

class MyThread1 extends Thread {

	boolean flag = true;

	@Override
	public void run() {

		while (flag) {
			System.out.print("-");

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// end of run

}// end of class

public class ThreadEx1 {

	public static void main(String[] args) {

		System.out.println("�۾��ڸ� �����ϰڽ��ϴ�.");
		// ���� �����尡 �۾��ڸ� ��û�ؼ� �����Ѵ�.
		MyThread1 thread1 = new MyThread1();
		thread1.start();

		System.out.println("0���� �Է��ϸ� �����մϴ�.");
		Scanner scanner = new Scanner(System.in);
//		int userInput = scanner.nextInt();

//		if (userInput == 0) {
////			thread1.stop();// deprecated(���̻� ������������ ����)
//			thread1.flag = false;
//		}

		// ���� 3.
		// do while ����ؼ� �ڵ带 ����, �Է��� �߸������� �ٽ� �Է��� �� �ֵ���.

		// 1. do while �� �����

		int userInput = 100;

		do {
			userInput = scanner.nextInt();

			if (userInput == 0) {
				thread1.flag = false;
			}

		} while (userInput != 0);

		// 2. do �ȿ� � �ڵ尡 ��������

		// 3. while ���� ���ǽ��� ����

	}

}
