package ex01;

import java.util.Random;

public class Warrior {
 
	// ��� ����
	// hp, power, name
	String  WarriorName;
	String  WarriorJob;
	String  WarriorGuild;
	String  WarriorTitle;
	
	int hp = 20;
	int mp = 5 ;
	
	int pwr = 20;
	int dex = 10;
	int mag = 5;
	int def = 10;
	
	// WarriorSkill
	public void attack() {
		System.out.println("�⺻ ����");
		System.out.println(pwr*2 + "�� �������� �־����ϴ�.");
		System.out.println("---------------------------");
		
	}
	public void skill1() {
		System.out.println("���ϰ� ����ġ��");
		System.out.println(pwr*10 + "�� �������� �־����ϴ�.");
		mp -= 3;
		System.out.println("---------------------------");
		
	}
	public void skill2() {
		System.out.println("���� �ֵθ���");
		System.out.println(pwr*13 + "�� �������� �־����ϴ�.");
		mp -= 4;
		System.out.println("---------------------------");
		
	}
	
	public void smallPortionRed() {
		System.out.println("ü���� 15 �ö����ϴ�.");
		hp += 15;
		System.out.println("---------------------------");
		
	}
	public void smallPortionBlue() {
		System.out.println("������ 15 �ö����ϴ�.");
		mp += 15;
		System.out.println("---------------------------");
		
	}
	
	
	
	public Warrior(String name, String job, String guild, String title) {
		WarriorName = name;
		WarriorJob = job;
		WarriorGuild = guild;
		WarriorTitle = title;
			
	}
	
	public void warriorInfo() {
		System.out.println("====����â====");
		System.out.println("�̸� : " + WarriorName);
		System.out.println("���� : " + WarriorJob);
		System.out.println("��� : " + WarriorGuild);
		System.out.println("Īȣ : " + WarriorTitle);
		System.out.println("====�ɷ�ġ====");
		System.out.println("ü�� : " + pwr);
		System.out.println("��ø : " + dex);
		System.out.println("���� : " + mag);
		System.out.println("���� : " + def);
		
	
	}
	public static void main(String[] args) {
		returnRandom();
		
	}
	
	public static void returnRandom() {
		
		Random random = new Random();
		int number = random.nextInt(21);
		System.out.println(number);
	}
	
	// �����ڵ� ����� �ּ��� new() �� ����ؼ� ĳ���� �����ض�� �ṉ̀���....
	
	// �޼���
	
	// �����縦 �����Ѵ�.
	// ����â�� �ٸ缭 �� �� �ִ� ����� ����� �ּ���.
	
}
