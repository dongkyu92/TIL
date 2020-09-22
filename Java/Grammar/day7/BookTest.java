package day7;

class Book {

	String title;
	String author;
	int price;

	Book() {
		/*title = " �ڹ��� ����";
		author = "���� ��";
		price = 30000;
		*/
		this("�ڹ��� ����", "���� ��", 30000); // ������ Ŭ������ �ִ� �ٸ� ������ ȣ�� (�ƱԸ�Ʈ ������ ���� ȣ���)
	}

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		// this :  �ڽ��� ��ü�� �������� �ǹ��ϴ� ���ͷ� this.xxxx ���� ��� xxxx
		// this() : ������ �޼��峻������ ȣ�Ⱑ��( ������ �޼����� ù �࿡���� ȣ�� ����)
		// ���θ� �ٿ��ָ� �ٸ� �����ڸ� ȣ��(������ Ŭ���� ���� �ִ� �ٸ� �����ڸ� ȣ��) 
		// break()
	}

	
	String getbookinfo() { // static String getbookinfo() ����ϰԵǸ� title, author, price �����Ե�. 
		//�ֳ��ϸ� �� ����������� non-static�̴ϱ�.

		String st = "å �̸� : " + title + " å ����: " + author + "���� : " + price;

		return st;

	}
}

public class BookTest {

	public static void main(String[] args) {
		Book books = new Book();
		Book book1 = new Book("������ ����", "ȫXX", 15000);
		Book book2 = new Book("������ ����", "��XX", 23000);
		Book book3 = new Book("��ȸ�� ����", "��XX", 53000);
		Book book4 = new Book("������ ����", "��XX", 56000);
		
		System.out.println(books.getbookinfo());
		System.out.println(book1.getbookinfo());
		System.out.println(book2.getbookinfo());
		System.out.println(book3.getbookinfo());
		System.out.println(book4.getbookinfo());
	}

}
