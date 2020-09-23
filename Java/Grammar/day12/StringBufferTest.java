package day12;

public class StringBufferTest {

	public static void main(String[] args) {		
		StringBuffer buffer = new StringBuffer();
		String str = "자바프로그래밍";
     		buffer.append(str);

        System.out.printf("%s\n", buffer);
       // buffer.reverse(); // 스트링 버퍼자체를 변화시킴
        System.out.printf("%s\n", buffer);
        System.out.printf("길이 : %d\n", buffer.length());    
        
        StringBuffer buffer2 = new StringBuffer();
        buffer2.append('자');
        buffer2.append('바');
        buffer2.append('프');
        buffer2.append('로');
        buffer2.append('그');
        buffer2.append('래');
        buffer2.append('밍');
        
        System.out.println(buffer == buffer2); // false 각각의 스트링버퍼를 참조하기때문
        System.out.println(buffer.equals(buffer2)); // false 오버라이딩 안함
        System.out.println(buffer.toString().equals(buffer2.toString())); // 스트링버퍼는 equals 함수가 없기 때문에
        //String으로 변환*toString() 후에 비교함. 
	}
}






