package ch04;

public class Hero {

	// member variable
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
		
	}
	
	public void attack() {
		System.out.println("����? �̰� �³�?");
	}
	
	public void HeroInfo() {
		System.out.println("������ �̸� : " + name + "\n������ ü�� : " + hp );
		
	}
	
}
