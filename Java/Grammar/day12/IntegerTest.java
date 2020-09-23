package day12;
public class IntegerTest {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램 아규먼트 2개를 숫자로 입력하세요");
		} else {
			System.out.println(Integer.parseInt(args[0])
					 +Integer.parseInt(args[1]));
		}
		String s1 = Integer.toBinaryString(12); //주어진 십진수를 2진수 문자열로
		String s2 = Integer.toBinaryString(88);
	    
		System.out.printf("%s\n", s1);
		System.out.printf("%s\n", s2);
		
		int num1 = Integer.parseInt(s1 ,2); // 두번째 아규먼트는 디폴트가 10진수임. 2로써서 2진수로 인수
		int num2 = Integer.parseInt(s2, 2); // 정수형 숫자로 변환하겟다.
		
		System.out.printf("%d\n", num1);
		System.out.printf("%d\n", num2);
	}
}
