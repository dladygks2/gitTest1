package ch04;

public class UserInfo {
	
	// ��� ������ ����
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	

	
	// Alt Shift S �� ������ - �ڵ���ȭ���� ����- generate constructor using fields �� ����
	
		
//	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
//		super();
//		this.userId = userId;
//		this.userPassWord = userPassWord;
//		this.userName = userName;
//		this.userAddress = userAddress;
//		this.phoneNumber = phoneNumber;
//	}
	// �����ڰ� ������ �����Ϸ��� �˾Ƽ� �⺻�����ڸ� ���� �׷��� �ϳ��� ������ �־��ָ�
	// �����Ϸ��� �־����� �ʴ´�.
	
	// ������ �����ε� : ������ �ϳ��� ������ �����ڸ� ����� ���� �����ε��̶���Ѵ�. 
	// �߿�! �����ڴ� ��ü�� ������ ��, ó�� ����Ǵ� �ڵ��Դϴ�.
	
	
	
	// 1. �⺻ �����ڸ� ����� �ּ���.
	public UserInfo() {
		
	}
	// 2. userId �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId) {
		this.userId = userId;
	}
	// 3. userId, userPassword �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
	// 4. userId, userPassword, userName �� �޴� �����ڸ� ����� �ּ���.
	public UserInfo(String userId, String userPassWord, String userName) {
	this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	// 5. userId, userPassword, userName, userAddress
	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
	this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	// 6. userId, userPassword, userName, userAddress,phoneNumber
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	
}
