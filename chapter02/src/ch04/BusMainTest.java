package ch04;

import ch05.Student;

public class BusMainTest {
	
	public static void main(String[] args) {
		
		// ���� 101, 102 �� ������ ����� �ּ���.
		Bus bus101 = new Bus(101);
		Bus bus102 = new Bus(102);
		Bus bus103 = new Bus(103);
		
		
		
		Student student1 =new Student("ȫ�浿", 10_000);
		Student student2 =new Student("ȫ�浿", 10_000);
		// 
		bus101.showInfo();
		System.out.println("===============");
		bus102.showInfo();
		
		 
		//
		System.out.println("===============");
		bus101.take(1200);
		bus101.showInfo();
		
		
		// bus102 ������ take �޼��带 2�� ���� �� showInfo Ȯ��
		System.out.println("===============");
		bus102.take(1200);
		bus102.take(500);
		bus102.showInfo();
		
	}

}
