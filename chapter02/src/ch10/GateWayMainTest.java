package ch10;

public class GateWayMainTest {

	public static void main(String[] args) {

		// �ν��Ͻ����� �����ϴ� ������ �����ϰ��� �Ѵٸ� static ������ ����

		GateWay gateway1 = new GateWay(1);
		GateWay gateway2 = new GateWay(2);
		GateWay gateway3 = new GateWay(3);

		Zealot zealot1 = gateway1.createZealot();
		Zealot zealot2 = gateway1.createZealot();
		Zealot zealot3 = gateway1.createZealot();
		Zealot zealot4 = gateway1.createZealot();
		Zealot zealot5 = gateway1.createZealot();
		Zealot zealot6 = gateway1.createZealot();
		Zealot zealot7 = gateway1.createZealot();
		Zealot zealot8 = gateway1.createZealot();
		Zealot zealot9 = gateway1.createZealot();

		gateway2.createZealot();
		gateway2.createZealot();
		gateway2.createZealot();
		gateway2.createZealot();
		gateway2.createZealot();

		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();
		gateway3.createZealot();

		zealot1.showInfo();

		// static ������ �ν��Ͻ����� ������ �� �ִ� �����̴�.
		// --> ��ü�� �������� �ʰ� Ŭ���� �̸����� ������ �����ϴ�.
		// ex) �¾�(��ü�� �����Ǳ� ���� �޸𸮿� �ö� �ִ�.)

		System.out.println("������ ������ �� : " + GateWay.zealotCount);
	}

}
