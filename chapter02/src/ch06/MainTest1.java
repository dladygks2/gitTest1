package ch06;

// Ŭ������ ����ϴ� ����
public class MainTest1 {
	
	// �����Լ�(�ڵ��� ������)
	public static void main(String[] args) {


		Student studentLee = new Student(1,"Lee");	// Student�����ڸ� ���
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 90);

		studentLee.showStudentScore();
		System.out.println("====================");
		
		
		// �л� 2 ���� ����
		Student studentKim = new Student(2, "Kim");
		
		studentKim.setKoreaSubject("����", 95);
		studentKim.setMathSubject("����", 85);
		
		studentKim.showStudentScore();
		System.out.println("====================");
		
		
		// �л� 3 ���� ����
		
		Student studentPark = new Student(3, "park");
		
		studentPark.setKoreaSubject("����", 75);
		studentPark.setMathSubject("����", 100);

		studentPark.showStudentScore();
		System.out.println("====================");
		
			
	}	// end of main

}	// end of class
