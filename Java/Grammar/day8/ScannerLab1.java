package day8;

import java.util.Scanner;

public class ScannerLab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		int result = 0;
		String c;
		
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요 : ");
		b = sc.nextInt();
		System.out.println("연산자(+,-,*,/)를 입력하세요 : ");
		c = sc.next();
		
	// 문자열도 객체라 비교연산자 안됨.	op =="+"||"-" 하고싶으면
		// op.equals("+") || op==...
		
		switch(c) {
		case "+":
			result = a+b;
			break;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
			break;
		case "/":
			result = a/b;
			break;
		default:
			System.out.println("+,-,*,/ 를 입력하숑");
			sc.close();
			return;
			
		}
		System.out.println(a+"와"+b+"의"+"연산 결과는"+result+" 입니다.");
		sc.close();

	}

}
