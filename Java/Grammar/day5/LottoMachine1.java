/* Open API를 활용한 빅데이터 전처리, 시각화
 * 김동규
 * 12.09 로또 실습1
 * 배열 + 난수
 * ********************
 * 1. 클래스 이름의 첫 글자는 항상 대문자로 한다.
 * 2. 변수와 메서드 이름의 첫 글자는 항상 소문자로 한다.
 * 3. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다.
 * - ex) lastIndexOf, StringBuffer
 * 4. 상수의 이름은 대문자로 한다. 단어는 '_'로 구분한다.
 * - ex) PI, MAX_NUMBER
 */
package day5;

import java.util.Random;

public class LottoMachine1 {

	public static void main(String[] args) {
		int LottoNum[] = new int[6];
		Random rand = new Random();
		
		// LottoNum.length()
		for(int j= 0 ; j<6; j++) {
			LottoNum[j] = rand.nextInt(45);
					for(int k=j ; k>0; k--) {
						if(LottoNum[j]==LottoNum[k]) {
							LottoNum[j]=rand.nextInt(44)+1;
						}
					}
		}
		System.out.println("오늘의 로또번호 - "+LottoNum[0]+", "+LottoNum[1]+", "+LottoNum[2]+", "+LottoNum[3]+", "+LottoNum[4]+", "+LottoNum[5]);

	}

}
