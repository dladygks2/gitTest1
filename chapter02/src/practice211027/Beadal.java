package practice211027;

public class Beadal {
	
	public String BeadalNum;
	public String PhoneNum;
	public String BeadalAddress;
	public int Day;
	public int Time;
	public int Price;
	public int MenuNum;
	
	
	public Beadal(String BeadalNum, String PhoneNum, String BeadalAddress, int Day, int Time, int Price, int MenuNum) {
		this.BeadalNum = BeadalNum;
		this.PhoneNum = PhoneNum;
		this.BeadalAddress = BeadalAddress;
		this.Day = Day;
		this.Time = Time;
		this.Price = Price;
		this.MenuNum = MenuNum;
	}
	
	public String showUserInfo() {
		return "�ֹ���ȣ : " + BeadalNum + "\n��ȭ��ȣ : " + PhoneNum + "\n�ּ� : " + BeadalAddress 
				+ "\n��¥ : "+ Day +"\n�ð� : " + Time + "\n���� : " + Price + "\n�ֹ��޴� : " + MenuNum;
		
	}

}
