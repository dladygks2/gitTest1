package practice211028;

public class CH03Student {
	
	// ��� ���� 
	public int studentID;
	public String studentName;
	public String address;
	
	// �޼��� (Ŭ���� �ȿ� ������� �Լ�?), void = ��ȯ�� ����.
	public void showStudentInfo() {
		System.out.println("�й� : " + studentID + "\n�л��̸� : " + studentName + "\n�ּ� : " + address);
	}
	
	// String ���ڸ� ��ȯ�� �Ŷ�� ǥ��
	public String getStudentName() {
		return studentName;
	}

}
