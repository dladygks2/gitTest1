package ex01;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("����");
		Marine marine1 = new Marine("����1");
		Zergling zergling1 = new Zergling("���۸�1");
		
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
	
		zealot1.attack(zergling1);
		zealot1.attack(marine1);
		
		marine1.showInfo();
		zergling1.showInfo();
		
		// ��ĳ�ʸ� ����ؼ� ������ �帧�� ����� ������.
		// 1. ������ ������ �����Ѵ�.
		// 2. ������ ���۸��� �����Ѵ�.
		// 3. ���۸��� ������ �����Ѵ�.
		
		System.out.println("�Է� : ");
		Scanner sc = new Scanner(System.in); 
		int input = sc.nextInt();
		
		// ��� ����غ���
		final int ZEALOT_ATTACK =1;
		final int MARINE_ATTACK =2;
		final int ZERGLING_ATTACK =3;
		
		
		if(input == ZEALOT_ATTACK) {
			// ������ ������ ����
			zealot1.attack(marine1);
		}else if(input ==MARINE_ATTACK) {
			// ������ ���۸��� ����
			marine1.attack(zergling1);
		}else if(input == ZERGLING_ATTACK) {
			// ���۸��� ������ ����
			zergling1.attack(zealot1);
		}else {
			System.out.println("1, 2, 3 �߿��� �Է�");
		}
		
		/*Scanner sc = new Scanner(System.in);
		 * boolean gameOver = false;
		 * int userInput = 0;
		 * while (!(gamaOver)){
		 *	System.out.println("������ ������ ����");
		 */
		// System.out.println("2.");
		
		
		
		// --> 1 2 3 <--
		// --> 1 2 3 <--
		
	} // end of main
}	//end of class
