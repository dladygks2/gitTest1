package practice211027;

public class StudentTest3 {

	public static void main(String[] args) {
		
		Student3 studentLee = new Student3(10525, "�̱���");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 80);

		Student3 studentKim = new Student3(10605, "���ͻ�");
		studentKim.setKoreaSubject("����", 95);
		studentKim.setMathSubject("����", 75);
		
		Student3 studentSeok = new Student3(10525, "��Ż��");
		studentSeok.setKoreaSubject("����", 75);
		studentSeok.setMathSubject("����", 100);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		studentSeok.showStudentScore();
	}
}
