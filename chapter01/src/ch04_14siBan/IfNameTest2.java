package ch04_14siBan;

import java.util.Scanner;

public class IfNameTest2 {
	// main function
	public static void main(String[] args) {
		
		System.out.println("������ �Է����ּ���. : ");
			
		Scanner scanner = new Scanner(System.in);
				// Ctrl+ Shift+ 'O'button
		
		int point = scanner.nextInt();
		char result = 'Z';
				
		// ���� 1. if ���� ����ؼ� ������ ������ּ���.
		// 100~90 --> A
		// 90~ 80 --> B
		// 80~70 --> C
		// 70~60 --> D
		// 60~0 --> F
		
		if (point <=100 && point >= 90) {
			result ='A';
		}else if (point < 90 && point >=80 ) {
			result ='B';
		}else if (point < 80 && point >=70 ) {
			result ='C';
		}else if (point < 70 && point >=60 ) {
			result ='D';
		}else if (point < 60 && point >= 0){
			result ='F';
		}
		
		if(result != 'Z') { // result�� �ٸ� ������ �Էµ��� �ʰ�, �ʱⰪ���� ������ ��찡 �ƴ϶��.
			System.out.println("����� ������ : "+ result + "�Դϴ�.");
		}else {	// result�� 'Z' �� �ʱⰪ�� �״�� ��� ���¶��.
			System.out.println("�Է��� �߸��Ͽ����ϴ�.");
		}
					
		// System.out.println("����� ������ : "+ result + "�Դϴ�.");
				
				
	} // end of main

}	// end of class
