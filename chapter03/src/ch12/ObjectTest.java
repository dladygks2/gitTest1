package ch12;

// ���� ����ϴ� �⺻ Ŭ�������� ���� ��Ű��
import java.lang.*;

class Student extends Object{
	
	// toString();
	// override : ������ , ctrl + space �� override�� ã��???
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�л�Ŭ����";
	}
	
	
}





public class ObjectTest extends Object {

	// Object �� ������� �ʴ��� �⺻������ ������ ���� Ŭ�����̴�.
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1);
		
		String str1 = new String("�ȳ��ϼ���.");
		System.out.println(str1);
		
		
	}		// end of main
}
