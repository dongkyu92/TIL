package day10;

import java.util.Scanner;

public class ScannerLab2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int result = 0;
		boolean flag = false;
		String ss;
		// ���ڿ� �����ڸ� �Է¹޾� ó���ϴ� ����� 3�� �ݺ��ϵ��� �ڵ带 �߰�.
		// ���� ������ �ݺ��ϵ��� �ڵ� �߰�
		// ��� ��� ����ڿ��� ��� �����ϰڴ��� �� ���� �޼����� ����ϰ�, 1�� �Է��ϸ� ������, �ٸ����ڸ� �Է��ϸ� ����

		for (int i = 0; i < 3; i++) {
			System.out.println("ù ��° ���ڸ� �Է��ϼ��� : ");
			num1 = sc.nextInt();
			System.out.println("�� ��° ���ڸ� �Է��ϼ��� : ");
			num2 = sc.nextInt();
			System.out.println("������(+,-,*,/)�� �Է��ϼ��� : ");
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

			System.out.println("������ : " + num1 + ss + num2 + " = " + result);
		}
		sc.close();
	}

}
