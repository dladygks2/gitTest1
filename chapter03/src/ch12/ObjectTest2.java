package ch12;


class Student1 extends Object{
	
	// toString(); �̹� ���ǵǾ� �ִ�. extends Object ���ٰ�
	
	@Override//(������)
	public String toString() {
		// TODO Auto-generated method stub
		return "�л� Ŭ����";
	}
	
}



public class ObjectTest2 extends Object {
	
	String str1;
	
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		System.out.println(s1);
		
		String str1 = new String("�ȳ��ϼ���");
		System.out.println(str1);
		
	}
}
