package ch11;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		// StringBuilder, StringBuffer Ȱ��
		// String�� �޸� ���� ���ϱ� ������ ��� ����ϴ� �ֵ�
		// ���������� �������� char[]�� ��� ������ ������.
		// ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� �����ϴ�.
		// StringBuffer �� ��Ƽ ������ ���α׷��ֿ��� ����ȭ�� ����
		// ���� ������ ���α׷������� StringBuilder ����ϱ⸦ ����
		
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		
		// �ּҰ��� ������� �ڵ�
		System.out.println(System.identityHashCode(builder));
		System.out.println("-------------");
		
		builder.append(android);
		
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		//���� 1) append �޼��� ����ؼ� 3�� (�ּҰ� Ȯ��)
		
		builder.append(" 1) ���� �Է��ϼ���.");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.append(" 2) �̰� �޸� �Ⱥ��ϴ� ��");
		
		// ���� 2) StringBuilder builder ��� ���� �ǰ�?
		
		// String tempStr = builder;
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
		
		
	}
}
