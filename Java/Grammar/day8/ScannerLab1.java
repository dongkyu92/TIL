package day8;

import java.util.Scanner;

public class ScannerLab1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		int result = 0;
		String c;
		
		System.out.println("ù ��° ���ڸ� �Է��ϼ��� : ");
		a = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ��� : ");
		b = sc.nextInt();
		System.out.println("������(+,-,*,/)�� �Է��ϼ��� : ");
		c = sc.next();
		
	// ���ڿ��� ��ü�� �񱳿����� �ȵ�.	op =="+"||"-" �ϰ������
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
			System.out.println("+,-,*,/ �� �Է��ϼ�");
			sc.close();
			return;
			
		}
		System.out.println(a+"��"+b+"��"+"���� �����"+result+" �Դϴ�.");
		sc.close();

	}

}
