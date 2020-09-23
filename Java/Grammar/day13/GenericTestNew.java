package day13;
import java.util.*;
public class GenericTestNew {
	public static void main(String[] args) {
		// 제네릭스 라는 구문이 적용되어 만들어진 클래스의 객체 생성시
		// 타입 파라미터라는 것을 사용한다. 
		LinkedList<String> list = new LinkedList<String>();  // 타입파라미터
		//문자열 처리를 전담하는 링크드 리스트로 만들거라는 뜻.
		list.add("java");
		list.add("100");
		//list.add(100); 스트링 객체는 파이널이라 자손없음 따라서 스트링만 사용가능함. 컴파일시 체크해서 알려주기때문에 견고한 프로그램이 됨.
		// add와 get으로 리턴할때도 스트링인지 검사함.
		list.add("servlet");
		list.add("jdbc");
		
		for(int i=0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();		
		
		for(String value : list) {			
			System.out.println(value);
		}
		System.out.println();
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String s = iter.next();
			//String s = (String)value;	꺼낼때 형변환이 필요없다.		
			System.out.println(s);
		}
	}
}

