package day5;

/* Open API�� Ȱ���� ������ ��ó��, �ð�ȭ
 * �赿��
 * 12.09 2���� �迭 �ǽ�
 * ********************
 * char a2[]= new char[3];
 * a2[0] = ��. ...
 * �������� �Ҵ�
 * 
 * char a2[] = {'��'��'��'};
 * �ʱ�ȭ�� ���ÿ� �� �Ҵ�
 * 
 * �ΰ�������
 */


public class TwoArrayTest1 {

	public static void main(String[] args) {
		int a1[] = new int[10];
		char a2[] = {'��', '��','��'};
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
