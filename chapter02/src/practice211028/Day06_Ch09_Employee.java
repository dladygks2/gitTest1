package practice211028;

public class Day06_Ch09_Employee {
	
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Day06_Ch09_Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	// return �� �ּҰ� ��ȯ�̴�.
	public int getEmployeeId() {
		return employeeId;
	}
	
	
	// static �޼��� Ȱ��
	public static int getSerialNum() {
		/* ���� : static �޼��� �ȿ����� ��������� ����� �� ����.
		 * ���� : ��ü�� ��������� ���� �����ؼ� ����� �� �ִ� 
		 * static �̱� �����Դϴ�.
		 * ��ü�� �����Ǳ� ���� ����� �� �ִ� �޼���
		 * department = "������";
		 */
		
		return serialNum;
	}

}
