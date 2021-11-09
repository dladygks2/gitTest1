package ch10;

public class Zealot {

	// ��ü�� ��������� �޼��带 ���� �� �ִ�.

	// �������(���ݷ�, �����, �ǵ�)

	private int power;
	private int hp;
	private String name;

	// ������, Ŭ���� �̸��� �Ȱ���

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;

	}

	// private �������� Ȯ���� �� �ֵ���

	public void showInfo() {
		System.out.println("======= ����â ========");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("======= === ========");
	}

	// ���� ���մϴ�. ���ݴ��ϴ� �޼��带 ������
	public void beAttacked(int power) {
		this.hp -= power;

		if (this.hp <= 0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
			this.hp = 0;
		}
	}
	// getName �޼��� ����

	public String getName() {
		return name;
	}

	

//	// ����մϴ�.
//	public void dead() {
//		if(this.hp ==0) {
//			System.out.println("������ �׿����ϴ�.");
//		}
//	}

	// �����ϴ� �κ��� �������. �޼���κ�
	// �����մϴ�.-> ������ ������ �����ϴ� ����
	// �ٸ� ��ü�� ��ȣ �ۿ� -> �޼���� ���� ���� ����
	// (���� 1�� 2�� ���� �Ŵ�. ���� �ڵ������� �޶� ����� ����.)
	
//	// 1.
//	public void attackMarine(Marine marine) {
//		String targetName = marine.getName();
//		System.out.println(name + "��(��)" + targetName + "�� ���� �մϴ�.");
//		marine.beAttacked(this.power);
//
//	}
//
//	public void attackZergling(Zergling zergling) {
//		String targetName = zergling.getName();
//		System.out.println(name + "��(��)" + targetName + "�� ���� �մϴ�.");
//
//		zergling.beAttacked(this.power);
//	}
//
//	
	// �޼��� �����ε��� ����� ����. �޼��尡 attack �̶� ()���� 
	// �Ű������� �ٸ��� ��밡��
	// OOP�� �߿��� ����
	
	// 2.	
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "��(��) " + targetName + "�� ���� �մϴ�.");
		marine.beAttacked(this.power);
	}
	
	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(name + "��(��) " + targetName + "�� ���� �մϴ�.");

		zergling.beAttacked(this.power);
	}
	
	
}
