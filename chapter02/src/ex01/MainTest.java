package ex01;

public class MainTest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Warrior warriorA =  new Warrior("���ѳ�", "��Ŀ", "destroy��", "��ȣ����");
				
		warriorA.attack();
		warriorA.attack();
		warriorA.skill1();
		warriorA.smallPortionBlue();
		warriorA.smallPortionRed();
		warriorA.skill2();
		warriorA.smallPortionBlue();
				
		Wizzard wizzardA = new Wizzard("�� ����", "������","HarryPoter","�Ҳɹ���");
		
		wizzardA.attack();
		wizzardA.skill1();
		wizzardA.skill2();
		wizzardA.smallPortionBlue();
		wizzardA.skill3();
		wizzardA.smallPortionBlue();
		wizzardA.skill4();
		
		
		warriorA.warriorInfo();
		
		wizzardA.wizzardInfo();
		
	}

}
