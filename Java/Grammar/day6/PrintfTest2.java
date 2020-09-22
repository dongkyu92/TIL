package day6;
/* Open API를 활용한 빅데이터 전처리, 시각화
 * 김동규
 * 12.10 printf
 * 
 * %d, %x %o %c <----포맷 문자
 * 8진수는 쓸일 거의 없음.
 * 16진수 공부
 * 문자 %c, 문자열 %s
 */
public class PrintfTest2 {

	public static void main(String[] args) {
		System.out.printf("테스트입니당 \n");
		System.out.printf("%d %x %o %c \n", 100, 100, 100, 100);
		System.out.printf("%#x %#X %#o \n", 100, 100, 100);
	//	System.out.printf("%c %c %c %c \n", '가','A','l','3');
	//	System.out.printf("%b \n", true);
		//System.out.printf("%f %e \n", 100.0, 100.0);
		System.out.printf("%.2f \n",123,5678);
		System.out.printf("|%s| \n", "자바");
		

	}

}
