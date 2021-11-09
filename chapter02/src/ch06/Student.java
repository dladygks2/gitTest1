package ch06;

public class Student {

	int studentID;
	String studentName;
	
	// �츮�� ������ Ŭ������ ���� Ÿ������ ����Ѵ�. 
	
	Subject korea;
	Subject math;
	
	// ������ : �� ��ü�� �޸𸮿� �ø��� ó�� ����Ǵ� ����
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		// ??? korea, math �ڷ���� ���� �޸𸮸� �����ؾ��Ѵ�.
		// ����Ÿ���� new Ű���带 ����ؾ���
		// ���� Ÿ���� ������ �ؾ� ����� �� �ִ�. �޸𸮿� �����ϵ��� new Ű���尡 �ʿ��ϴ�.
		korea = new Subject();
		math = new Subject();
	}
	
	// ������ �Է¹޴� �޼��� ����(���� ���� ���� ��������)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	// ������ �Է¹޴� �޼��� ����(���� ���� ���� ��������)
		public void setMathSubject(String name, int score) {
			math.subjectName = name;
			math.score = score;
		}
		
	// ����� ������ ��������� ���� ���. �л��� ������ ȭ�鿡 ����ϴ� ��� �����
		public void showStudentScore() {
			int total = korea.score + math.score;
			System.out.println(studentName + " �л��� ������ " + total +"�� �Դϴ�." );
		}
		
		/*
		 * �����͸� ���� �� ���� � ���������� ������ ��������Ѵ�.
		 * 
		 * ���� �ڷ���: �����ڰ� ������ OOP �������� ����� �� �� �ִ�. JDK���� �����ϴ� ���� ����� ���� �ִ�. 
		 * ��) String ��
		 * 
		 * �ܺ� ���̺귯���� ���
		 * 
		 * �ڹٿ����� ù������ ��ҹ��� ������ �Ѵ�. �⺻�ڷ��� : �ҹ��� // ���� �ڷ��� : �빮��
		 * 
		 * �⺻ �ڷ����� ����ϴ� �޸��� ũ�Ⱑ ������ ������, ���� �ڷ����� Ŭ������ ���� �ٸ�
		 * 
		 * ���� �ڷ����� ��� �Ҷ��� �ش� ������ ���� �����Ͽ��� ��.... 
		 * ex) new (String Ŭ������ ���������� �������� �ʰ� ����� �� �ִ�.)
		 * 
		 * �� ) String name = "A"; Warrior warriorA = new Warrior();
		 */

}
