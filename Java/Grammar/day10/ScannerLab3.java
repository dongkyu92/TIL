package day10;

import java.util.Scanner;

public class ScannerLab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, con;
		int result = 0;
		boolean flag = false;
		String ss;

		// ���ڿ� �����ڸ� �Է¹޾� ó���ϴ� ����� 3�� �ݺ��ϵ��� �ڵ带 �߰�.
		// ���� ������ �ݺ��ϵ��� �ڵ� �߰�
		// ��� ��� ����ڿ��� ��� �����ϰڴ��� �� ���� �޼����� ����ϰ�, 1�� �Է��ϸ� ������, �ٸ����ڸ� �Է��ϸ� ����
		// == ���ڳ� ���ڴ� � �����ڷ� ���� �������� �� ����������, ���ڿ��� � �����ڷ� ���� �� �ִ� ��쵵 ������ �Ϲ�������
		// API�� ����ؾ� �Ѵ�.
		// equals() �޼��带 ����ؾ� �Ѵ�.
		// String Ŭ������ ���� 
		// �ڹٴ� ���ڿ� ���ͷ��� String ��ü�� ��޵ȴ�.
		// 'y' : , "y"
		// 'y' : char Ÿ��, �⺻��
		// "y" : String Ÿ��, ��ü��(������)
		
		// "y".equals("...")
		// sc.nextint�� ��Ʈ����ü �̹Ƿ� 
		//if(!sc.next().equals("y"))
		while(true) {
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
				System.out.println("+,-,*,/ �� �Է��ϼ�");
				break;
			}
			
			System.out.println("������ : " + num1 + ss + num2 + " = " + result);
			System.out.println("��� �����ϰڽ��ϱ�? Yes = 1, No = �ƹ� ���ڳ� ��������.");
			con = sc.nextInt();
			// sc.nextint�� ��Ʈ����ü �̹Ƿ� 
			//if(!sc.next().equals("y"))
		
			if(con==1)
				continue;
			else
				break;
		}
		sc.close();
	}

}
