package practice211028;

public class Day04_StudentMainTest2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		// Student Ŭ������ �̿��ϴ� student1�̶�� ��ü�� ������̴�.
		// new �޼ҵ�� �޸𸮿� �ڸ��� ������̴�. 
		// �� �ڸ��� StudentŬ������ ����ϴ� ���̴�.
		
		/*1. �����ؼ� name,height, weight,  grade
		 * ���� �༭ ȭ�鿡 ������ּ���. 
		 */
		
		student1.height = 174.5;
		student1.weight = 74;
		student1.grade = 5;
		student1.name = "ȫ�浿";
		
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		System.out.println(student1.name);
		System.out.println("============");
		
		
		Student student2 = new Student();
		
	}
}
