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
		System.out.println("������ �ζǹ�ȣ - "+LottoNum[0]+", "+LottoNum[1]+", "+LottoNum[2]+", "+LottoNum[3]+", "+LottoNum[4]+", "+LottoNum[5]);

	}

}
