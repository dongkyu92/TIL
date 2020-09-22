package day5;

/* Open API를 활용한 빅데이터 전처리, 시각화
 * 김동규
 * 12.09 2차원 배열 실습
 * ********************
 * char a2[]= new char[3];
 * a2[0] = 가. ...
 * 공간먼저 할당
 * 
 * char a2[] = {'가'나'다'};
 * 초기화와 동시에 값 할당
 * 
 * 두개같은거
 */


public class TwoArrayTest1 {

	public static void main(String[] args) {
		int a1[] = new int[10];
		char a2[] = {'가', '나','다'};
		double a3[] = new double[5];
		
		System.out.println(a1.length + " : "+ a2.length + " : " + a3.length);
		System.out.println(a1 + " - " + a1[0]);
		System.out.println(a3 + " - " + a3[0]);
		
		int a4[][] = new int[5][12];
		System.out.println(a4);
		System.out.println(a4.length);
		System.out.println(a4[0].length);
		System.out.println(a4[1].length);
		System.out.println(a4[2].length);
		System.out.println(a4[3].length);
		System.out.println(a4[4].length);

	}

}
