package day6;

public class MethodLab2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		num1 = (int)(Math.random()*30)+1;
		num2 = (int)(Math.random()*30)+1;
		
		int result =getResult(num1,num2);
		
		System.out.println(num1+" �� "+num2+"�� ���� "+result+"�Դϴ�.");
	}

	static int getResult(int num1, int num2) {
		// return ���� �ּ�ȭ�ϴ°� ����.
		
		if (num1==num2)
			return 0;
		else
			return Math.abs(num1-num2);

	}
}
