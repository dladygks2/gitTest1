package ch01;

public class MainTest1 {

	public static void main(String[] args) {


		Order order1 = new Order();
		// ��� ������ Ư�� : �ʱⰪ�� ������. int���� 0, ����Ÿ�Կ��� ��ü �Է¾����� �� �ʱⰪ : null
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		System.out.println("----------------------------");
		
		// 1. order1 ���� �ְ� ȭ�鿡 ���
		
		order1.orderId = "0000001";
		order1.buyerId = "GuMeaJa";
		order1.sellerId = "PanMeaJa";
		order1.productId = 1000001;
		order1.orderDate = "2021�� 10�� 21��";
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		System.out.println("----------------------------");
		
		UserInfo userInfo1 = new UserInfo();
		// 2. userInfo1 �� �ְ� ȭ�鿡 ���

		userInfo1.userId = "Korea IT";
		userInfo1.userPassWord = "qwerty";
		userInfo1.userName = "Bush";
		userInfo1.userAddress = "USA";
		userInfo1.phoneNumber = "010-1234-5678";
		
	
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userPassWord);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userAddress);
		System.out.println(userInfo1.phoneNumber);
		
	}

}
