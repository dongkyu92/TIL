package day6;
/* Open API�� Ȱ���� ������ ��ó��, �ð�ȭ
 * �赿��
 * 12.10 printf
 * 
 * %d, %x %o %c <----���� ����
 * 8������ ���� ���� ����.
 * 16���� ����
 * ���� %c, ���ڿ� %s
 */
public class PrintfTest2 {

	public static void main(String[] args) {
		System.out.printf("�׽�Ʈ�Դϴ� \n");
		System.out.printf("%d %x %o %c \n", 100, 100, 100, 100);
		System.out.printf("%#x %#X %#o \n", 100, 100, 100);
	//	System.out.printf("%c %c %c %c \n", '��','A','l','3');
	//	System.out.printf("%b \n", true);
		//System.out.printf("%f %e \n", 100.0, 100.0);
		System.out.printf("%.2f \n",123,5678);
		System.out.printf("|%s| \n", "�ڹ�");
		

	}

}
