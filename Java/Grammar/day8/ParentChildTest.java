package day8;

class Parent{ // java.lang.Object (부모 따로 설정하지 않으면 자동으로 상속)
	//object 클래스를 물려받음. 조상의 멤버
	
	int x = 1, y = 2;
	
	public String toString() {
		
		return "Parent 클래스의 객체 입니다"; //메소드 오버라이딩.
	}
}
class Child extends Parent{
	int x = 10 ;
	void printInfo() {
		int x = 100;
		System.out.println(x);           //100
		System.out.println(this.x);    // 10 없으면 조상으로
		System.out.println(super.x); // 1 super는 조상객체를 참조하는 리터럴
		System.out.println(y);          // 2 조상
		System.out.println(this.y);    // 2
		System.out.println(super.y); // 2
		//System.out.println(z);
		
	
	}
//모든 자바 클래스는 Object이 최고 조상
	//Child에서 투스트링 호출하면 가까운 부모꺼 호출
	
public String toString() {
		
		return "Parent 클래스의 객체 입니다"; //메소드 오버라이딩.
	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println("출력1" + p); // 문자열 결합.
		Card c = new Card(); // 같은 패키지라서 임포트 안해도 됨.
		System.out.println(c.toString());
		System.out.println("출력2" + c);
		java.util.Date d= new java.util.Date();
		System.out.println(d.toString());
		System.out.println("출력3" + d);
		
		Child ch = new Child();
		System.out.println("출력 4"+ ch);
		ch.printInfo();
	}


}
