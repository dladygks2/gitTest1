package ch06;


import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	static final int LOTTO_NUM_SIZE = 6;
	
	// �ζ� ��ȣ�� �����ϴ� ��� (6�ڸ�)
	
	public int[] getLottoNumber() {
		// ��ȣ�� ���� ���� �����
		int[] numbers = new int[LOTTO_NUM_SIZE];
		
		// 
		Random random = new Random();
		
		for (int i = 0; i < LOTTO_NUM_SIZE ; i++) {
			
			numbers[i] = random.nextInt(45) +1;
			
			for (int j = 0; j < i ; j++) {
				
				if(numbers[i] == numbers[j]) {
					i = i -1;
					System.out.println("���� �� �߻�");
					break;
				}
			}
			
		}
		
		
		// �迭 ����
		Arrays.sort(numbers);
		
		
		
		return numbers;
	}
	
	// �׽�Ʈ �ڵ�
	public static void main(String[] args) {
		
		LottoNumber lottoNumber = new LottoNumber();
		int[] nums = lottoNumber.getLottoNumber();
		for (int i : nums) {
			System.out.print(i + "\t");
		}
		
	}
	
}