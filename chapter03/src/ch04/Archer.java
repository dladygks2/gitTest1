package ch04;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
		// super == Hero.
	}

	public void fireArrow() {
		System.out.println("���̾� �ַο�");
	}
}
