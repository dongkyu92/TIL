package day8;
/*
 * [static(정적, 고정, 공유)]
 * 제어자
 * 멤버변수와 메서드 앞에 지정 가능하다.
 * static을 설정한 멤버변수와 메서드는 객체생성을 하지 않아도 자동으로 메모리 영역을 할당하거나 호출 가능한 상태가 된다.
 * 다른 클래스에서 또 다른 클래스의 static 타입의 멤버를 사용할 때는 클래스명.멤버명으로 사용한다.
 * 클래스에 정의되는 멤버들중 어떤 멤버에 static을 부여하는가?
 * 변수(멤버)
 * 메서드 
 * 클래스변수 = 스태틱형 변수, 인스턴스변수 = 스태틱이 아닌 변수
 * 
 * 
 * “인스턴스변수는 인스턴스가 생성될 때마다 생성되므로 인스턴스마다 각기 다른 값을 유지할 수 있지만, 
 * 클래스변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.”
 * 클래스 로딩시(최초1번) 스태틱 변수
 * 같은 클래스에 있어도 객체 생성시 각각 메모리할당 non-스태틱, 스태틱은 메모리할당 또하지 않음.
 * 
 * 클래스 로딩시 스태틱은 할당되고
 * 논스태틱은 카드객체 생성시 할당.
 * 
 * 메인함수에 스태틱 있는 이유 : jvm은 로딩만해서 바로 호출하기 때문에 // 메인메서드에 스태틱이 있어야 바로 사용가능.
 * 
 * run configurations - jvm 영역 -verbose:class
 * 클래스 로딩 정보를 보여주면서 자바 프로그램을 수행시켜라!!
 * 
 * 
 * [블록 스코프]
 *	메서드 헤더{
 * int a;
 * 
 * if(...){
 * 	int b;  // b는 선언된 위치로부터 현재 블록이 끝날 때 까지. 즉, if가 끝나면 못 씀.
 * }
 * 
 * int c;
 * 
 * 
 * 
 * 클래스메서드(static 메서드) 와 인스턴스 메서드
 * 인스턴스메서드 - 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
 * 인스턴스변수나 인스턴스 메서드와 과년된 작업을 하는 메서드
 * 메서드 내에서 인스턴스 변수 사용가능
 * 
 * 인스턴스 메서드는 객체 생성 없이 클래스이름.메서드 이름으로 호출
 * 인스턴스 변수나 인스턴스메서드와 관련없는 작업을 하는 메서드
 * 메서드 내에서 인스턴스 변수 사용불가
 * 메서드 내에서 인스턴스변수를 사용하지 않는다면 static을 붙이는 것을 고려한다.

 * 
 * 
	String getbookinfo() { // static String getbookinfo() 사용하게되면 title, author, price 못쓰게됨. 
		//왜냐하면 이 멤버변수들이 non-static이니까.

		String st = "책 이름 : " + title + " 책 저자: " + author + "가격 : " + price;

		return st;
		
		
		
		--------------------------
		[표준입력]
		프로그램이 수행하는 동안 필요로 하는 데이터를 시스템의 표준 입력 장치로 부터 받아 오는 것.
		표준 입력 장치 - 키보드, 운영체제에 따라 펜으로도 바꿀 수 있음 default = keyboard.
		Java에서는 표준 입력을 어떻게 처리하느냐.. --> System.In
		System.in.read() -> 한글 깨짐.
		API는 모두  Static. (Scanner 제외.) 
		개발자 불만
		Java 5(JDK 1.5)부터 Java.util.Scanner 클래스를 제공하여 좀더 편하게 데이터를 입력받을 수 있게 API를 추가했다.
		
		
		Scanner scan = new Scanner(System.in); 키보드에 대한 입력.
		
		scan.next()    //한단어씩
		scan.nextLine()  // 한횡씩
		scan.nextInt()    // 
		scan.nextDouble()
		

	}
 */
public class static1 {

}
