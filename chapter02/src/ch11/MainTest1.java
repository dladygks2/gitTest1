package ch11;

import java.util.Calendar;

public class MainTest1 {

	public static void main(String[] args) {
		
		// �����ڰ� private�̸� new() ����� �ȵȴ�.
		
		// Company ��ü�� ������ ������. 5��
		// c1 ,c2 �̷����� �ּҰ��� ����.
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		Company c3 = Company.getInstance();
		Company c4 = Company.getInstance();
		Company c5 = Company.getInstance();
		
		// ȭ�鿡 �ּҰ��� ����غ�����.
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		//
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		// �̱������� ����ϴ� ����
		// 
		
	}
}
