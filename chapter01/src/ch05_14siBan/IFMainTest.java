package ch05_14siBan;

import java.util.Scanner;

public class IFMainTest {
	// main
	public static void main(String[] args) {
		// ��� if
		// �־��� ���ǿ� ���� ������ �̷�� ������ ����
		// ���� ... �̶��

		boolean flag = false;

		// if �� �ܵ�
		if (flag) {
			System.out.println("���ǽ���  True �̸� ���� �˴ϴ�.");
		} // end of if

		// if else��: �� �� �ϳ��� �ݵ�� �����
		if (flag) {
			System.out.println("True ����");
		} else {
			System.out.println("False ����");
		} // end if if-else
System.out.println("========================");
		// if-else if-else
		Scanner sc=new Scanner(System.in);
		int point=sc.nextInt();
		
		if (point >= 90) {
			
			System.out.println("A����");
			
		} else if (point >= 80) {
			
			System.out.println("B����");
			
		} else if (point >= 70) {
			
			System.out.println("C����");
			
		} else if (point >= 60) {
			
			System.out.println("D����");
			
		} else {
			
			System.out.println("����");
			
		}

	} // end of main

}// end of class
