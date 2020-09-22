package day8;
import java.util.Scanner;
public class ScannerTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("데이터를 입력하세요 : ");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.nextLine();  // 입력버퍼에 남아있는 개행문자를 청소하는 기능. 쓸 떄없는 \n 청소
//		aa
//		bb
//		cc
//		입력시 결과 [aa] [bb] [] [cc] 라서 개행문자를 청소하는 기능
//	    Scanner 등장 전 readLine(매개변수) : String 사용했었음.
//		aaa  bbb     ccc    ddd\n
		String line1 = sc.nextLine();  // \n 개행문자가 나올때 까지 읽는 놈. (sc.next 제외하고 전부 \n까지 읽음.)
		String line2 = sc.nextLine();
		System.out.printf("[%s] [%s] [%s] [%s]", str1, str2, line1, line2);
		sc.close();
	}
}









