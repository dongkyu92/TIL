/* Open API�� Ȱ���� ������ ��ó��, �ð�ȭ
 * �赿��
 * 12.09 �ζ� �ǽ�1
 * �迭 + ����
 * ********************
 * 1. Ŭ���� �̸��� ù ���ڴ� �׻� �빮�ڷ� �Ѵ�.
 * 2. ������ �޼��� �̸��� ù ���ڴ� �׻� �ҹ��ڷ� �Ѵ�.
 * 3. ���� �ܾ� �̸��� �ܾ��� ù ���ڸ� �빮�ڷ� �Ѵ�.
 * - ex) lastIndexOf, StringBuffer
 * 4. ����� �̸��� �빮�ڷ� �Ѵ�. �ܾ�� '_'�� �����Ѵ�.
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
			}while(hs.size()!=10); //size()��� ���� �Լ��� ����.
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
