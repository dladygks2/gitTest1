package ch01;

public class ArrayMainTest {
	// void = return�� �ʿ�... �����ʳ�
	public static void main(String[] args) {

		/*
		 * �迭(array) ������ �����͸� ��Ƽ� ������ �����ϱ� ���ؼ� ����ϴ� ������ Ÿ��
		 * 
		 * ������ �ϳ��� �����͸� �����ϱ� ���� ���̶�� 
		 * �迭�� ���� ���� �����͸� �ϳ��� ������ �����ϱ� ���� ���̶�� �� �� �ִ�.
		 * 
		 * �� ������ �ڷ����� ������ �ڷ� ���� 
		 * �� �ε��� ������[]�� �̿��Ͽ� ���� ������ ���� 
		 * �� ������ ��ġ�� ���� ��ġ�� ���� 
		 * �� �迭�� ������ 0���� ���� 
		 * �� �ڹٿ����� ��ü �迭�� ������ ArrayList�� ���� Ȱ����
		 * 
		 */
		int number = 10;

		// �迭 ���� ���
		// 1
		int[] arr1 = new int[3]; // [3] : 3ĭ�� ���� ���̴�. 0~2

		// 2
		int arr2[] = new int[10]; // [789] : ������ �ε����� '788'�̴�.

		/////////////////////
		// ���� �����ϴ� ���, �ʱ�ȭ �ϴ� ���
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;

		// index �� = n-1

		// �迭�� ����� ���ÿ� �ʱ�ȭ
		int[] numbers1 = new int[] { 11, 20, 30 };
		int[] numbers2 = { 10, 50, 100 };

		// ��� ���
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);

		// crud : create / r /u /delete ???

		System.out.println(numbers1);

		//
		String[] strArr1 = new String[10];
		strArr1[0] = "�߽���";
		strArr1[1] = "Ƽ��";
		strArr1[2] = "�ֽ�";
		strArr1[3] = "�ٸ��콺";

		// 1. ȭ�鿡 0,1,2,3 ������ּ���. �� for�� ������
		System.out.println(strArr1[0]);
		System.out.println(strArr1[1]);
		System.out.println(strArr1[2]);
		System.out.println(strArr1[3]);

		System.out.println(strArr1.length);

		// �ڵ� ���� null ���� ������� ������
		for (int i = 0; i < strArr1.length; i++) {
			if (strArr1[i] != null) {
				System.out.println(i + " �ε����� " + strArr1[i]);
			} // end of if

//				else{
//				System.out.println(i + "�ε����� �Էµ� ���� �����ϴ�.");
//				}

		} // end of for

		/*
		 * ��� ���α׷� ������ index�� 0���� �����մϴ�. �迭�� ����� �� ���� for���� �����ؼ� ���� ����մϴ�.
		 */
//		new int[22]; // ���� = 22, index = 21
//		new int[74]; // ���� = 74, index = 73
//		new int[283]; // ���� = 283, index = 282

	}// end of main

}// end of class