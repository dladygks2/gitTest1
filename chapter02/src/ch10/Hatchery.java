package ch10;

public class Hatchery {

	// 1. static ���� ��� : ������ ���۸��� ���� �� �� �ֵ���
	// static ������ �ν��Ͻ����� ������ �� �ִ� �����̴�.
	// --> ��ü�� �������� �ʰ� Ŭ���� �̸����� ������ �����ϴ�.
	// ex) �¾�(��ü�� �����Ǳ� ���� �޸𸮿� �ö� �ִ�.)
	public static int zerglingCount = 0;

	// 2. ������� ����
	private String hatcheryId;
	private String name;

	// 3. ������ ����
	public Hatchery(String id) {
		this.hatcheryId = id;
		name = "��ó��";
	}

	// 4. ���۸��� �����ϴ� �޼��带 ����� �ּ���.
	public Zergling createZergling() {
		System.out.println("���۸��� �����մϴ�.");
		zerglingCount++;
		return new Zergling("���۸�" + zerglingCount);
	}

}
