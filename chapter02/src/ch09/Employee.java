package ch09;

public class Employee {
	// static ����
	public static int serialNum = 1000;

	// ��� ����
	private int employeeId;
	private String employeeName;
	private String department;

	// �⺻ ������ ����
	public Employee() {
		// �������� �޸� �ø��� Id�� 1�� �÷���
		serialNum++;
		employeeId = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	// static �޼��� Ȱ��. static = ���� �޼��� ����

	public static int getSerialNum() {
		// ���� : static method �ȿ����� ��� ������ ����� �� ����.
		// why: ��ü�� ��������� ���� �����ؼ� ����� �� �ִ�
		// static �̱� �����Դϴ�.
		// ��ü�� �����Ǳ� ���� ����� �� �ִ� �޼���

		// department = "������";
		return serialNum;
	}

}
