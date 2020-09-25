package lamdaexam;

public class MyFunctionalExam2 { 
	public static void main(String[] args) {
		MyFunctionalInterface2 fi;
		
		fi= (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method2(2);
		
		fi = (x) -> { System.out.println(x*5); };
		fi.method2(2);
		
		fi = x -> System.out.println(x*5); //매개변수가 하나일때는 소괄호 생략가능.
		fi.method2(2);
	}
}











