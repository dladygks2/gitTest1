package ch03;

// Ŭ������ ����ϴ� ���� �� �ڵ�
public class StudentMainTest {

	public static void main(String[] args) {
		
		//2021-10-22 14:00
		//main �Լ����� �ڵ尡 �ؼ��ϱ� �����Ѵ�.
		//new Ű���� : ��ü�� �����Ѵٴ� �ǹ�. ex) Student()��� ��ü�� �����ϰڴ�. 

		
		Student studentLee = new Student();
		
		studentLee.studentName = "�̼���";
		studentLee.address = "��õ";
		
		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanUp();
				
		Student studentKim = new Student();
		
		studentKim.studentName = "������";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();

		// �޼��� ���
		// 1. takeTest ����
		studentKim.takeTest();
		// 2. cleanUp ����
		studentKim.cleanUp();
		
		
		
		System.out.println("====================");
		
		
		String name1 = studentKim.getStudentName();
		System.out.println("name1: " + name1);
		
		String name2 = studentLee.getStudentName();
		System.out.println("name2: " + name2);
		
		
		
	}	// end of main

}	// end of class
