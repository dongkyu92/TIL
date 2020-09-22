package day5;

/* Open API를 활용한 빅데이터 전처리, 시각화
 * 김동규
 * 12.09 2차원 배열 실습2
 */


public class TwoArrayTest2 {

	public static void main(String[] args) {
		
		int twoA[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(twoA);
		System.out.println(twoA[0]);
		System.out.println(twoA[0][0]);
		
		for(int row=0; row < 3; row++) {
			for(int col=0; col < 3; col++) {
				System.out.print(twoA[row][col]);
			}
		}
	}

}
