package practice211028;

public class Day06_Ch07_Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;

	// get : ������ ��� ���� �Լ�
	public String getName() {
		return name;
	}

	// set : ������ ����ϴ� �Լ�
	public void setName(String name) {
		// ����� �ڵ� �ۼ�
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("�߸��� �Է��Դϴ�. �̸��� �ٽ� �ۼ��� �ּ���.");
		} else {
			this.name = name;
		}
	}

	// hp, defense, level
	// get, set �޼��带 ������ּ���
	// �޼��带 �����ϴ� �ڵ� �ۼ�
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		if(hp<0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			this.hp = hp;
		}
	}
	
	public double getDefense() {
		return defense;
	}
	
	public void setDefense(double defense) {
		if(defense <0) {
			System.out.println("wrong input");
		} else {
			this.defense = defense;
		}
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		if(level <0) {
			System.out.println("wrong input");
		} else {
			this.level = level;
		}
	}

	
	// main function
	public static void main(String[] args) {
		
		// make Hero object, use getter, setter method
		Day06_Ch07_Hero hero = new Day06_Ch07_Hero();
		hero.setName("�߽���");
		String name = hero.getName();		// �ּҰ�= hero, '.getName()'�� �� �ּҾ��� ����� �������� �ǹ�
		System.out.println("���� �޴� �� : " + name);
		System.out.println("���� �޴� �� : " + hero.getName());
	}
	
	
	
	
	
	
}
