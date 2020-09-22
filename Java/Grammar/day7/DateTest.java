package day7;
/*
 * 생성자 메서드 정의 방법
 * (1) 메서드명은 클래스명과 동일해야 한다.
 * (2) 매개변수는 선택적이다. 여러 생성자 메서드로 오버로딩 가능
 * (3) 리턴값의 타입은 생략한다.
 * (4) 생성자 메서드는 주로 객체 생성시 수행해야 하는 기능 또는 객체 생성시 데이터를 전달받아서 멤버변수들의 값을 초기화 하는 기능.
 * 다른 패키지에 접근하려면 import 해야 됨.
 * java.util 패키지에 접근하겠다. Java프로젝트- util 패키지 -Date 클래스
 */
import java.util.Date;
import java.util.GregorianCalendar;// date보다 기능이 많음.
// import는 패키지 아래 클래스 정의 위
// import 말고 패키지.함수 사용가능
public class DateTest {

	public static void main(String[] args) {
		Date d = new Date(); // 그레고리력 등장으로 잘 안씀.
		//d.  API 보면 짝대기 -  더이상 쓰지 말아라. 가급적 ㄴㄴ 디플리케이션
		System.out.println(d.toString());
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		
		gc = new GregorianCalendar(1992, 8, 9);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		
		

	}

}
