package day9;



class Book {

	String title;
	String author;
	private int price;
	// private 주로 멤버 변수에 선언.
	// 외부에서 -30000 등 접근을 방지하기 위해 private 선언

	Book() {
		/*
		 * title = " 자바의 정석"; author = "남궁 성"; price = 30000;
		 */
		this("자바의 정석", "남궁 성", 30000); // 동일한 클래스에 있는 다른 생성자 호출 (아규먼트 개수를 보고 호출됨)
	}

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		/*
		 * if(price < 0) this.price = -price;//오류 발생. else this.price = price;
		 */
		setPrice(price);
		// this : 자신의 객체의 참조값을 의미하는 리터럴 this.xxxx 나의 멤버 xxxx
		// this() : 생성자 메서드내에서만 호출가능( 생성자 메서드의 첫 행에서만 호출 가능)
		// 가로를 붙여주면 다른 생성자를 호출(동일한 클래스 내에 있는 다른 생성자를 호출)
		// break()
	}

	void setPrice(int price) {
		if (price < 0)
			this.price = -price;// 오류 발생.
		else
			this.price = price;
	}

	String getbookinfo() { // static String getbookinfo() 사용하게되면 title, author, price 못쓰게됨.
		// 왜냐하면 이 멤버변수들이 non-static이니까.

		String st = "책 이름 : " + title + " 책 저자: " + author + "가격 : " + price;

		return st;

	}
}

public class BookTest {

	public static void main(String[] args) {
		Book books = new Book("자바의 정석", "남궁성", -30000);
		books.setPrice(-33000);
		// books.price = -30000;

		System.out.println(books.getbookinfo());

	}

}
