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
		//parseInt ���ڿ��� ���ڷ� �ٲ�
		long l = Long.parseLong(str);
		
		// 
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		
		
		
		System.out.println(d);
		System.out.println(bool);
		
		if(Boolean.parseBoolean(str3)) {
			System.out.println("boolean ������ ���� �Ϸ�!!!");
		}
		
		// ���� 1
		
		String str10 = "1001";
		String str11 = "2001";
		
		// str10 �� str11 �� ���� �������ּ���
		
		int i1 = Integer.parseInt(str10);
		int i2 = Integer.parseInt(str11);
		
		System.out.println("i1 + i2 = " + (i1 + i2));
		System.out.println("i1 * i2 = " + (i1 * i2));
		
		System.out.println("���ڿ� byte �� ��ȯ : " + b);
		System.out.println("���ڿ� int �� ��ȯ : " + i);
		System.out.println(b);
		
	}
}
