package ch04;

public class Subway {

	int subwayHoseon;
	int passengerNumber;
	int money;

	public Subway(int subwayHoseon) {
		this.subwayHoseon = subwayHoseon;
	} 

	public void SuIck(int money) {
		this.money += money;
		passengerNumber++;
	}
 
	public void showInfo() {
		System.out.println(
				"����ö " + subwayHoseon + "ȣ���̰�,\n " 
		+ "���� " + passengerNumber + " ���̰�\n " 
		+ "���� ���ͱ��� " + money + "�Դϴ�.");
	}

}
// Ctrl Shif 'F' = ��������