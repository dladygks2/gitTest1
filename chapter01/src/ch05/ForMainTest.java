package ch05;

public class ForMainTest {
	public static void main(String[] args) {
		int sum=0;
				
		/*
         *
		 * 		for(�ʱ�ȭ��; ���ǽ�; ������){
		 * 				���๮;
		 *		 }
		 *
		 */
		
		// for ���� ����ؼ� 1���� 10���� ���� ����
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println("i ��: "+i);
		
		}
		System.out.println("�հ�: "+sum);

		
		
		
	}

}
