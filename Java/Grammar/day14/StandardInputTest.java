package day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInputTest {

	public static void main(String[] args) throws Exception {// ���ο��� �߻��ϴ� ���ܸ� ��� �����ٴ�.
		System.out.print("�Է�: ");
		int input = new InputStreamReader(System.in).read();
		System.out.println("��� : "+(char)input);
		//System.in�� ��ǲ��Ʈ�� ��ü�ε� ������ ���δ°�.
		//��ǲ������ ��ü���� ���ڽ�Ʈ�� ��ü
		//�ѹ��ڸ� �д°Ŵ� �Ȱ���.
		
		String input2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
		System.out.println("��� : "+input2);
		//int input = System.in.read();
		//�ѱ��ڸ� ����(abc->a)
		//��ǲ��Ʈ�� ��ü, ����Ʈ��Ʈ�� ��ü�� 1byte��.
		//b0�� �׸���.
		//�ذ��� input ��Ʈ����ü���
		//System.in.read();�� throws IOException ����ó�� �� �ؾ� ��.
		//System.out.println("��� : "+(char)input);
	}

}
