package ch03;

public class MainTest1 {
	//�����Լ�(�ڵ��� ������)
	public static void main(String[] args) {

		//��������(&&, ||) ���ۼ�Ʈ. ��Ƽ�� ��
		//���� �����ڿ� ȥ���Ͽ� ���� ����Ѵ�
		//������ ����� true, false 
		
		int num1 = 10;
		int num2 = 20;
		
		//1. �� ��            true      &&      true -> �� �� True = True
		boolean flag1 = (num1>0)&&(num2>0);
		System.out.println(flag1);
		
		boolean flag2 = (num1>0)&&(num2<0);
		System.out.println(flag2);
		
		//2. �� ��  -> �� �� �ϳ��� True = True
		boolean flag3 = (num1<0)||(num2>0);
		System.out.println(flag3);
		
		boolean flag4 = (num1<0)||(num2<0);
		System.out.println(flag4);
		
		//3. ����
		boolean flag5=!(true);
		System.out.println(flag5);
		
		//
		
	}// end of main
}// end of class
