package ch11;

public class Company {
	
	// �̱������� ����, ����
	
	// 1. �����ڸ� private �� �����.
	private Company() {
		
	}
	
	// 2. static ������ Ȱ���ؼ� ���ο��� ��ü�� �����Ѵ�.
	private static Company instance = new Company();
	
	// ���ڸ��� �ּҰ��� �Ҵ�ȴ�????
	// instance�� ������ ������� ��
	
	
	// 3. �ܺο��� ������ �ν��Ͻ��� ������ �� �ִ� public method�� �����ؾ� �Ѵ�.
	public static Company getInstance() {
		// ����� �ڵ� 
		return instance;
	}
	
	
	
}
