package javaIO;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException{
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			i= System.in.read(); // read() 메서드로 한 바이트 읽음.
			System.out.println(i);
			System.out.println((char)i); // 문자로 변환해서 출력.
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
/*
 * i는 4바이트지만 System.in은 바이트 단위로 읽어 들이는 InputStream이므로 1바이트만 읽음.
 * 읽어 들인 1바이트를 출력하면 문자에 대한 숫자 값, 즉 아스키 값을 출력함.
 * 읽어 들일 때 사용한 InputStream의 read() 메서드는 한 바이트만을 읽어 들임.
 */
