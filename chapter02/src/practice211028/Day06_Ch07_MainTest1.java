package practice211028;

public class Day06_Ch07_MainTest1 {

	public static void main(String[] args) {
		
		Day06_Ch07_Bank bank = new Day06_Ch07_Bank();
		// ��� ������ ���� Ȯ��
		// int balance --> 0
		//double --> 0.0
		// String --> null
		
		bank.deposit(10_000);
		bank.showInfo();
		
		// ��ݱ��
		bank.withdraw(5_000);
		//System.out.println("�������� �ݾ� : " + money);
		bank.showInfo();
		
		/* ������ �Ǽ��� ��� ������ �ٷ� �����ؼ� �ܾ��� ������
		 * bank.balance = 100_000;
		 */
		// bank.balance = 100_000;
		bank.showInfo();
		
		// 
		// getter, setter
		// read only
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		//setter ����غ���
		bank.setBalance(-10000);
		bank.showInfo();
		
		// ���� ���� ������
		/*
		 * public - ������ ������ ����ϰ� �Ѵ�.
		 * default - ���� ��Ű�� ������ ������ ����Ѵ�.
		 * protected - ��Ӱ��迡�� ������ ����Ѵ�.
		 * private - ���� Ŭ���������� ������ ����Ѵ�.
		 */
	}
}
