package ch04;

public class Student {

	// ������ - constructor ( ��ü�� ���� �� �� �ʿ�)
	// ��ü�� ������ �� ������ ���� ������� �������
	// �����ϴ� ��(�������� �ο���)

	// �������
	int number; // �л��� ��ȣ
	String name; // �л��� �̸�
	int grade; // �л��� �г�

	// �⺻ ������ (default constructor)
	// ����� ���� �����ڰ� ���� ��쿡��
	// �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� ����� �ش�.
	public Student() {

	}

	// ������ �����(�����ڰ� ���� ���� - ����� ���� ������)
	// ��κ��� public
	// ������ �Ű����� �ȿ� 'grade'�� �ְ� �ڵ带 �������ϰ� �����ϼ���.
	public Student(int num, String name, int grade) { // �����ڴ� class�̸��̶� �Ȱ��� �ؾ���
		// �� ��ȣ �ȿ� ��ü �̸� ���� �� ����
		number = num;
		// �Ű����� �̸��� ������� �̸��� ���ٸ� 'this.' Ű���带 ����ؼ�
		// ������ �־�� �Ѵ�.
		this.name = name; // this. == �ڱ��ڽ� �� �ǹ�
		this.grade = grade;
	}

	// �޼��� ����
	public void showInfo() {
		System.out.println(name + " �л��� �й��� " + number + "�� �Դϴ�.");
		System.out.println(name + " �л��� �̸��� " + name + " �Դϴ�.");
		System.out.println(name + " �л��� �г��� " + grade + "�г� �Դϴ�.");
		System.out.println("========================");
//		System.out.println(name + " �л��� �й��� " + number + "�� �Դϴ�.\n" 
//		+ name + " �л��� �̸��� " + name + " �Դϴ�.\n" + name + 
//				" �л��� �г��� " + grade + "�г� �Դϴ�.");
	}

}
