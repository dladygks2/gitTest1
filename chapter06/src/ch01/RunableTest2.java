package ch01;

import javax.swing.JFrame;

class MyRunable2 extends JFrame {

	int grade = 10;

	public MyRunable2() {
//		runable.run();
	}

	// �ڹ� ����
	// ���� ��ü.
	// �������̽� ������ {}�� ��ü�� �����س´�.
	Runnable runable = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("--");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} // end of for

		}// end of run
	};

}

public class RunableTest2 {

	public static void main(String[] args) {

		MyRunable2 myRunable2 = new MyRunable2();
		// ���� 1. ��ü ������ ���ÿ� run �޼��带 ������� �ּ���.
		
		// ���� 2. �ܺο��� run �޼��带  ���۽��� �ּ���
		myRunable2.runable.run();
	}
}// end of class