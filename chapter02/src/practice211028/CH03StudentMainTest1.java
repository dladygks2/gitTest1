package practice211028;

public class CH03StudentMainTest1 {

	public static void main(String[] args) {
		
		CH03Student studentLee = new CH03Student();
		studentLee.studentID = 31025;
		studentLee.studentName = "��õ��";
		studentLee.address = "���� �߶���";
		
		studentLee.showStudentInfo();
		
		CH03Student studentKim = new CH03Student();
		studentKim.studentID = 31010;
		studentKim.studentName = "����";
		studentKim.address = "���� ������";
		
		studentKim.showStudentInfo();
		
		System.out.println("---------------------------------");
		
		String name1 = studentLee.getStudentName();
		System.out.println("�л� �̸� : " + name1);
		

		String name2 = studentKim.getStudentName();
		System.out.println("�л� �̸� : " + name2);
		
		
		
	}
}
