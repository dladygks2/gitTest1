package ex01;

public class Unit {

	/*
	 *  �� ������ �������� �κе��� ��� �������
	 */
	
	protected int power;
	protected int hp;
	protected String name;
	
	
	
// private �������� Ȯ���� �� �ֵ���
	public void showInfo() {
		System.out.println("======= ����â =======");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("======= === ========");

	}
// ���� ���մϴ�. ���ݴ��ϴ� �޼��带 ������
	public void beAttacked(int power) {
		this.hp -= power;
			if (hp <= 0) {
			System.out.println(this.name + "�� ����Ͽ����ϴ�.");
			this.hp = 0;
		}
	}	
	
	// getName �޼��� ����

	public String getName() {
		return this.name;
	}
	// �ż��� �����ε��� ����ؼ� �ڵ��� ����.
	public void attack(Unit unit) {
		String targetName = unit.getName();
		System.out.println(name + "��(��) " + targetName + "�� ���� �մϴ�.");
		unit.beAttacked(this.power);
	}
	
//	
//		// �޼��� �����ε�
//		
//	public void attack1(Unit unit) {
//		String targetName = unit.getName();
//		System.out.println(name + "��(��) " + targetName + "�� ���� �մϴ�.");
//		unit.beAttacked(this.power);
//	}
	
}
