package ch04;

public class StudentMainTest {
	// �����Լ� (�ڵ��� ������)
	public static void main(String[] args) {

		Student s1 = new Student(15, "ȫ�浿", 3);

//		System.out.println(s1.number); 	// ��������� �ڿ� ()����.
//		System.out.println(s1.name); 	// ��������� �ڿ� ()����.
//		System.out.println(s1.grade); 	// ��������� �ڿ� ()����.

		s1.showInfo(); // �갡 �޼����̴�. �޼���� �ڿ� ()�ִ�.

		// �⺻ �����ڷ� ��ü �����غ���
		Student s2 = new Student();

		s2.number = 2;
		s2.name = "�̼���";
		s2.grade = 2;

		System.out.println("��ȣ : " + s2.number);
		System.out.println("�̸� : " + s2.name);
		System.out.println("�г� : " + s2.grade);

		s2.showInfo();
	} // end of main

} // end of class
//Ctrl Shif 'F' = ��������