package ch03;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		// ����ó��
		// try - catch��
		
		// ���ܸ� �߻����� ����.
		
		int[] arr = {1,2,3,4,5};
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);	// runtime exception�� �߻��Ѵ�. �迭�� ������ ���
//		}
//		
		
		try {
			// ���ܰ� �߻��� �ڵ带 try���� �ۼ��� �մϴ�.
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e);
			System.out.println("���ܰ� �߻���!!!");
		}
				
		System.out.println("������ ������� �ʾҽ��ϴ�.");
		
		// ���α׷����� ������� �ʰ� ��� ����Ǿ�����.
		// (����ó���� �߿����. �ٿ���� �ʰ� ���α׷��� ����ǵ��� ��.)
	
		
		
	}
}
