package practice211028;

public class Day06_Ch08_Person {

	/* this��
	 * 
	 * 1. �ν��Ͻ�(��ü) �ڽ��� �޸𸮸� ����Ų��.
	 * 2. �����ڿ��� �� �ٸ� �����ڸ� ȣ���� �� ����� �� �ִ�.
	 * 3. �ڽ��� �ּ�(������, �ּҰ�)�� ��ȯ ��ų �� �ִ�.
	 */
	
	String name;
	int age;
	
	public Day06_Ch08_Person(String name, int age) {
		// �ڱ� �ڽ��� ����Ű�� this
		this.name = name;
		this.age = age;
	}
	
	public Day06_Ch08_Person() {
		// �⺻ �����ڿ��� �ٸ� �����ڸ� ȣ��
		this("�̸�����",1);
		// this.name = "�̸�����";
		// this.age = 1; 
		// ���� 2�� ��ſ� ������ �� ���ִ�
	}
	
	// �ڽ��� �ּҰ�(������)�� ��ȯ��ų �� �ִ�.
	// ���� ������ ����� �� �� �ִ�.
	public Day06_Ch08_Person getDay06_Ch08_Person() {
		return this;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name + "\n���� : " + age);
	}
	
	
	//main
	public static void main(String[] args) {
		Day06_Ch08_Person person1 = new Day06_Ch08_Person();
		person1.setName("ȫ�浿");
		// �������� �޾Ƽ� �ٸ� �ν��Ͻ� ������ �ּҸ� �Ҵ��� ����.
		
		Day06_Ch08_Person person2 = person1.getDay06_Ch08_Person();
		person2.setName("�̼���");
		
		System.out.println(person1);
		System.out.println(person2);
		
		person1.showInfo();
		person2.showInfo();
		
	}
		
	
	
	
}
