package practice211028;

public class Day06_Ch06_Student {
	
	public int studentId;
	public String studentName;
	
	// �츮�� ������ Ŭ������ ���� Ÿ������ ����Ѵ�.
	Day06_Ch06_Subject korea;
	private Day06_Ch06_Subject math;
	
	// ������
	public Day06_Ch06_Student(int id, String name) {
		studentId = id;
		studentName = name;
		// ���� Ÿ���� ������ �ؾ� ����� �� �ִ�.
		// �޸𸮿� �����ϰ� �������Ѵ�.
		
		korea = new Day06_Ch06_Subject();
		math = new Day06_Ch06_Subject();
	}
	// ������ �Է� �޴� �޼��� ����(���� ���� ���� ���� ����)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	// ������ �Է� �޴� �޼��� ����(���� ���� ���� ���� ����)
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	// �л��� ������ ȭ�鿡 ����ϴ� ��� �����
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName +"�� ������ "+ total + " �� �Դϴ�.");
	}
	
}
