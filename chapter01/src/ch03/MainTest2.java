package ch03;
import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		//���� ������
		//���ǽ� ? ���1:���2
	int num1 = (5<3) ? 10 : 20;
	System.out.println(num1);
	System.out.println("--------------------------------");
	// JDK�� ������� ������ �̿��غ���
	int max;
	System.out.println("�Է� ���� �� ���� �� ū ���ڸ� ���");
	Scanner scanner=new Scanner(System.in);
	System.out.println("�Է�1: ");
	int x =  scanner.nextInt();
	
	System.out.println("�Է�2: ");
	int y = scanner.nextInt();
	
	max = (x>y)?x:y;
	System.out.println("ū ���ڴ�: "+max+" �Դϴ�");
	
	}

}
