package ch01;
// �� ������ ��Ƶδ� ������ ��Ű����� �Ѵ�..

public class DataType1 {

	// �����Լ�(�ڵ��� ������)
	public static void main(String[] args) {
		// ������ Ÿ�� ����
		// 1. �⺻ �ڷ���(primitive data type)
		// 2. ���� Ÿ��(Reference Type)

		// �⺻ �ڷ���
		// ������ ������ �Ǽ��� ����(4���� ����)

		// ������(1,10,100)

		byte b; // 1����Ʈ = 8bits(0~127)
		short s; // 2����Ʈ = 16��Ʈ, ���� ������
		int i; // ** 4����Ʈ = 32��Ʈ, �ַ� ���
		long l; // 8����Ʈ = 64��Ʈ, �ַ� ���

		b = 127;
		// b = 128;
		b = -128;
		// byte �� ���� : -128~127

		// int �� ���� ǥ�� ����
		i = 2100000000;
		i = -2100000000;
		// i = 22000000000;

		l = 22000000000l;
		l = 22000000000L;
		// �ҹ��� l �̳� �빮�� L �� ���̻�� ����ؼ� long ���� ����Ѵ�. ������ �빮�� L�� ����

		i = 10;
		System.out.println(i);

		i = 300;
		System.out.println(i);

			// Ctrl + shift + 'F'key : ���� ���� ���
	}// end of main

} // end of class
