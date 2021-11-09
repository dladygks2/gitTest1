package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		// 8 + "" --> String
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		//parseInt 문자열을 숫자로 바꿈
		long l = Long.parseLong(str);
		
		// 
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		
		
		
		System.out.println(d);
		System.out.println(bool);
		
		if(Boolean.parseBoolean(str3)) {
			System.out.println("boolean 형으로 변경 완료!!!");
		}
		
		// 문제 1
		
		String str10 = "1001";
		String str11 = "2001";
		
		// str10 과 str11 을 덧셈 연산해주세요
		
		int i1 = Integer.parseInt(str10);
		int i2 = Integer.parseInt(str11);
		
		System.out.println("i1 + i2 = " + (i1 + i2));
		System.out.println("i1 * i2 = " + (i1 * i2));
		
		System.out.println("문자열 byte 값 변환 : " + b);
		System.out.println("문자열 int 값 변환 : " + i);
		System.out.println(b);
		
	}
}
