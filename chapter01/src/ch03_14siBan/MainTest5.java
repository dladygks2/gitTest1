package ch03_14siBan;

public class MainTest5 {
	// �����Լ�
	public static void main(String[] args) {
		// �� ������ (&&, ||)(���ۼ�Ʈ, ��Ƽ�� ��)(����, ����)
		// ���� �����ڿ� ȥ���Ͽ� ���� ����
		// ������ ����� true, false
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. ����(&&)
		
		boolean flag1 = (num1 > 0 ) && (num2 > 0 );
		
		boolean flag2 = (num1 >0 ) && (num2<0);
		// �Ѵ� true(��)�� ��, true�� ��ȯ�Ѵ�.
		
		System.out.println(flag1);
		System.out.println(flag2);
		
		// 2. ����(||)
		
		boolean flag3 = (num1 < 0) || (num2>0);
		
		boolean flag4 = (num1 > 0) || (num2 > 0);
		// �� �߿� �ϳ��� true�̸�, ������ ����� true�� ��ȯ�Ѵ�.
		
		System.out.println(flag3);
		System.out.println(flag4);

		System.out.println("---------------------------------");

		// num1 = 10
		// num2 = 20
		
		boolean flag5 = (num1 < 0 ) && (num2 > 0 );
		// num1 ���� �̹� false �̹Ƿ� num2�� �����ʰ� �ٷ� false ���
		// short circuit evaluation �̶���
		
		boolean flag6 = (num1 > 0 ) || (num2 > 0 );
		// num1 �̹� true �̹Ƿ� num2�� �����ʰ� �ٷ� true ���
		// �굵 short circuit evaluation �̴�.
		
		System.out.println("==================");
		
		
		
		
		
	}	// end of main

} // end of class
