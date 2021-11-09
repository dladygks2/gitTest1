package ch05;

class BankAccount{
	
	private int money = 100_000;
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		
		if(money <= 0) {
			System.out.println("�߸��� �Է�");
		}else {
			this.money += money;
		}
	}
	
	public synchronized void saveMoney(int money) {
		
		int currentMoney = getMoney();		// ���� ������ִ� ��
		System.out.println("�޼��� ���� Ȯ�� 1 : saveMoney");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(currentMoney + money);
		System.out.println("�Ա� �� ���� �ܾ� : " + getMoney());
		
	}
	
	public void withdrawMoney(int money) {
		
		int a = 100;
		
	}
	
}