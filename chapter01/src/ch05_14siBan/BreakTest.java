package ch05_14siBan;

public class BreakTest {

	public static void main(String[] args) {
		
		
		// ����� break;
		// �߰��� ���ߴ� break
		
		for(int i = 1; i < 11; i++) {
		
			System.out.println(i);
			// 1~10���� ȭ�鿡 ��� ������ ������ (%) <-- 7 ==0 �̸� ����� 
			// i == 7 -> ���� : i ������ ������ ����� 0�̸� �����
			
			if ( i % 7 ==0) {
				break;		
			}
		}	// end of for
	}	// end of main
}