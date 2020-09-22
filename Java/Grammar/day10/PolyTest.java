package day10;
// java.lang 만 자동 import.

public class PolyTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// printObjectInfo(new Object());
		// day10.PolyTest.printObjectInfo(new Object()); 공식 호출명
		printObjectInfo(new Object()); // Object와 Object 객체의 자손만 올수있다는 뜻.
		printObjectInfo(new String("가나다"));
		printObjectInfo("ABC");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("C:\\Temp")); // \디렉토리 구분자 2개인 이유 : 하나만 쓰면 \T를 특수문자로 만드려고함.
														// / 로 써보됨 C:/Temp ---> JVM이 나중에 알아서 \로 바꿔줌.
		printObjectInfo(new int[10]); // [I 1차원 배열이니까 [, 2차원 배열은 [[
		printObjectInfo(new double[5]); // [D
		printObjectInfo(new day7.Member());
		printObjectInfo(new Integer(100)); // int type의 rapper클래스.
		printObjectInfo(100); //인티저 형으로 전달됨.// 자바 5 부터AutoBoxing 구문
	}

	static void printObjectInfo(Object o) { // String 일때는 2,3번쨰를 제외하고 다 에러남
		if (o instanceof String) { // o라는 인스턴스가 스티링 타입의 인스턴스냐?
			System.out.println("전달된 객체의 클래스명 :  " + o.getClass().getName() + " - " + ((String) o).length());
		} // ((String)o).length 강제 형변환.
		else {
			System.out.println("전달된 객체의 클래스명 :  " + o.getClass().getName());
		}

		// 어떤 오브젝트가 전달됐는지 확인하고 싶을 때 확인하고 싶을 때, instanceof

		// object는 java.lang에 있는 오브젝트임.
		// static을 준 이유 메인매서드가 스태틱인데 같은 클래스에서 같은 멤버를 접근할떄
		// print objectinfo 를 편하게 호출하기 위함임.
		// 스태틱 안붙어있으면 객체 생성해야 메모리 할당 되기때문에
		// 스태틱을 붙여야됨.

	}

}
