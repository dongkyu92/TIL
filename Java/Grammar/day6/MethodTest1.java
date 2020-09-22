package day6;
/*
 * [메서드를 생성하는 방법]
- 메서드명 : (1) 소문자로 시작하고 새로운 워드 등장시 첫 글자만 대문자로
	   (2) 식별자(명명) 규칙 적용
	   (3) 동사로 시작
- 메서드 호출 시 전달받을 데이터의 유무를 결정
	유 : 몇 개, 어떤 타입 ---------> 매개 변수 선언
- 호출된 후에 호출한 곳으로 값을 줄 것인지의 여부를 결정 -- 리턴값
  return 이라는 구문을 사용한다.


 [제어자]  메서드의 헤더----> 리턴값의타입 메서드명([매개변수 선언]){

메서드의 바디(지역변수; 수행 문장....)
[return 리턴값;]
}


[메서드를 사용하는 방법 - 호출]
(1) 기능
(2) 헤더
    - 메서드명
    - 호출시 전달할 데이터(아규먼트)의 유무, (받는 데이터 매개변수)
    - 리턴값의 유무에 따라서 리턴값을 사용

       변수 = 식
       result = system.out.println();
       rand = math.random();
 */
public class MethodTest1 {

	
	
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName();
		System.out.println(1);
		printMyName();
		System.out.println(2);
		printMyName();
		System.out.println(3);
		System.out.println("main() 수행종료");
	}
	
	
	
	
	 static void printMyName() {
	System.out.println("김동규");
	return;
	}
	
	
	
	

}
