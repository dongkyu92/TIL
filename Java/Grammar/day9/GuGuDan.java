package day9;

import day6.MethodLab3;;

class Multiplication {
	private int dan;
	private int number;
// 논 스태틱 멤버변수는 보통 private 
// 보통 값 줄때는 생성자나 set사용
// 값 얻어낼때는 get함수
	Multiplication() {
	}

	Multiplication(int dan) {
		this.dan = dan;
	}

	Multiplication(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}

	public void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDanExpr extends Multiplication {
	GuGuDanExpr(){
	}

	GuGuDanExpr(int dan) {
		super(dan);

	}

	GuGuDanExpr(int dan, int number) {
		super(dan, number);

	}

	static void printAll() {

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %-5d = %-3d \t", i, j, i * j);

			}
			System.out.println();
		}

	}

}

public class GuGuDan {

	public static void main(String[] args) {
		int dan = MethodLab3.getRandom(1, 20);
		int number = MethodLab3.getRandom(1, 20);

		if ((dan >= 1 && dan <= 9) && (number >= 1 && number <= 9)) {
			GuGuDanExpr gugu = new GuGuDanExpr(dan, number);
			gugu.printPart();
		} else if ((dan >= 1 && dan <= 9) && (number >= 10)) {
			GuGuDanExpr gugu = new GuGuDanExpr(dan);
			gugu.printPart();
		} else 
			GuGuDanExpr.printAll();
		
	}

}
