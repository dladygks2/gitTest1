package ch08;

import ex01.Unit;

public class Marine extends Unit{

	// ��ü�� ��������� �޼��带 ���� �� �ִ�.

	// �������(���ݷ�, �����, �ǵ�)

	private int power;
	private int hp;
	private String name;

	// ������, Ŭ���� �̸��� �Ȱ���

	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 60;

	}

//	// private �������� Ȯ���� �� �ֵ���
//
//	public void showInfo() {
//		System.out.println("======= ����â =======");
//		System.out.println("�̸� : " + this.name);
//		System.out.println("���ݷ� : " + this.power);
//		System.out.println("ü�� : " + this.hp);
//		System.out.println("======= === ========");
//
//	}

	// private ������ �ǵ��� �ʰ� ������ ������ �ٲٵ���

//	// ���� ���մϴ�. ���ݴ��ϴ� �޼��带 ������
//	public void beAttacked(int power) {
//		this.hp -= power;
//
//		if (hp <= 0) {
//			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
//			this.hp = 0;
//		}
//	}
//
//	// 1. ������ ������ �����մϴ�.
//	public void attackZealot(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(name + "��(��)" + targetName + "�� ���� �մϴ�.");
//		zealot.beAttacked(this.power);
//	}
//
//	// 2. ������ ���۸��� �����մϴ�.
//	public void attackZergling(Zergling zergling) {
//		String targetName = zergling.getName();
//		System.out.println(name + "��(��)" + targetName + "�� ���� �մϴ�.");
//		zergling.beAttacked(this.power);
//	}

//	// getName �޼��� ����
//
//	public String getName() {
//		return name;
//	}

//	// �޼��� �����ε�
//	
//	public void attack(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(name + "��(��) " + targetName + "�� ���� �մϴ�.");
//		zealot.beAttacked(this.power);
//	}
	
//	public void attack(Zergling zergling) {
//		String targetName = zergling.getName();
//		System.out.println(name + "��(��) " + targetName + "�� ���� �մϴ�.");
//
//		zergling.beAttacked(this.power);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
