package day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInputTest {

	public static void main(String[] args) throws Exception {// 메인에서 발생하는 예외를 모두 던지겟다.
		System.out.print("입력: ");
		int input = new InputStreamReader(System.in).read();
		System.out.println("출력 : "+(char)input);
		//System.in은 인풋스트림 객체인데 리더로 감싸는것.
		//인풋스프림 객체이자 문자스트림 객체
		//한문자를 읽는거는 똑같음.
		
		String input2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
		System.out.println("출력 : "+input2);
		//int input = System.in.read();
		//한글자만 받음(abc->a)
		//인풋스트림 객체, 바이트스트림 객체라 1byte임.
		//b0는 그림임.
		//해결방법 input 스트림객체사용
		//System.in.read();는 throws IOException 예외처리 꼭 해야 됨.
		//System.out.println("출력 : "+(char)input);
	}

}
