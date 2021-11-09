package ch01;

class MyThread3 extends Thread {

	// Thread�� �ؾ��� ��
	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ":" + Thread.currentThread());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class ThreadTest3 {

	// main thread
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		// �۾��� 3�� ����

		MyThread3 th1 = new MyThread3();
		MyThread3 th2 = new MyThread3();
		MyThread3 th3 = new MyThread3();

		// �۾��� ���۽��� �ּ���. 
		// start�� ���� �������� ó���Ǵ� �ǰ� 
		// run�̶� ���ϸ�?? �ƴѵ�...
		
		th1.start();
		System.out.println("-------");
		th2.run();
		System.out.println("======");
		th3.run();

	}// end of main

}// end of class
