package ch05;

public class MainTest3 {

	public static void main(String[] args) {
		// ������ : �迭(�ڷᱸ��) ���迡���� ��밡��
		// �ϳ��� ������ ������ �����͸� ������ �����ϱ� ���ؼ� ���

		// 1.
		Banana banana1 = new Banana();
		Banana banana2 = new Banana();

		Banana[] bananaBucket = new Banana[2];
		bananaBucket[0] = banana1;
		bananaBucket[1] = banana2;

		// foreach�� �Ἥ . �ٳ����� showInfo() ȣ��
//		for (Banana banana : bananaBucket) {
//			banana.showInfo();
//			System.out.println("-------------");
//		}

		// 2.
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();

		// �迭����ؼ� ����ּ���
		// �迭�� 2ĭ

		Peach[] peachBucket = new Peach[2];
		peachBucket[0] = peach1;
		peachBucket[1] = peach2;

		for (Peach peach : peachBucket) {
			peach.showInfo();
			System.out.println("---------------");
		}

		// 3. �������� ����Ѵٸ�
		Fruits[] fruitsBucket = new Fruits[4];
		fruitsBucket[0] = banana1;
		fruitsBucket[1] = peach1;
		fruitsBucket[2] = banana2;
		fruitsBucket[3] = peach2;

		for (Fruits fruits : fruitsBucket) {
			fruits.showInfo();
		}

	}
}
