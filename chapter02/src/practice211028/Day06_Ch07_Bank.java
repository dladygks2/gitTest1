package practice211028;

public class Day06_Ch07_Bank {
	
	// ���� ����
	private int balance;
	
	// �޼���
	
	// �Ա� ���
	public void deposit(int money) {
		this.balance += money;
	}
	
	// ��� ���
	public int withdraw(int money) {
		this.balance -= money;
		return money;
	}
	
	// �ܾ� Ȯ��
	public void showInfo() {
		System.out.println("���� �ܾ��� " + this.balance + "�� �Դϴ�." );
	}
	
	// getter �޼��� �����
	// �Ϲ������� get() �޼��带 ���� �ܺο��� Ȯ���� �� �ֵ��� �����Ѵ�.
	// ������ get�ϴ� �޼���
	public int getBalance() {
		return this.balance;
	}
	
	// setter �޼��� �����
	// �Ϲ������� set() �޼��带 �����ؼ� �ܺο��� ��� ������ ������ �� �ֵ��� 
	// �����Ѵ�.
	public void setBalance(int balance) {
		if(balance <0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}else {
			this.balance = balance;
		}
	}

}
