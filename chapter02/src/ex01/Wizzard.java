package ex01;

public class Wizzard {
 
	// ��� ����
	// hp, power, name
	String WizzardName;
	String WizzardJob;
	String WizzardGuild;
	String WizzardTitle;
	
	int hp = 10;
	int mp = 30;
	
	int pwr = 10;
	int dex = 15;
	int mag = 30;
	int def = 5;
	
	// �����ڵ� ����� �ּ���. 
	
	// ������ �����ε�

	// WizzardSkill
		public void attack() {
			System.out.println("�⺻ ����");
			System.out.println(pwr*2 + "�� �������� �־����ϴ�.");
			System.out.println("---------------------------");
			
		}
		public void skill1() {
			System.out.println("���̾� ��");
			System.out.println(mag*10 + "�� �������� �־����ϴ�.");
			System.out.println("10 mp�� ����Ͽ����ϴ�.");
			mp -= 10;
			System.out.println("---------------------------");
			
			
		}
			
		public void skill2() {
			System.out.println("���� �Ƹ�");
			System.out.println(mag*3 + "�� ������ ����Ͽ����ϴ�.");
			System.out.println("7 mp�� ����Ͽ����ϴ�.");
			mp -=7;
			System.out.println("---------------------------");
			
		}
		public void skill3() {
			System.out.println("�� ���̾�");
			System.out.println(mag*30 + "�� �������� �־����ϴ�.");
			System.out.println("25 mp�� ����Ͽ����ϴ�.");
			mp -= 25;
			System.out.println("---------------------------");
			
		}
		public void skill4() {
			System.out.println("���̾� ���Ǿ�");
			System.out.println(mag*20 + "�� �������� �־����ϴ�.");
			System.out.println("17 mp�� ����Ͽ����ϴ�.");
			mp -= 17;
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
		
		// �갡 ������ �ΰ�
		public Wizzard(String name, String job, String guild, String title) {
			WizzardName = name;
			WizzardJob = job;
			WizzardGuild = guild;
			WizzardTitle = title;
			
			// this.name = name; 
			// ���� ������ �ؾ� �߳�. 
		}
		
		public void wizzardInfo() {
			System.out.println("====����â====");
			System.out.println("�̸� : " + WizzardName);
			System.out.println("���� : " + WizzardJob);
			System.out.println("��� : " + WizzardGuild);
			System.out.println("Īȣ : " + WizzardTitle);
			System.out.println("====�ɷ�ġ====");
			System.out.println("ü�� : " + pwr);
			System.out.println("��ø : " + dex);
			System.out.println("���� : " + mag);
			System.out.println("���� : " + def);
			
		
		}
	// �޼���
	
	// ���縦 �����Ѵ�.
	// ����â�� �ٸ缭 �� �� �ִ� ����� ����� �ּ���.
		
}
