package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		// 1. ThreeDPrinter1 -> ��ü ����
		// setter �޼��� ����� �� Powder�� �޸𸮿� �ö� �־���Ѵ�.

		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();

		// ���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		printer1.setMaterial(powder);
		printer2.setMaterial(plastic);
		
		
//		System.out.println(printer1.toString());
		System.out.println(printer1.getMaterial());
		System.out.println("1 =============");

		System.out.println(printer2.getMaterial());
		System.out.println("2 =============");

		ThreeDPrinter3 printer3 = new ThreeDPrinter3();

		// 1. ��Ἴ��
		printer3.setMaterial(powder);

		// �ڷḦ ����������.
		System.out.println(printer3.getMaterial());
		System.out.println("3=============");
		// ��û : ������ ThreeDPrinter3�� ��Ḧ �������ּ���.
		// ������ : temp1
		
		Powder temp1 = (Powder)printer3.getMaterial(); 
		
		// ���� 
		System.out.println(printer3);
		
		
	}// end of main
}// end of class
