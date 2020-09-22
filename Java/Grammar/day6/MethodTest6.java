package day6;
/*
 * 배열 타입의 매개변수를 선언하여 메서드 호출시 배열을 아규먼트로 전달받으면 전달받는 데이터의 갯수를 제한하지 않게 된다.
 * 
 * Java
 */
public class MethodTest6 {

	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		System.out.println(add(10,100));
		System.out.println(add(10,20,30));
		System.out.println(add(new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println(add());
		System.out.println(add(11,22,33,44,55,66,77,88,99));
		System.out.println("main() 수행종료");
	}

	static int add(int p1, int p2) {
		return p1 + p2;
	}
	
	static int add(int p1, int p2, int p3) {
		return p1 + p2+ p3;
	}
	/*
	static int add(int[] p) {
		int sum = 0;
		for(int i=0; i<p.length;i++)
			sum +=p[i];
		return sum;
	}
	*/
	static int add(int... p) { // 만능
		int sum = 0;
		for(int i=0; i<p.length;i++)
			sum +=p[i];
		return sum;
	}

}
