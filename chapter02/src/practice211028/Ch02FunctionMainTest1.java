package practice211028;

public class Ch02FunctionMainTest1 {

	// �����Լ� �κ��� ������ �ϴ� �κ��ε�
	public static void main(String[] args) {

		// �Լ� ��� ���(��� ���߱�)
		int addResult1 = add(10, 77);
		System.out.println("addResult1 = " + addResult1);

		int addResult2 = add(10, 30);
		System.out.println("addResult2 = " + addResult2);

	}// end of main

// add �Լ��� ����
// �ϳ��� Ŭ���������� ���� �Լ����ϳ��̰�, �׳� �Լ����� ��� ���� �� �ִ�.
	public static int add(int num1, int num2) {

		int result;
		result = num1 + num2;

		return result;	// ���� Ű���带 ������ �� ���࿡ ������� ��ȯ�Ѵ�...
		
		// public static int = int ���� ��ȯ�ؾ��Ѵ�.
		// public static void = void�� ���� ��ȯ���ٴ� ���̴�.

	}
}// end of class