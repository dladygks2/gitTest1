package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {

		int temp = Employee.getSerialNum(); // static �޼���
		System.out.println("temp�� �ø��� �ѹ� : " + temp);

//		Employee test1;
//		test1.getEmployeeId(); // <--- �Ϲ� �޼����̴�.
// 		new Employee(); �̰� ���鶧 ���� serialNum�� 1�� �����ϰ�
//		employId�� ���Եȴ�.
		
		
		// Employee()�� �����ϸ� serialNum++�� ����ȴ�.
		// test2�� ��������� serialNum++�ؼ� �ԷµǴ°ǰ�����.
		
		Employee test2 = new Employee();
		int t2 = test2.getEmployeeId();
		System.out.println("test2�� EmployeeID : " + t2);
		
		Employee employee1 = new Employee();
		System.out.println("employee1�� �ø��� �ѹ� : " + employee1.serialNum);

		// Employee�� private ������ ����ϰ��� �Ҷ�
		// private ������ ���� Ŭ���������� ��밡��?
		// get() ,set() �޼��� ���

		System.out.println(employee1.getEmployeeId());

		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();

		System.out.println(employee5.getEmployeeId());

		// ��������� ����ƽ������ �ٸ���...
		// static �� �������� ������ �� �ִ� ����
		System.out.println(employee5.serialNum);
		System.out.println(employee1.serialNum);
		System.out.println(employee2.serialNum);
		System.out.println(employee3.serialNum);

		// static ����, ��� ����, ���� ����, ---> �޸� ��ġ Ȯ���ؼ� �ٸ� �ֵ����� �ν��ض�

		System.out.println("==========");

		// emplyee1 ~5 : �ν��Ͻ� ������ �����ؼ� getSerialNum() ����

//		employee1.getSerialNum();

		System.out.println(employee1.getSerialNum());
		System.out.println(employee2.getSerialNum());
		System.out.println(employee3.getSerialNum());
		System.out.println(employee4.getSerialNum());
		System.out.println(employee5.getSerialNum());
		System.out.println("=========");

		// Ŭ���� �̸����� �����ؼ� getSerialNum() �޼��带 ���
		// �̰Ŵ� static���� �������� ������ �κ��̶� 1006���θ� ������ ��
		
		Employee.getSerialNum();

		System.out.println(Employee.getSerialNum());

	} // end of main

} // end of class
