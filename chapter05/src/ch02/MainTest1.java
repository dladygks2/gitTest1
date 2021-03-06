package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		// 1. ThreeDPrinter1 -> 객체 생성
		// setter 메서드 사용할 때 Powder가 메모리에 올라가 있어야한다.

		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();

		// 재료
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

		// 1. 재료세팅
		printer3.setMaterial(powder);

		// 자료를 꺼내보세요.
		System.out.println(printer3.getMaterial());
		System.out.println("3=============");
		// 요청 : 변수에 ThreeDPrinter3의 재료를 저장해주세요.
		// 변수명 : temp1
		
		Powder temp1 = (Powder)printer3.getMaterial(); 
		
		// 질문 
		System.out.println(printer3);
		
		
	}// end of main
}// end of class
