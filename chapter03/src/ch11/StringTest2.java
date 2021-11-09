package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		
		// �ѹ� ������ String�� �Һ�(immutable)�̴�.
		
		// String�� �����ϸ� ������ String �� ����Ǵ� ���� �ƴ�
		// ���ο� ���ڿ��� �����ȴ�.
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));	// heap �޸��� ������(�ּҰ� ������)
		
		System.out.println("--------------------------------------");
		
		// java = java + android;
		java = java.concat(android);  // ���� ���ְڴٴ� �޼����̴�. concat
		System.out.println(java); 	// javaandroid
		
		// String�� �Һ��̱� ������ �ٲٸ� ���� ����ٰ� �����ϳ�
		System.out.println(System.identityHashCode(java));
		// String�� �޸� ���� ���ؼ� �ٸ� ����� �ַ� ���
		
		
		
	}
}
