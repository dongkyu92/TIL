package day8;

/* 
 * import�� ��Ű�� ����, Ŭ�� ���� ���̿� ��ġ�ؾ� �ǰ�,
 * import ������Ʈ.��Ű��.Ŭ����.�Լ�; ������ ����
 * ���� ������ ���ϰ� �ڵ峻���� ȣ���ϴ� ����� ����
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

		switch (grade) { // ���ʽ��� ��ü�� �ٲٴ� �ͺ��� �������� �ϳ� �����ؼ� ��ȯ�ϴ°� ��
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
		 * System.out.printf("%d�� %d����� ������ %,d�� �Դϴ�. \n", month, grade,
		 * sal.getSalary(grade));
		 * 
		 * } else { SalaryExpr sal = new SalaryExpr();
		 * System.out.printf("%d�� %d����� ������ %,d�� �Դϴ�. \n", month, grade,
		 * sal.getSalary(grade)); } }
		 */
		int month = MethodLab3.getRandom(12);
		int grade = MethodLab3.getRandom(4);
		SalaryExpr sal = null; //���϶��� ��� ���� �ȵ�. ���������� null�ʱ�ȭ

		if (month % 2 == 0)
			sal = new SalaryExpr(100);

		else
			sal = new SalaryExpr();

		System.out.printf("%d�� %d����� ������ %,d�� �Դϴ�. \n", month, grade, sal.getSalary(grade));

	}
}
