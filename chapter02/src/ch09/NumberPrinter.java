package ch09;

public class NumberPrinter {

	private int id;
	// private int waitNumber =1;
	
	// static �̹Ƿ� �� ��ü���� ��� �����Ѵ�.
	private static int waitNumber = 1;

	public NumberPrinter(int id) {
		this.id = id;

	}

	// ��ȣǥ�� ��� �ּ���.
	public void printWaitNumber() {
		System.out.println(id + " �� ����� ��� ���� : " + waitNumber);
		waitNumber++;

	}
	/*
	 * static �� ��𼭵� ������ �����ϴ�.
	 * 
	 * �ڵ� ����
	 * 
	 * ������ ���� �ȿ� �ִ� ���� = static ���� Ŭ���� �ȿ� ���� 
	 * = ������� ���� �ȿ� ���� = ��������
	 * 
	 * ���� �Լ� = stack�̶�� �޸� ������ ����.
	 * main �ȿ� �ڽŸ��� ������ �Ҵ�޴´�.
	 * 
	 * ���ο��� new()�� �����ϰ� �Ǹ� heap������ �����.
	 * 
	 * 
	 */

}
