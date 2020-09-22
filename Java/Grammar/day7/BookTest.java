package day7;

class Book {

	String title;
	String author;
	int price;

	Book() {
		/*title = " 자바의 정석";
		author = "남궁 성";
		price = 30000;
		*/
		this("자바의 정석", "남궁 성", 30000); // 동일한 클래스에 있는 다른 생성자 호출 (아규먼트 개수를 보고 호출됨)
	}

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		// this :  자신의 객체의 참조값을 의미하는 리터럴 this.xxxx 나의 멤버 xxxx
		// this() : 생성자 메서드내에서만 호출가능( 생성자 메서드의 첫 행에서만 호출 가능)
		// 가로를 붙여주면 다른 생성자를 호출(동일한 클래스 내에 있는 다른 생성자를 호출) 
		// break()
	}

	
	String getbookinfo() { // static String getbookinfo() 사용하게되면 title, author, price 못쓰게됨. 
		//왜냐하면 이 멤버변수들이 non-static이니까.

		String st = "책 이름 : " + title + " 책 저자: " + author + "가격 : " + price;

		return st;

	}
}

public class BookTest {

	public static void main(String[] args) {
		Book books = new Book();
		Book book1 = new Book("수학의 정석", "홍XX", 15000);
		Book book2 = new Book("과학의 정석", "김XX", 23000);
		Book book3 = new Book("사회의 정석", "박XX", 53000);
		Book book4 = new Book("영어의 정석", "이XX", 56000);
		
		System.out.println(books.getbookinfo());
		System.out.println(book1.getbookinfo());
		System.out.println(book2.getbookinfo());
		System.out.println(book3.getbookinfo());
		System.out.println(book4.getbookinfo());
	}

}
