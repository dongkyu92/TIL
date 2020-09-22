package day10;

import java.util.Scanner;

public class ScannerLab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, con;
		int result = 0;
		boolean flag = false;
		String ss;

		// 숫자와 연산자를 입력받아 처리하는 기능을 3번 반복하도록 코드를 추가.
		// 원할 때까지 반복하도록 코드 추가
		// 결과 출력 사용자에게 계속 수행하겠는지 에 대한 메세지를 출력하고, 1을 입력하면 계쏙수행, 다른숫자를 입력하면 종료
		// == 숫자나 문자는 등가 연산자로 값이 동일한지 비교 가능하지만, 문자열은 등가 연산자로 비교할 수 있는 경우도 있지만 일반적으로
		// API를 사용해야 한다.
		// equals() 메서드를 사용해야 한다.
		// String 클래스가 제공 
		// 자바는 문자열 리터럴은 String 객체로 취급된다.
		// 'y' : , "y"
		// 'y' : char 타입, 기본형
		// "y" : String 타입, 객체형(참조형)
		
		// "y".equals("...")
		// sc.nextint가 스트링객체 이므로 
		//if(!sc.next().equals("y"))
		while(true) {
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
				System.out.println("+,-,*,/ 를 입력하숑");
				break;
			}
			
			System.out.println("연산결과 : " + num1 + ss + num2 + " = " + result);
			System.out.println("계속 수행하겠습니까? Yes = 1, No = 아무 숫자나 누르세요.");
			con = sc.nextInt();
			// sc.nextint가 스트링객체 이므로 
			//if(!sc.next().equals("y"))
		
			if(con==1)
				continue;
			else
				break;
		}
		sc.close();
	}

}
