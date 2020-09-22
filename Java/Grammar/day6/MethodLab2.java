package day6;

public class MethodLab2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		num1 = (int)(Math.random()*30)+1;
		num2 = (int)(Math.random()*30)+1;
		
		int result =getResult(num1,num2);
		
		System.out.println(num1+" 와 "+num2+"의 차는 "+result+"입니다.");
	}

	static int getResult(int num1, int num2) {
		// return 문은 최소화하는게 좋음.
		
		if (num1==num2)
			return 0;
		else
			return Math.abs(num1-num2);

	}
}
