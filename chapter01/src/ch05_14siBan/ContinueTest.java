package ch05_14siBan;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		
		// ����� continue
		// �����ϰ� �����ϴ� continue
		// ��ĳ�� �̿��ؼ� MAX��, MULTIPLE�� �޾Ƽ� ���α׷��� �ϼ��� �ּ���.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("MAX : ");
		final int MAX = scanner.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("MULTIPLE : ");
		final int MULTIPLE = scanner2.nextInt();
		
		
		final int MIN = 21;
						
		int num;
		int count =0;
		
		for(num = MIN; num <MAX ; num++) {
			// 3�� ����̸� ������� ���ÿ�.
			if(num % MULTIPLE == 0) {
				count ++;
				continue;		// 3�� ����̸� �н��Ѵ�. ������ ���� �ʰ� �ٷ� for()���� ó������ ��.
			} // end of if
			
			
			
		}	// end of for
		
		// System.out.println("��� �� : " + num);
		System.out.println(MULTIPLE + "�� ����� ���� : " + count);
		
	}		// end of main function

}		// end of class 
