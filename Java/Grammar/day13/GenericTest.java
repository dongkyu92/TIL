package day13;
import java.util.*;
public class GenericTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("java");
		list.add("100");
		//list.add(100); 컴파일 에러 안남. 제너릭 선언을 생략했기 때문에 자동으로 오브젝.
		//링크드리스트 명세서에는 제너릭 선언하게끔 설명되어있음.
		//조상에서 자손으로 강제 형변환할 수 있는데 Integer는 String과 조상 자손 관계가 아니기때문에 실행시 예외발생.
		list.add("servlet");
		list.add("jdbc");
		// 콜렉션 리스트들은 저장되는 데이터 개수에 제한이 없다.
		// 난 이 링크드 리스트에 String, int 등을 저장하겠다. <String>...
		// <> 명시 안했기 때문에 Object로 자동 인식.
		
		for(int i=0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();		
		// 자료를 꺼내는 첫번째 방법
		// 속도 가장느림 데이터 많을 시 사용 자제
		
		
		for(Object value : list) { // list 객체를 만들 때 제너릭을 선언 안해줘서 자동적으로 오브젝트 타입으로 선언됨
			// 따라서 Object -> LinkedList나 String value로 하면 에러남.
			String s = (String)value;	
			//Integer 는 String으로 형변환 안되기 때문에 예외남.
			System.out.println(s);
		}
		// 자료를 꺼내는 두번째 방법
		// 속도가 가장빠름.
		System.out.println();		
		
		
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object value = iter.next();
			String s = (String)value;		
			System.out.println(s);
		}
		// 자료를 꺼내는 세번째 방법
		// 규격화된 방법임
		// Iterator는 인터페이스임.
		// Iterator는 콜렉션 객체가 무엇이 됐든, 그 안에 있는 데이터를 하나씩 꺼내는 것을 규약한 인터페이스임.
		// 꺼내는거 next(), 체크하는거는 hasNext(boolean형)
		
		
	}
}
