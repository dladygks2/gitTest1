package ch08;


// new Ű���带 ����ؼ� �޸𸮿� �ø� �� ����. Ÿ�����θ� ����Ѵ�.
public abstract class Unit {

	/*
	 *  �� ������ �������� �κе��� ��� �������
	 */
	
	// private�� ������� ���� �Լ� ������ ��� 
	// protected �� ���� Ŭ���� �������� ��� ����
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
		return name;
	}
	// �ż��� �����ε��� ����ؼ� �ڵ��� ����.
		public void attack(Unit marine) {
			String targetName = marine.getName();
			System.out.println(name + "��(��) " + targetName + "�� ���� �մϴ�.");
			marine.beAttacked(this.power);
		}
	
	
	
}
