package ch05_14siBan;

public class WhileMainTest3 {
	// main function
	public static void main(String[] args) {
		
		// do ~ while
		int input = 10;
		int sum = 0;
		
		do {
			
			System.out.println("���� ��:" + input);
			// ���� ����� ���ô�.
			
			sum += input;
			
			input--;		// '���� ������' ����Ѵ�.
			
		} while(input != 0);
		
		System.out.println("������ ����� : " + sum + "�Դϴ�.");
	}	// end of main

}	// end of class
