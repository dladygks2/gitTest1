package practice211028;

public class Day06_Ch09_NumberPrinter {

	private int id;
	private int waitNumber = 1;
	
	public Day06_Ch09_NumberPrinter(int id) {
		this.id =id;
	}
	
	// ��ȣǥ�� ��� �ּ���
	public void printWaitNumber() {
		System.out.println(id + " ����� ������ : " + waitNumber);
		waitNumber ++;
	}
	
	
}
