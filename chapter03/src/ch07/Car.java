package ch07;

public abstract class Car {
	
	public void startCar() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
	public abstract void drive();
	
	public abstract void stop();

	public abstract void wiper();

	// ��ũ(hook) �޼��� : �ʿ��ϸ� ���ٽ��
	public void washCar() {
		
	}
	
	
	// �ٽ�
	// ���� Ŭ�������� ������ �� �� ���� �ؾ��Ѵ�.
	// --> final
	
	final public void run() {
		System.out.println("���� ���Դϴ�.");
		
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
