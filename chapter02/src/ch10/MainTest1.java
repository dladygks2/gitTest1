package ch10;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("����1");
		Zealot zealot2 = new Zealot("����2");

		Marine marine1 = new Marine("����1");
		Marine marine2 = new Marine("����2");

		Zergling zergling1 = new Zergling("���۸�1");
		Zergling zergling2 = new Zergling("���۸�2");

//		zealot1.showInfo();
//		marine1.showInfo();
//		zergling1.showInfo();

		System.out.println("===== ���� ====");

		zealot1.attack(marine1);

		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);
		zealot1.attack(marine1);

		marine1.showInfo();

		zealot1.attack(zergling1);
		zealot1.attack(zergling1);
		zealot1.attack(zergling1);

		zergling1.showInfo();

		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);
		marine1.attack(zealot1);

		zealot1.showInfo();

		// ���� ���۸�, ����, ���� ü���� 0 �Ǵ� ���϶�� ����߽��ϴ�.
		// ������

		
		//
		System.out.println("-----------------------");
		System.out.println("������");
		System.out.println(1);
		System.out.println(0.5);
		System.out.println('A');
		
		// �޼��� �����ε�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main

} // end of class
