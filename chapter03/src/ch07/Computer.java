package ch07;

// �߻� Ŭ����. �ϳ��� abstract�� ����Ǹ� �´� �߻� Ŭ�����̰�, new() �ȵȴ�.
public abstract class Computer {

	// �߻� �޼���: abstract�� ������� ��. {}�� ������ �߻�޼���, ��ü�� ���� �޼���
	public abstract void display(); // <- �޼����� �����. signature

	public abstract void typing();

	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

}
