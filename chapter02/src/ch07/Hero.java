package ch07;

public class Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;
	
	// get �޼���
	public String getName() {
		return this.name;	// �׳� name�� ����
	}
	
	// set �޼���
	public void setName(String name) {
		// ����� �ڵ� �ۼ�
		if(name == null || name =="" || name.length() < 2) {
			System.out.println("�߸��� �Է��Դϴ�. \n�̸��� �ٽ� �ۼ����ּ���.");
		}else {	
			this.name = name;
		}	
	}
	// hp, defense, level
	// get, set �޼��带 ����� �ּ���
	// �޼��带 �����ϴ� �ڵ� �ۼ�
	///////////////////////////////////////// get () �޼���� �д� ���Ҹ�	
	public int getHp() {
		return this.hp;
	}
	//////
	public void setHp(int hp) {
		this.hp = hp;
	}
	///////////////////////////////////////////////
	public double getDefense() {
		return this.defense;
	}
	///////
	public void setDefense(double defense) {
		this.defense = defense;
	}
	////////////////////////////////////////////////
	public int getLevel() {
		return this.level;
	}
	///////
	public void setLevel(int level) {
		this.level = level;
	}
	////////////////////////////////////////////////
	// OOP (Object-oriented programming): ��ü ���� ���α׷���
	
	
	
	
	
	// main �Լ� 
	public static void main(String[] args) {
		
		// Hero ��ü ���� �� getter, setter �޼��带 ����� ������.
		Hero hero1 = new Hero();
		
		hero1.setName("Iron Man");
		hero1.getName();
		
		
		
		
		
		
	}
	
}
