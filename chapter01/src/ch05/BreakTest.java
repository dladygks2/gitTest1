package ch05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) throws InterruptedException {

		//����� Break
		//�߰��� ���ߴ� Break		
		System.out.println("���������Է�");

		Scanner scanner=new Scanner(System.in);
		int count=0;
		final int MULTIPLY;
		MULTIPLY=scanner.nextInt();
		System.out.println("�������������Է�");
		int k;
		k=scanner.nextInt();
		for(int i=1;i<k;i++) {
//			Thread.sleep(1000);
			if ((i%MULTIPLY)==0) { //������ ������ ��� �� ������. ������ ���� 0�̸� ����
				System.out.println("i��:"+i);
				count=count+1;
			}
		
		}
		System.out.println(MULTIPLY+"�� �����"+count+"�� �Դϴ�");
	}
	
}
