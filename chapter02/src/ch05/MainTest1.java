package ch05;

public class MainTest1 {

	public static void main(String[] args) {

		// ���� �����
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		
		
		// �л� �����
		Student student1 = new Student("ȫ�浿", 10_000);
		Student student2 = new Student("�߽���", 50_000);
		Student student3 = new Student("Ƽ��", 20_000);
		
		// 10000 ���� 10_000 �� �������� ����. �Ȱ��� 10000
		
		// Subway
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		System.out.println("------------- ��� -------------");
		System.out.println();
		
		// ó�� �л����� ���� ��
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		System.out.println("������ ó�� �л����� ���� ����");
		
		
		
		// �л��� ������ ź��.		
		student1.takeBus(bus300);
		
		// �л��� ����ö�� ź��.
		student1.takeSubway(subway2);
		
		// ����â Ȯ��
		student1.showInfo();
		
		student2.takeSubway(subway3);
		student2.takeBus(bus300);
		student2.takeBus(bus100);
		student2.takeSubway(subway2);
		
		student3.takeBus(bus100);
		student3.takeBus(bus200);
		student3.takeSubway(subway1);
		
		
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		 
		
		//
		System.out.println("----------");
		bus100.showInfo();
		bus200.showInfo();
		bus300.showInfo();
		
		System.out.println("----------");
		subway1.showInfo();
		subway2.showInfo();
		subway3.showInfo();
		
		
		System.out.println("----------");
		System.out.println("----- �ϱ��� ------");
		System.out.println("----------");
	
	
	}

}
