package ch12;

public class MainTest1 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "���̾�", "�츣�� �켼1");
		Book book2 = new Book(1, "���̾�", "�츣�� �켼2");
		
		System.out.println(book1 == book2);
		System.out.println(book1);
		
		boolean result = "a".equals("a");
		System.out.println(result);
		System.out.println("a" == "a");
		System.out.println("=--==========-=-=");
		
		
		// equals �޼��带 ������  �ߴ�. ( book Ŭ���� �ȿ���)
		// equals �� �⺻ ������ ���� �ּҰ��� ���� �ֵ��ΰ��� �Ǵ�
		if (book1.equals(book2)) {
			System.out.println("���� å�Դϴ�.");
		} else {
			System.out.println("�ٸ� å�Դϴ�.");
		}
		
		/*
		 * ��ü���� �ٽɰ��� 
		 * 
		 * �̰� ������...201101 1532
		 * 
		 * �����ε� : ���� �̸����� �ٸ� ����� ����?
		 * ������ : �����ϰ� Ȯ�强�ִ� �ڵ� 
		 * ��� : ���� �ڵ尡 ���̰� ���Ҿ� ������� ����� ����
		 * �߻�Ŭ���� 
		 * �������̽�
		 * 
		 * 
		 */
		
		
		
	}
}
