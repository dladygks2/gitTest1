package ch05;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {

//		1. ��ĳ�ʸ� ����� �ּ���
//		2. 1���� ����ڰ� �Է� �� ���� ���� �����ؼ� ����� ���
//		��, do - while ���� ����ؼ� ����� �ּ���.
//		����ڰ� �Է� �� ���� 0�̸� ���α׷� ����

		Scanner scanner=new Scanner(System.in);
		int i;
		int sum = 0;
		final int END = 0;
		
		do {
			System.out.println("�����Է�");
			i=scanner.nextInt();
			sum=sum+i;
		}
		while(i!=END);
		System.out.println("������"+sum+"�Դϴ�");
	}
	

}
