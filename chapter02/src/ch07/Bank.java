package ch07;

public class Bank {
	
	// ���� ����
	// private �̶�� �������������ڸ� ����
	private int balance =0;
	
	// �޼��� ����

	// �Ա� ���
	public void deposit(int money) {
		this.balance += money;
	}

	// ��� ���
	public int withdraw(int money) {
		this.balance -= money;
		return money;
	}	
	// �ܾ� Ȯ�� ���
	public void showInfo() {
		System.out.println("���� �ܾ��� " + this.balance + "�� �Դϴ�.");
	}
		
	// getter �޼��� �����
	// ��������� �޼��带 ���ؼ� �ѱ�� ��
	// �Ϲ������� get() �޼ҵ带 ���� 
	// �ܺο��� Ȯ���� �� �ֵ��� �����Ѵ�.
	public int getBalance() {
		return this.balance;
	}
	
	// setter �޼��� �����
	// ��������� ���� ������ �� �ֵ��� �Ѵ�.
	// �׷��� �Ű� ������ int balance �� ����Ѵ�.
	// �Ϲ������� set() �޼ҵ带 �����ؼ�
	// �ܺο��� ��������� ������ �� �ֵ��� �����Ѵ�.
	public void setBalance(int balance) {
		
		if(balance <0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}else {
			this.balance = balance;
		}
		
	}
	
	
	
	
}














