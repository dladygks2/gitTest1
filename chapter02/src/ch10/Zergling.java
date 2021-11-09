package ch10;

public class Zergling {

	// ��ü�� ��������� �޼��带 ���� �� �ִ�.

	// �������(���ݷ�, �����, �ǵ�)
	private int power;
	private int hp;
	private String name;

	// ������, Ŭ���� �̸��� �Ȱ���

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 40;
	}

	// private �������� Ȯ���� �� �ֵ���

	public void showInfo() {
		System.out.println("======= ����â ========");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("======= === ========");
	}

//private ������ �ǵ��� �ʰ� ������ ������ �ٲٵ���

	// ���� ���մϴ�. ���ݴ��ϴ� �޼��带 ������
	public void beAttacked(int power) {
		this.hp -= power;

		if (hp <= 0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
			this.hp = 0;
		}
	}
//
//	// 1. ���۸��� ������ �����մϴ�.
//	public void attackZealot(Zealot zealot) {
//		String targetName = zealot.getName();
//		System.out.println(name + "��(��)" + targetName + "�� ���� �մϴ�.");
//		zealot.beAttacked(this.power);
//
////		if (zealot.dead()){
////			
////		}
//	}
//
//	// 2. ���۸��� ������ �����մϴ�.
//	public void attackMarine(Marine marine) {
//		String targetName = marine.getName();
//		System.out.println(name + "��(��)" + targetName + "�� ���� �մϴ�.");
//		marine.beAttacked(this.power);
//	}
//	// getName �޼��� ����

	public String getName() {
		return name;
	}

	// �ż��� �����ε��� ����ؼ� �ڵ��� ����.
	public void attack(Marine marine) {
		String targetName = marine.getName();
		System.out.println(name + "��(��) " + targetName + "�� ���� �մϴ�.");
		marine.beAttacked(this.power);
	}
	
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(name + "��(��) " + targetName + "�� ���� �մϴ�.");

		zealot.beAttacked(this.power);
	}
	
}