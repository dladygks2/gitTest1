package ch03;

public class Warrior {
// Ŭ���� ����
	
	// ��� ����
	 String name;	// ������ �̸��� �ҹ��ڷ� ����
	 int hp;
	 int mp;
	 int power;
	 
		
	
	// ��� �Լ�
	 public void attack() {	// �޼��� �̸��� �ҹ��ڷν���
		 System.out.println("�⺻ ����");
	 }
	 
	 public void Info() {
		 System.out.println("===����â===");
		 System.out.println("�̸� : " + name);
		 System.out.println("ü�� : "+ hp);
		 System.out.println("�� : " +power);
	 }
	 
	 
}
