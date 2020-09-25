package lamdaexam;

public class MyFunctionalExam1 { 
	public static void main(String[] args) {
		MyFunctionalInterface1 fi;
		
	//	MyFuctionalInterface1.pr();
		fi= () -> {  // 매개변수 없고, 블럭안에다가 함수 실행문, 리턴값 없는 함수 호출;
			String str = "method call1";
			System.out.println(str);
		};
		// 이름이 중요한게 아니라 오버라이딩이 중요함.
		// 
		fi.method1();
		
		fi = () -> { System.out.println("method call2"); };
		fi.method1();	
	
	}
}











