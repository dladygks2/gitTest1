package ch05_14siBan;
import java.util.Scanner;
public class IFMainTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int point = sc.nextInt();
		char result='Z';
		 //if else if else
		//1. 100������ �����鼭 90������ ũ�ų� ������ A
		//2. 90������ �����鼭 80������ ũ�ų� ������ B
		//3. 80������ �����鼭 70������ ũ�ų� ������ B
		//4. �� ���� �ش���� ������ F 
		//5. "����� ������ ? �Դϴ�." ���

		if(point<=100 && point>90) {
			result='A';
		}else if(point<=90 && point>80) {
			result='B';
		}else if(point<=80 && point>70) {
			result='C';
		}else if(point<70 && point>=0) {
			result='F';
		}else {
			System.out.println("�߸��� �Է��Դϴ�");
		}
		if(result!='Z') {
		System.out.println("����� ������ "+result+" �Դϴ�");
		}
	}

}
