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
package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class LottoMachine2 {

	public static void main(String[] args) {
		Random rand = new Random();
		HashSet<Integer> hs = new HashSet<>();

		do {
				hs.add(rand.nextInt(20)+10);
			}while(hs.size()!=10); //size()라는 좋은 함수가 있음.
		/*
		do {
			if(iterator.hasNext()==false) {
				hs.add(rand.nextInt(20)+10);
				num++;
				System.out.println(num);
			}
		}while(num<10);
		*/
		Iterator<Integer> iterator = hs.iterator();
		while(iterator.hasNext()) {
			int lottoNum = iterator.next();
			System.out.print(iterator.hasNext()? lottoNum+", ":lottoNum);
		}
	}

}
