package ch01;

public class StudentMaintest2 {

	public static void main(String[] args) {

		Student student1 = new Student();
		// 1. �����ؼ� name, height, weight, grade
		// ���ϴ� ���� �ְ� ȭ�鿡 ���
		
		student1.name = "ȫ�浿";
		student1.height = 150;
		student1.weight = 50;
		student1.grade = 'A';
		
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		
		
		System.out.println("------------------");
		
		Student student2 = new Student();
		// 2. �����ؼ� name, height, weight, grade
		// ���ϴ� ���� �ְ� ȭ�鿡 ���
		
		student2.name = "�谩��";
		student2.height = 145;
		student2.weight = 34;
		student2.grade = 'C';
				
		System.out.println(student2.name);
		System.out.println(student2.height);
		System.out.println(student2.weight);
		System.out.println(student2.grade);
		
		
	}	// end of main

}	// end of class
