package day11;

import java.util.Random;

class TestException extends Exception {
	TestException(String message) {
		super(message);
	}
}

public class ExceptionTest3 {
	public static void main(String[] args) {
		System.out.println("main()수행시작");
		a();
		System.out.println("main()수행종료");
	}

	static void a() {  // 트라이 케치로 할때 는 throws 절 필요없음. 
		System.out.println("a()수행시작");
		try {
			b();
		} catch (TestException e) {
			System.out.println("오류 발생 : " + e.getMessage());
		}
		System.out.println("a()수행종료");
	}

	static void b() throws TestException { // 넘기겟다는걸로 알림.
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}

	static void c() throws TestException {
		System.out.println("c()수행시작");
		boolean flag = new Random().nextBoolean(); //한번만 사용가능한 객체. 불리언타입의 난수
		if (flag) {
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>"); // 위에 throws TestException 안쓰면 에러남.
			// jvm은 에러가 발생 호출하는 곳을 역순으로 찾음. b-> a(트라이 캐치 구문) a 에서 익셉션 구문을 전달하여 오류발생 메세지 던짐. 
		} else {
			System.out.println("ㅋㅋㅋㅋ");
		}
		System.out.println("c()수행종료");
	}
}
