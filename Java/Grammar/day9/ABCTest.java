package day9;

class A{
	A(){
		System.out.println("A 클래스를 객체 생성합니다.");
	}
}
class B extends A{
	B(int num){ 
		//C에서 super 안쓰면 에러남.
		System.out.println("B 클래스를 객체 생성합니다.");
	}
}
class C extends B{
	C(){
		super(100); // 반드시 첫줄에 써야됨. 밑에 쓰면 에러남. 조상부터 호출해야되는데 출력이 먼저 있기 때문.
		System.out.println("C 클래스를 객체 생성합니다.");
	}
}


public class ABCTest {

	public static void main(String[] args) {
		new C(); // 객체 생성, 어떤 클래스를 객체생성하면 조상들도 객체 생성됨. 당연히 조상 생성자 자동 호출.
		// 조상을 먼저 생성함
	}

}
