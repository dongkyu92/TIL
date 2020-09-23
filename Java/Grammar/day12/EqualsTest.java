package day12;

import java.util.Date;

class Value {
	int value;
	Value(int value){
		this.value = value;
		
	}
	public boolean equals(Object obj) {
		boolean result = false;
        if(obj != null && obj instanceof Value)
        	if(value == ((Value)obj).value)// obj이 조상이니깐 자손형인 Value로 형변환해서 호출.
        		result = true;
		return result;
    }
}

public class EqualsTest {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null)); // f
		System.out.println(v1.equals(v3));   // f
		System.out.println(v1.equals(v2));   // t
		System.out.println(v1.equals(new Date()));   // f
		if(v1.equals(v2)) 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		v2 = v1;
		if(v1.equals(v2)) 
			System.out.println("v1과 v2는 같습니다.");
		else 
			System.out.println("v1과 v2는 다릅니다.");
		String s1 = "가나다";
		String s2 = "가나다";
		String s3 = new String("가나다"); // 정식 객체 생성
		String s4 = new String("가나다"); // 정식 객체 생성
		
		System.out.println(s1 == s2);  //false x// why true?? 똑같은 내용의 문자용 리터럴을 쓰면 실제로 객체는 하나의 내용을 공유함.
		System.out.println(s3 == s4);  //false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s3.equals(s4)); // true
		
	}
}
