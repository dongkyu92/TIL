package day10;

import java.util.Scanner;

public class ScannerLab2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int result = 0;
		boolean flag = false;
		String ss;
		// 숫자와 연산자를 입력받아 처리하는 기능을 3번 반복하도록 코드를 추가.
		// 원할 때까지 반복하도록 코드 추가
		// 결과 출력 사용자에게 계속 수행하겠는지 에 대한 메세지를 출력하고, 1을 입력하면 계쏙수행, 다른숫자를 입력하면 종료

		for (int i = 0; i < 3; i++) {
			System.out.println("첫 번째 숫자를 입력하세요 : ");
			num1 = sc.nextInt();
			System.out.println("두 번째 숫자를 입력하세요 : ");
			num2 = sc.nextInt();
			System.out.println("연산자(+,-,*,/)를 입력하세요 : ");
			ss = sc.next();

			switch (ss) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			default:
				
			}

			System.out.println("연산결과 : " + num1 + ss + num2 + " = " + result);
		}
		sc.close();
	}

}
