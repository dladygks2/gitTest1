package ch02;

import java.util.ArrayList;

import ch01.Book;

public class ArrayMainTest {

	public static void main(String[] args) {

		Book book1 = new Book(1, "�帣�� ����ó��", "�Ŀ�� �ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ ���� �Ǿ����ϴ�.", "������");
		Book book4 = new Book(4, "�������� �����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "���� �϶�");

		// ArrayList ����

		// �����͸� ���� ���� �����
		// !ArrayList�� �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		ArrayList<Book> shoppingCart = new ArrayList<Book>();
		// Ctrl Shift 'O'

		// �߰� ��� 1
		// ������ �߰��ϱ�
		shoppingCart.add(book1); // �ε��� 0
		shoppingCart.add(book2); // �ε��� 1
		shoppingCart.add(book3); // �ε��� 2
		System.out.println(shoppingCart.size());
		shoppingCart.add(book4); // �ε��� 3
		System.out.println(shoppingCart.size());
		System.out.println("1) ============");

		// ȭ�鿡 ���
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		System.out.println("2) =================");
		
		// �߰� ��� 2( �����ϴ� ���, 2�� �ε����� book5�� �ְڴ�.)
		shoppingCart.add(2, book5);

		for (Book b : shoppingCart) {
			System.out.println("b.showInfo() : ");
			b.showInfo();
		}
		System.out.println("3) =================");
		// �����ϴ� ���
		shoppingCart.remove(0);
		// foreach

		// clear : ���� ����
//		shoppingCart.clear();
		//////
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		System.out.println("4) ------------------------");
		// �����ϱ�
		shoppingCart.set(2, book1);
		// foreach ��+ Ctrl +space �����ؼ� ȭ�鿡 ���
		// foreach���� �ܼ� �ݺ����࿡ ����
		// ���� �����ؾ��ϸ� for���� ����

		for (Book book : shoppingCart) {
			book.showInfo();
		}

		// C R U D

		// create, read, update, delete

	}
}
