package ch05_14siBan;

public class WhileMainTest {
	
	// main function
	public static void main(String[] args) {
		
		
		// 1~10 ���� ���� ����
		
		int num = 1;
		int sum = 0;
		while(num <=10) {
			System.out.println("���� �� : " + num);
			sum += num;
			num++;
			
			// ����ó������. �� �ؿ� �κ�
			try {
				// Thread.sleep(500);	// 0.5�� ���� ���ߴ� ���� 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} // end of while
		
		System.out.println("������ ������� :"+ sum + "�Դϴ�.");
		

	}	// end of main

}	// end of class
