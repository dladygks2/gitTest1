package practice211027;

public class Student2 {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student2(int studentNumber, String studentName, int grade) {
		this.studentName = studentName;
		this.studentNumber  = studentNumber;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + " �л��� �й��� " + 
				studentNumber + "�̰�, " + grade + " �г� �Դϴ�.";
	}

}
