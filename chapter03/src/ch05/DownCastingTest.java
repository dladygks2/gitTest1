package ch05;

public class DownCastingTest {
	
	public static void main(String[] args) {
		
		// 1. �ٳ����� origin ��� ������ �߰�
		
		Fruits fruit = new Banana();		// �� ĳ���� ����
		
		// �ٿ� ĳ������ ���� �˾ƾ� �ϴ� ����;
		
		// �����Ϸ��� �θ�Ÿ�� �ν��Ͻ� ���� Ÿ���� 
		// �ٶ󺸰� �ִ� �����̴�.
		
		// �ٿ� ĳ������ ����Ѵٸ� ����
		// (�����Ϸ����� �ڽ� ��ü Ÿ������ �ٶ� ����� ����ϴ� ��)
		String origin = ((Banana)fruit).origin;
		System.out.println("������ : "+ origin);
		
		
		
		
		
		// ������ Ÿ��
		//	: ����� �ۼ��� �ڵ带 ����� ��ȯ��Ű�� ����
		
		
		// ��Ÿ��
		// : ���α׷��� �����ϴ� ����
	}	// end of main

}	// end of class 
