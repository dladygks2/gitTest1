package ch07;

public class MaintTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		// ��� ������ ���� Ȯ��
		// int balance --> 0
		// double balance --> 0.0
		// String --> null
		
		bank.deposit(10_000);
		
		bank.showInfo();
		
		// ����� �մϴ�.
		int money = bank.withdraw(5_000);
		
		System.out.println("���� ���� �ݾ� : " + money);
		bank.showInfo();
		
		// ������ �Ǽ��� ��� ������ �ٷ� �����ؼ� �ܾ��� ���� ��
		// bank.balance = 100_000;
		// bank.showInfo();
		
		//
		// getter, setter 
		// read only 
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		// setter = read only �� �ݴ븻
		// setter ����غ���
		bank.setBalance(-10000);
		bank.showInfo();
		
		/*
		 * ���� ���� ������
		 * (4���� ������ �ִ�.)
		 * 
		 * public - ������ ������ ����ϰ� �Ѵ�.
		 * 				public Ŭ������ .java ���� �ȿ� �� �ϳ��� ����� �� �ִ�.
		 * 
		 * default - ������� �տ� �ƹ��͵� ���� �ʴ� ��. 
		 * 				���� ��Ű�� ������ ������ ����Ѵ�.
		 * 
		 * protected - ��Ӱ��迡�� ������ ����Ѵ�.
		 * 
		 * private - ���� Ŭ���������� ������ ����Ѵ�.
		 * 
		 */
		
		
		
		
		
		
	}

}
