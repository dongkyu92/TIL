package day9;



class Book {

	String title;
	String author;
	private int price;
	// private �ַ� ��� ������ ����.
	// �ܺο��� -30000 �� ������ �����ϱ� ���� private ����

	Book() {
		/*
		 * title = " �ڹ��� ����"; author = "���� ��"; price = 30000;
		 */
		this("�ڹ��� ����", "���� ��", 30000); // ������ Ŭ������ �ִ� �ٸ� ������ ȣ�� (�ƱԸ�Ʈ ������ ���� ȣ���)
	}

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		/*
		 * if(price < 0) this.price = -price;//���� �߻�. else this.price = price;
		 */
		setPrice(price);
		// this : �ڽ��� ��ü�� �������� �ǹ��ϴ� ���ͷ� this.xxxx ���� ��� xxxx
		// this() : ������ �޼��峻������ ȣ�Ⱑ��( ������ �޼����� ù �࿡���� ȣ�� ����)
		// ���θ� �ٿ��ָ� �ٸ� �����ڸ� ȣ��(������ Ŭ���� ���� �ִ� �ٸ� �����ڸ� ȣ��)
		// break()
	}

	void setPrice(int price) {
		if (price < 0)
			this.price = -price;// ���� �߻�.
		else
			this.price = price;
	}

	String getbookinfo() { // static String getbookinfo() ����ϰԵǸ� title, author, price �����Ե�.
		// �ֳ��ϸ� �� ����������� non-static�̴ϱ�.

		String st = "å �̸� : " + title + " å ����: " + author + "���� : " + price;

		return st;

	}
}

public class BookTest {

	public static void main(String[] args) {
		Book books = new Book("�ڹ��� ����", "���ü�", -30000);
		books.setPrice(-33000);
		// books.price = -30000;

		System.out.println(books.getbookinfo());

	}

}
