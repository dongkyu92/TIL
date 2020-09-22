package day8;

/* 
 * import는 패키지 선언, 클라스 정의 사이에 위치해야 되고,
 * import 프로젝트.패키지.클래스.함수; 순서로 선언
 * 위에 선언을 안하고 코드내에서 호출하는 방법도 있음
 * int month = day6.MethodLab3.getRandom(12);
 */
import day6.MethodLab3;

class SalaryExpr {
	int bonus;

	SalaryExpr() {
		this.bonus = 0; // this(0)
	}

	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}

	int getSalary(int grade) {

		switch (grade) { // 보너스값 자체를 바꾸는 것보다 지역변수 하나 선언해서 반환하는게 나
		case 1:
			this.bonus += 100;
			break;
		case 2:
			this.bonus += 90;
			break;
		case 3:
			this.bonus += 80;
			break;
		case 4:
			this.bonus += 70;
			break;
		}
		return this.bonus;
	}
}

public class SaleryExam {

	public static void main(String[] args) {
		/*
		 * int month = MethodLab3.getRandom(12);
		 * 
		 * int grade = MethodLab3.getRandom(4);
		 * 
		 * if (month % 2 == 0) { SalaryExpr sal = new SalaryExpr(100);
		 * System.out.printf("%d월 %d등급의 월급은 %,d원 입니다. \n", month, grade,
		 * sal.getSalary(grade));
		 * 
		 * } else { SalaryExpr sal = new SalaryExpr();
		 * System.out.printf("%d월 %d등급의 월급은 %,d원 입니다. \n", month, grade,
		 * sal.getSalary(grade)); } }
		 */
		int month = MethodLab3.getRandom(12);
		int grade = MethodLab3.getRandom(4);
		SalaryExpr sal = null; //널일때는 멤버 접근 안됨. 참조변수는 null초기화

		if (month % 2 == 0)
			sal = new SalaryExpr(100);

		else
			sal = new SalaryExpr();

		System.out.printf("%d월 %d등급의 월급은 %,d원 입니다. \n", month, grade, sal.getSalary(grade));

	}
}
