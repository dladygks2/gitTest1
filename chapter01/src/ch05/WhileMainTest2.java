package ch05;

import java.util.Scanner;

public class WhileMainTest2 {
	//�ڵ��� ������
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	//1����10���� ���ؼ� �� ������� ���		
	System.out.println("�����Է�");
	int num = 1;
	int sum = 0;
	final int LIMIT_VALUE = scanner.nextInt();
	
	while(num<=LIMIT_VALUE) {
		sum=sum+num;
		num++;
	}
	System.out.println("�����:"+sum);
		
	}//end of main

}//end of class
