package day13;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();
		o1.put("abc");
		String s1 = o1.get(); 
		//get(0...) 몇번째꺼를 꺼낼지 정할 수 있음.
		System.out.println(s1);		
		
		Value2 o2 = new Value2();
		o2.put("abc");
		String s2 = (String)o2.get(); 
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<>();		//생성자 뒤에 왜 비었나? java8 부터는 빈괄호만 줘도 되도록변함.
		//변수명을 보면 알 수 있기때문에 바뀜...
		o3.put("abc");
		String s3 = o3.get();
		//String s3 = (String)o3.get();  리턴값이 어차피 String이라 생략해도 되고 써도 에러안남.
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();		
		o4.put(new Date());
		//o4.put("abc"); //에러남 왜냐면 Date형을 넣는게 아니기때문에.
		Date s4 = o4.get(); 
		System.out.println(s4);	
		// 매개변수, 리턴값 다 Date형임.
	}
}


class Value1 {
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}
// 스트링버퍼 파이널이라 Value1 객체 못넣음
// 오로지 스트링만 넣을 수 있음.

class Value2 {
	Object obj;
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}
// 1과 비교해서 타입만 달라짐.
// 스트링버퍼에 저장 가능. 스트링도 가능, 북도 프렌즈도 가능. 기본형도 가능(rapper로 자동 변환)
// 넣을때는 상관없는데 뺄때는 형변환해야됨.
// 꺼내서 데이트 형 변수에 넣을거야 하면 형변환해야됨.


// Value3<Card> v = new Value3<Card>();
// 객체 생성시 <Card>로하면 TT가 Card로 바뀜!!!!!!!!!!!!!!
// String으로 할 시 TT는 String으로 바뀜.!!!!!!

// Value3<String> v = new Value3<String>();

class Value3<TT> {
	// class Value3<TT, SS,ZZ > 가능 
	TT obj;
	void put(TT obj){
		this.obj = obj;
	}
	TT get() {
		return obj;
	}
}
// 보통 한글자로 <K,V>, (key,value) T 등 한글자로 함.

// 꺽쇠 괄회에 있는것을 의미없다는 뜻.
// 클래스 뒤에 있으면 객체생성시 타입파라미터를 하나 받을거야라는 뜻.
// 타입파라미터를 어디다가 쓸지는 개발자 마음임.
//Value3<Card> v = new Value3<Card>();
//객체 생성시 <Card>로하면 TT가 Card로 바뀜!!!!!!!!!!!!!!
//String으로 할 시 TT는 String으로 바뀜.!!!!!!

//클래스 타입을 클래스를 만드는시점이 아니라 객체를 만들 시점에 정하겠다는 고급구문.
// 객체 타입을 일반화 시키겠다. 일반화 generic
// 명세서에 LinkedList<E> 로 되어있기 때문에 객체 생성시 타입을 정할 수 있는거임.









