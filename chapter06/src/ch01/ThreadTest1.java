package ch01;

public class ThreadTest1 {

	// �����Լ� <-- ���� ������
	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			System.out.print("-");

			// static method = Thread
			try {
				Thread.sleep(500);// 0.5��
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			
			
		} // end of for

		/*
		 * Thread???
		 * 
		 */

	}// end of main

}// end of class
