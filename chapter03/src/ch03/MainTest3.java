package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		
		// �ڵ����� �����ؼ� showInfo() �޼��带 ȣ���� �ּ���.
		
		Car car1 = new Car("�Ÿ", 35_000_000);
		
		car1.showInfo();
		
		// car1 ������ ������ ������ּ���.
		// ���� ������ ���� ����� ������ �ƴϴ�...
		
		car1.engine.showInfo();
		
	}
	
}
