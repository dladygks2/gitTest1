package practice211027;

public class StudentMainTest {

	public static void main(String[] args) {
		
		// Student Ŭ������ ����ϰڴ�. �����̸� studentLee
		// new �� Student();�� �޸𸮸� �Ҵ��ϰڴ�. ��ġ�� ���� �����ϰڴ�.
		Student1 studentLee = new Student1();
		// Student Ŭ������ ���ǵ� ���� studentName, address�� ���ϰڴ�.
		
		// Student Ŭ������ ��ɵ��� ������ ���
		studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		studentLee.showStudentInfo();
		
		// studentLee�� ����� �޸𸮰�
		System.out.println(studentLee);
		
		// ��� ���Ը� �Ѱų�
		Student2 studentKim = new Student2(31023, "��ν�", 3);
		
		// ��� return ���ε�, �ּҰ��� �����Ѱǰ�
		String data = studentKim.showStudentInfo();
		System.out.println(data);
		System.out.println(studentKim);
		System.out.println(studentKim.showStudentInfo());
		
		
		
		
		
		
		
	}
}
