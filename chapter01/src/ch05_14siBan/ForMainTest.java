package ch05_14siBan;

public class ForMainTest {
	
	
	// main function 
	public static void main(String[] args) {
		
		/*		/** :������ �ּ�
		 *     
		 *     for(�ʱ�ȭ�� ; ���ǽ�; ������){
		 *     
		 *     		���๮;
		 *     
		 *     }
		 * 
		 * 
		 */

		// for ���� �̿��ؼ� 1���� 10���� ���� ����
		// ���꿡 ���� ����� ���ؼ� ������ �ʿ��ϴ�.
		
		int sum = 0;
		for(int i = 1; i <= 10 ; i++){
			
			// sum = sum + i;
			
			// ���մ��� ������
			sum += i;
			System.out.println("i�� ���簪 : " + i);
			
			
		} // end of for
		System.out.println("-----------------");
		System.out.println("sum : " + sum);
		
		
		
	}	// end of main 

}	// end of class
