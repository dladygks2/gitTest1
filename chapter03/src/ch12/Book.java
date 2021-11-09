package ch12;

public class Book {

	private int bookId;
	private String title;
	private String author;

	public Book() {

	}

	// alt + shift + s key => Generate Constructor using Fields 
	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	// toString �޼��� ������ �غ��� / �� �ٿ� ctrl + space key���� override ã�Ƽ�
	@Override
	public String toString() {

		return "[ å ��ȣ : " + bookId + " ]\n" + "[ å ���� : " + title + " ]\n" + "[ å ���� : " + author + "]";
	}
	// å�̸�, �۰����� ���ƾ� true
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Book) {
			Book tempBook = (Book) obj; // Object�� obj�� Book���� �ٿ� ĳ����
			// ���� ����
			if (this.title == tempBook.title && this.author== tempBook.author && this.bookId == tempBook.bookId) {
				return true;
			} else {
				return false;
			}

		}

		return false;
	}

	public static void main(String[] args) {

		Book book1 = new Book(1, "���̾�", "ȫ�浿");

		// toString()�� �������� �ʰ�, ����ϸ� �ּҰ��� ���´�.
		System.out.println(book1);
		System.out.println(book1.toString());

	}
}
